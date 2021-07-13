package com.bh.b56;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST6 START ====");

/*	
		int num = 4;
		
		if (num%2 == 0) {
			System.out.println("짝수입니다!");
		} else {
			System.out.println("홀수입니다!");
		}
		
*/	
		//kor, eng, math 입력
		//총점, 평균 계산
		//평균이 60점이상이면 합격 아니면 불합격 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+avg+"점 입니다.");
		
		
/*
 		if (avg>=60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다..");
		}
*/
		String result = "불합격";
		if (avg>=60) {
		
		result = "합격";
		
		}
		System.out.println("합격? 불합격? : " +result);
		
		System.out.println("==== TEST6 FINISH ====");
	}

}
