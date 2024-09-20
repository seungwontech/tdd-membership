package com.lsw.atdd.tddmembership.membership.dto;

import com.lsw.atdd.tddmembership.membership.MembershipType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@RequiredArgsConstructor
public class MembershipDetailResponse {

    private final Long id;
    private final MembershipType membershipType;
    private final LocalDateTime createdAt;
    private final Integer point;

}