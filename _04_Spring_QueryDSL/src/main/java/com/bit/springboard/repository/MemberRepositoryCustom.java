package com.bit.springboard.repository;

import com.bit.springboard.entity.Member;
import org.springframework.data.domain.PageRequest;

public interface MemberRepositoryCustom {
    Member searchOne(Long id);
    String searchUsername(Long id);
}
