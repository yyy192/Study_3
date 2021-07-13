package com.bh.b56;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST4 START ====");
		System.out.println(" ");
		
		/* 10대 유,무 판별
		 나이가 10 ~ 19살 사이인 사람
		 나이를 입력받고
		 10대면 청소년 출력하고 종료
		 아니면 그냥 종료*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
		//나이를 담을 변수 선언
		//키보드로 숫자를 선언 받음
		int age = sc.nextInt();
		
		/* if(age<20) {
			
			if(age>=10) {
				
				System.out.println("청소년입니다!");
				
			}
			
		  } */
		
		// 논리 연산자 사용하여 한 줄로 표현하기
		// &&는 and 연산자
		if(age>=10 && age<20) {
			
			System.out.println("청소년입니다!");
			
		}
		
		System.out.println(" ");
		System.out.println("==== TEST4 FINISH ====");
		
	}

}
