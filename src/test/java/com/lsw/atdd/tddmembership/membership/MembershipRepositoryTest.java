package com.lsw.atdd.tddmembership.membership;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MembershipRepositoryTest {
    @Autowired
    private MembershipRepository membershipRepository;

    @Test
    public void MembershipRepository가Null이아님(){
        assertThat(membershipRepository).isNotNull();
    }
}
