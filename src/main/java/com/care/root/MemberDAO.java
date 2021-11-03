package com.care.root;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("DAO 생성자 실행");
	}
	public int insert() {
		System.out.println("저장 성공");
		return 1;
	}
}
