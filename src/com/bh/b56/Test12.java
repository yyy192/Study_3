package com.bh.b56;

public class Test12 {
	
	public static void main(String [] args) {
		System.out.println("테스트12 시작");
		
		int num = 1;
		
		switch(num*3+1) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 4");
			break;
		default:
			System.out.println("그 외 나머지");
			break;
		}
		
		System.out.println("테스트12 끝");
	}

}
