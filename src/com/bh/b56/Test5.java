package com.bh.b56;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST5 START ====");
		Scanner sc = new Scanner(System.in);
	
		//회원가입시 입력한 ID
		int id = 04;
		
		//회원가입시 입력한 PW
		int pw = 9256;
		
		System.out.println("ID를 입력하세요.");
		//ID 입력 후 저장
		int id2 = sc.nextInt();
		
		System.out.println("PW를 입력하세요.");
		//PW 입력 후 저장
		int pw2 = sc.nextInt();
		
		//로그인 성공하면 - 로그인 성공 출력
		//로그인 실패하면 - 출력 끝내기
		if(id==id2 && pw==pw2) {
			
			System.out.println("로그인을 성공하였습니다!");
			
		}
		
		/** if문 두 개 표현
		 if(id==id2) {
			
			if(pw==pw2) {
				
				System.out.pritnln("로그인을 성공하였습니다!");
			}
		  } **/
		
		System.out.println("==== TEST5 FINISH ====");
	}

}
