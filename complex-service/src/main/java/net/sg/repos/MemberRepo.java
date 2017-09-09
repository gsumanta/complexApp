package net.sg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sg.beans.Member;

public interface MemberRepo extends JpaRepository<Member, Long> {

}
