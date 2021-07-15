package com.bh.b56_4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목의 수 입력 하기");
		int c = sc.nextInt();
		
		int [] nums = new int[c];
		
		//각 인덱스번호에 숫자 입력
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+1+"번째 과목 점수를 입력하세요.");
			nums[i] = sc.nextInt();
		}

		int sum = 0;
		double avg = 0;
		
		//index 0으로 시작, 1씩 증가
		for(int i = 0; i<nums.length; i++) {
			System.out.println(i+1+"번째 과목 점수 = "+nums[i]);
			sum += nums[i];
		}
		
		avg = (double)sum/c;
		System.out.println("총 점수 = "+sum+"점");
		System.out.println("평균 점수 = "+avg+"점");
		
	}

}
