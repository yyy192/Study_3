package com.bh.b56;

public class Test10 {
	
	public static void main(String [] args) {
		System.out.println("test10 start");
		
		int select = 56;
		
		if(select == 1) {
			System.out.println("입금");
		}else if(select == 2) {
			System.out.println("출금");
		}else if(select == 3) {
			System.out.println("이체");
		}else {
			System.out.println("조회");
		}
		
		System.out.println("test10 finish");
	}

}
