package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Member;
import com.bookStore.repository.MemberRepostiory;

@Service

public class MemberService {
@Autowired
private MemberRepostiory mRepo;


	public void Save(Member m) {
		mRepo.save(m);
	}
	
	public List<Member> getAllMemeber(){
		return mRepo.findAll();
	}
}
