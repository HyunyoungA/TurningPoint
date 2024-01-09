package com.TP.TurningPoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.TP.TurningPoint.domain.Member;
import com.TP.TurningPoint.service.MemberService;

@SessionAttributes("member")
@Controller
public class MemebrController {
	
//	@Autowired
//	private MemberService memberService;
//	
	@GetMapping("/login")
	public String loginView() {
		return "loginPage";
	}
	
	@GetMapping("/join")
	public String joinView() {
		return "joinPage";
	}
	
	@GetMapping("/findId")
	public String findIdView() {
		return "findId";
	}
	
	@GetMapping("/findPassword")
	public String findPasswordView() {
		return "findPassword";
	}
	
//	@PostMapping("/login")
//	public String login(Member member, Model model) {
//		Member findMember = memberService.getMember(member);
//		
//		if(findMember != null && findMember.getPassword().equals(member.getPassword())) {
//			model.addAttribute("member", findMember);
//			return "forward:getBoardList";
//		} else {
//			return "redirect:login";
//		}
//	}
}
