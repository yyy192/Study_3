package com.bh.b56_4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ids = {1234, 4567, 9256, 5060};
		int [] pws = {1111, 2222, 3333, 4444};
		
		//1. 로그인 2. 회원가입 3. 종료  출력
		//로그인은 아이디,비번 입력받기
		//회원가입은 아이디,비번 배열에 추가하기(중복x)
		
		//로그인 성공 후
		//메인메뉴 출력 1. 로그아웃 2. 회원탈퇴 3. 종료
		//로그아웃 누르면 다시 1. 로그인 2. 회원가입 3. 종료 출력
		//회원탈퇴 누르면 로그인 한 아이디, 비밀번호 삭제
		
		int total = 0;
		int uids = 0;
		int upws = 0;
		int [] nids;
		int [] npws;
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			total = sc.nextInt();
			
			switch(total) {
				case 1:
					
					System.out.println("ID를 입력");
					uids = sc.nextInt();
					System.out.println("PW를 입력");
					upws = sc.nextInt();
					String fale = "로그인 실패";
					for(int i=0;i<ids.length;i++) {
						if(uids==ids[i] && upws==pws[i]) {
							fale = "로그인 성공";
							break;
						}
					}
					System.out.println(fale);
					
					break;
				case 2:
					int n = 0;
					
					System.out.println("새로운 ID를 입력");
					nids = new int[ids.length+1];
					nids[ids.length] = sc.nextInt();
					for(int a=0; a<ids.length;a++) {
						nids[a] = ids[a];
					}
					
					for(int j=0;j<ids.length;j++) {
						if(nids[ids.length]==ids[j]) {
							System.out.println("이미 있는 ID 입니다.");
							System.out.println("회원 가입 실패");
							n = 1;
						break;
						}
					}	
					
					if (n==1) {
						break;
					}else {
						System.out.println("새로운 PW를 입력");
						npws = new int [pws.length+1];
						npws[pws.length] = sc.nextInt();
						for(int b=0;b<pws.length;b++) {
							npws[b] = pws[b];
						}
					
						ids = nids;
						pws = npws;
					}
					
					break;
				case 3:
					System.out.println("종   료");
					flag = false;
					break;
				default:
					System.out.println("번호를 잘못 입력");
					System.out.println("다시 입력");
					break;
			}
		}
		
	}

}
