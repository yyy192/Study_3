package com.bh.b56_2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String [] args) {
		System.out.println("ForTest6 Start");
		Scanner sc = new Scanner(System.in);
		
		//회원가입시 입력한 ID
		int id = 1992;
		//회원가입시 입력한 PW
		int pw = 56;
		
		boolean flag = false;
		
		//내가 입력할 ID
		int id2 = 0;
		//내가 입력할 PW
		int pw2 = 0;
		
		//최대 5번의 로그인 기회
		//1. 최대 5번 로그인 시도
//		for(int i=0;i<5;i++) {
//			System.out.println("ID, PW를 입력하시오.");
//			System.out.println("↓ ID ↓");
//			id2 = sc.nextInt();
//			System.out.println("↓ PW ↓");
//			pw2 = sc.nextInt();
//			
//		//5번 넘으면 강제종료
//			if(id==id2 && pw==pw2) {
//				System.out.println("로그인 성공 :-> ");
//				break;
//			}
//				System.out.println("로그인 실패 :-< , ");
//				
//		}//for문의 끝
		
		//2. for문 종료된 후 로그인성공, 실패 출력
		//for문 종료 조건 : 로그인 성공, 5번의 로그인 기회 모두 실패
		
		for(int i=0;i<5;i++) {
			System.out.println(i+1+"번째 시도");
			System.out.println("ID, PW를 입력하시오.");
			System.out.println("↓ ID ↓");
			id2 = sc.nextInt();
			System.out.println("↓ PW ↓");
			pw2 = sc.nextInt();
			
			if(id==id2&&pw==pw2) {
				System.out.println(i+1+"번째 시도 성공");
				System.out.println(" ");
				flag = !flag;//true
				break;
//실행안됨			System.out.println("Error!"); 
			}
			System.out.println(i+1+"번째 시도 실패");
			System.out.println(" ");
			

		
		}
		//flag = true 면 로그인 성공, flase면 로그인 실패
		if(flag) {
			System.out.println("로그인 성공 :->");
		}else {
			System.out.println("로그인 실패. 은행에 방문하세요 :-< ");
			
		}
		
		System.out.println("ForTest6 Finish");
	}

}
