//pageDto는 정확히 말하면 페이지 정보가 아니라 "페이지네이션"의 정보
//즉 현재 페이지 상태에서 페이지네이션(네비게이션 숫자바)가 어떻게 표시될지를 결정하는 객체
//당연히 현재 페이지 번호를 담고있는 cri객체와 총 게시물 수 total이 필요

package com.bit.springboard.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDto {
    private int startPage;
    private int endPage;
    private boolean prev, next;
    private int total;
    private Criteria cri;

    public PageDto(Criteria cri, int total) {
        this.cri = cri;
        this.total = total;

        this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
        this.startPage = this.endPage - 9;

        int realEndPage = (int)(Math.ceil((total / 1.0) / cri.getAmount()));

        if(endPage > realEndPage) {
            this.endPage = realEndPage;
        }

        this.prev = this.cri.getPageNum() > 1;
        this.next = this.cri.getPageNum() < this.endPage;
    }
}
