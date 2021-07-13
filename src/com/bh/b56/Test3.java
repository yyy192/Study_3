package com.bh.b56;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST3 START ====");
		System.out.println(" ");
		
		/** 쇼핑몰의 총 주문금액 입력
		 주문금액이 30,000원 이하면 배송비 3,000원 추가 아니면 배송비 없음
		
		 총 주문금액 출력
		 ex) 주문금액 : 25,000원 -> 총 28,000원
		     주문금액 : 35,000원 -> 총 35,000원 **/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문금액을 입력하세요.");
		
		//주문 금액을 담을 변수
		int buy = sc.nextInt();
		
		if (buy<=30000) {
			
			buy = buy + 3000; //배송비 추가
		}
		
		System.out.println("총 금액 : " +buy+"원");
		System.out.println(" ");
		System.out.println("==== TEST3 FIINSH ====");
	}

}
