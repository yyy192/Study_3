package com.bh.b56_2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int sec = 0;
		int ymin = 0;
		int ysec = 0;
		
		System.out.println("분을 입력하세요.");
		ymin = sc.nextInt();
		System.out.println("초를 입력하세요.");
		ysec = sc.nextInt();
		
		//시계 분 초 출력
		//0분 0초 ~ 0분 59초
		//분, 초를 입력
		//내가 입력한 분,초가 되면 종료가 되도록
/**
		boolean flag = false;
		for(min=0;min<60;min++) {
			for(sec=0;sec<60;sec++) {
				System.out.println(min+"분 "+sec+"초 입니다.");
				
				if(min==ymin && sec == ysec) {
					System.out.println("종료");
					flag = true;
					break;
				}
			}
		if(flag) {
			break;
			}
		}
 boolean 이용 **/

/**
 		for(min=0;min<60;min++) {
			for(sec=0;sec<60;sec++) {
				System.out.println(min+"분 "+sec+"초 입니다.");
				
				if(min==ymin && sec == ysec) {
					System.out.println("종료");
					break;
				}
			}
		min = 60;
		}
 break 이용 **/
		
		for(min=0;min<60;min++) {
			for(sec=0;sec<60;sec++) {
				System.out.println(min+"분 "+sec+"초 입니다.");
				
				if(min==ymin && sec == ysec) {
					System.out.println("종료");
					min=60;
					sec=60;
				}
			}
		}

		System.out.println("ForTest8 Finish");
	}

}
