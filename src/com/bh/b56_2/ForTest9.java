package com.bh.b56_2;

import java.util.Scanner;

public class ForTest9 {
	public static void main(String[] args) {
		System.out.println("ForTest9 Start");
		Scanner sc = new Scanner(System.in);
		//30발이 있는 탄창이 3개
		//단발모드 1발, 점사모드 3발
		//1. 단발모드? 점사모드? 고르기
		//단발모드는 30번 점사모드는 10번 쏠 수 있음
		//단발모드일 경우 탕 30번 점사모드일 경우 타타탕 10번 추출

//		for(int tan =0 ; tan<3; tan++) {
//			System.out.println("1. 단발모드 2. 점사모드");
//			int select = sc.nextInt();
//			if (select == 1) {
//				for(int i=0;i<30;i++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int i=0;i<10;i++) {
//					System.out.println("타타탕");
//				}
//			}
//		}
		 
//		for(int tan =0 ; tan<3; tan++) {
//			System.out.println("1. 단발모드 2. 점사모드");
//			int select = sc.nextInt();
//			String sound = "탕";
//			int count = 30;
//			if (select!= 1) {
//				sound = "타타탕";
//				count = 10;
//			}
//		for(int i=0; i<count; i++) {
//			System.out.println(sound);
//		}
//	} //공부하기
		
		for(int tan =0 ; tan<3; tan++) {
			System.out.println("1. 단발모드 2. 점사모드");
		int select = sc.nextInt();
		String sound = "탕";
		int num = 1;
		
		if (select!= 1) {
			sound = "타타탕";
			num=3;
			}
		for(int i=0; i<30; i=i+num) {
			System.out.println(sound);
		}
	} //공부하기
		
		System.out.println("ForTest9 Finish");
	}

}
