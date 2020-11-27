package com.care.root.member.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.root.member.dto.MemberDTO;

@Service
public interface MemberService {
	public void insertMember(MemberDTO dto);
	public void memberList(Model model);
}
