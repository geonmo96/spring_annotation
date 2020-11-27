package com.care.root.member.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.care.root.member.dto.MemberDTO;

@Repository
public interface MemberDAO {
	@Insert("insert into test_jdbc(id, name) values(#{id}, #{name})")
	public void insertMember(MemberDTO dto);
	
	@Select("select * from test_jdbc")
	public ArrayList<MemberDTO> memberList();
}
