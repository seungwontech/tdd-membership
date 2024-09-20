package com.lsw.atdd.tddmembership.membership.dto;

import com.lsw.atdd.tddmembership.membership.MembershipType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class MembershipAddResponse {

    private final Long id;
    private final MembershipType membershipType;

}