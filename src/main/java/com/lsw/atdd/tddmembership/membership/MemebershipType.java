package com.lsw.atdd.tddmembership.membership;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemebershipType {
    NAVER("네이버")
    , LINE("라인")
    , KAKAO("카카오");

    private final String companyName;
}
