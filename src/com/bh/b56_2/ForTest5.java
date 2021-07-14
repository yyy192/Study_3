package com.bh.b56_2;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String [] args) {
		System.out.println("ForTest5 Start");
		Scanner sc = new Scanner(System.in);
		
		//총점, 평균 변수 선언
		int sum = 0;
		double avg = 0;
		
		//과목 수를 담을 변수
		int stu = 0;
		
		//과목 수 입력
		System.out.println("과목 수를 입력하세요.");
		stu = sc.nextInt();
		
		//과목 수만큼 점수 입력
		for(int i=0;i<stu;i++) {
			System.out.println(i+1+"번째 과목 점수를 입력하세요.");
			
			int a = sc.nextInt();
			sum = sum+a;
		}
		
		//총점,평균 계산 후 출력
		System.out.println("총점은? " + sum);
		avg = (double)sum/stu;
		System.out.println("평균은? "+avg);
		
		System.out.println("Fortest5 Finish");
	}

}
