package me.minho.springlecture.repository;

import me.minho.springlecture.domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member find(String id);
}
