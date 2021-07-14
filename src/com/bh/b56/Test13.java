package com.bh.b56;

import java.util.Scanner;

public class Test13 {
	
	public static void main(String [] args) {
		System.out.println("test13 start");
		
		//요금조회는 1번
		//상품가입은 2번
		//고장신고는 3번
		//상담원연결은 0번
		//그 외 나머지는 잘못 누르셨습니다. 다시 선택해 주세요.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원연결은 0번입니다.");
		System.out.println("번호를 누르세요.");
		num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("요금 조회를 누르셨습니다.");
			break;
		case 2:
			System.out.println("상품 가입을 누르셨습니다.");
			break;
		case 3:
			System.out.println("고장 신고를 누르셨습니다.");
			break;
		case 0:
			System.out.println("상담원 연결을 도와드리겠습니다.");
			break;
		default :
			int num2 = 10;
			System.out.println("잘못 누르셨습니다. 다시 선택해 주세요.");
			break;
			
		}
		if (num>0) {
			int num3 = 20;
			System.out.println(num3);
		}
		
//		System.out.println(num2);
//		System.out.println(num3);
		System.out.println("test13 finish");
	}

}
