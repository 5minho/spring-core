package me.minho.springlecture.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(long id);
}
