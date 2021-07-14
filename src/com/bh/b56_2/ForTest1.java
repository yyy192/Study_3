package com.bh.b56_2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String [] args) {
		System.out.println("ForTest1 Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("Hello "+i);
		}
		
//		int num = 0;
//		for(int i=0;i<count;i++) {
//			System.out.println("Hello " + num);
//			num++;
//		} 변수 하나 더 써서 쓴 코드
		
		//for문만 사용하여 0 - 20미만 사이에 짝수만 출력
		for(int i = 0; i<20; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("==========");
		//for문, if문 사용하여 0-20미만 사이에 짝수만 출력
		for(int i=0; i<20; i=i+2) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("ForTest1 Finish");
	}

}
