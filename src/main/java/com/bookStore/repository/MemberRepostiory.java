package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.Member;

@Repository
public interface MemberRepostiory   extends JpaRepository<Member,Integer>{
	

}
