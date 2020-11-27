package com.care.root.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;
	
	@Override
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}
	
	@Override
	public void memberList(Model model) {
		model.addAttribute("list", dao.memberList());
	}
}
