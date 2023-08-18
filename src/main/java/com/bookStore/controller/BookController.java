package com.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Member;
import com.bookStore.service.MemberService;

@Controller
public class BookController {
	
	@Autowired
	public MemberService mService;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/New_Member")
		public String NewMemberRegister() {
			return"NewMember";
		}
	
	@GetMapping("/Available_Books")
	public String getAllbooks() {
		return"booksList";
	}
	
	/*@GetMapping("/Member_list")
	public String MemberList() {
		return "MemberList";
	}*/
	
	// for New Member Registration Method
	@PostMapping("/save")
	public String AddMember(@ModelAttribute Member m) {
		mService.Save(m);
		return "redirect:/Member_list";
	
		}
	@GetMapping("/Member_list")
	public ModelAndView getAllMemeber() {
		List<Member>list=mService.getAllMemeber();
		ModelAndView m=new ModelAndView();
		//m.setViewName("MemberList");
		//m.addObject(m)
		return new ModelAndView("MemberList","Member",list);
	}
	
	
	
}

