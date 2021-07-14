package com.bh.b56;

import java.util.Scanner;

public class Test11 {
	
	public static void main(String [] args) {
		System.out.println("test11 start");
		
		//국어, 영어, 수학을 Scanner통해 입력
		//총점, 평균 계산
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그 외 나머지는 F를 출력
		
		Scanner sc = new Scanner(System.in);		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0;		

		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3.0;
		
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+avg+"점 입니다.");
		
		if(avg>=90) {
			
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("test11 finish");
	}

}
