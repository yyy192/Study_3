package com.bh.b56_2;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String [] args) {
		System.out.println("ForTest3 Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("종료 시간을 입력하세요.");
		int end = sc.nextInt();
		
		//종료 시간을 입력 받기
		//12sec
		//0s, 1s, ... , 12s -end-
		//단, 60이라는 상수는 변경 불가능

		for(int sec = 0;sec<60;sec++) {

// 보조문 break
//			System.out.println("초를 입력하세요 = "+sec+"sec");
//				if (sec==end) {
//					break;
//				}
				System.out.println("초를 입력하세요 = "+sec+"sec");
				if (sec==end) {
					sec = 60;//60대신 59넣어도 ok
				}
		}
		
		System.out.println("ForTest3 Finish");
	}

}
