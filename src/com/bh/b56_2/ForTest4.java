package com.bh.b56_2;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String [] args) {
		System.out.println("ForTest4 Start");
		Scanner sc = new Scanner(System.in);
		//1+2+3+...+10000000=??
		//1+2+3+4+5=15
		int sum = 0;

//		sum = sum + 1;//1
//		sum = sum + 2;//3
//		sum = sum + 3;//6
//		sum = sum + 4;//10
//		sum = sum + 5;//15
//		System.out.println("Sum = "+sum);
		
		//반복문 사용 1+2+3+..+10=?
		for(int i=1;i<11;i++) {
			sum=sum+i;
			
			if(i==10) {
				System.out.println("Sum = "+sum);
			}
		}
		
		//반복문 사용, 1+2+3+...+a=? a를 입력받아 계산하기
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			sum = sum + a;
					if(i==a) {
						System.out.println("SUM = "+sum);
					}
		}
		
		System.out.println("ForTest4 Finish");
	}

}
