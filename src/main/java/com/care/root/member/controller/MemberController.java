package com.care.root.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	/* 객체 생성 테스트
	@Autowired
	DriverManagerDataSource dataSources;
	
	@GetMapping("test")
	public void test() {
		System.out.println("빈 등록 : " + dataSources);
	}
	*/
	@Autowired
	MemberService ms;
	
	@GetMapping("memberview")
	public String memberview(Model model) {
		ms.memberList(model);
		return "memberview";
	}
	
	@PostMapping("insert")
	public String insert(MemberDTO dto) {
		ms.insertMember(dto);
		return "redirect:index";
	}
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("insertview")
	public String insertview() {
		return "insertview";
	}
}
