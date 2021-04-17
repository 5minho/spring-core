package me.minho.springlecture.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceImplTest {

    @Test
    public void joinTest() {
        // given
        MemberService memberService = new MemberServiceImpl();
        Member joinMember = new Member(1L, MemberGrade.BASIC);
        memberService.join(joinMember);

        // when
        Member findMember = memberService.findMember(1L);

        // then
        assertThat(joinMember).isEqualTo(findMember);
    }

}