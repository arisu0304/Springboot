// Cri 객체는 페이지네이션 보다도 실제 현 페이지의 넘버와
// 페이지 당 몇개의 파일을 불러올지를 결정하는 객체
// 이때 startNum은 둘 을 조합해서 DB에서 몇번째 로우부터 가져올지 결정

package com.bit.springboard.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
    private int pageNum;
    private int amount;
    private int startNum;

    public Criteria() {
        this(1, 10);
    }

    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
}
