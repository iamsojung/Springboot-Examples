package com.sojung.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sojung.board.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
}
