package com.bh.b56_4;

public class Array_3 {

	public static void main(String[] args) {

		int [] ar1 = new int[2];
		ar1[0] = 10;
		ar1[1] = 20;
		
		int [] ar2;
		//얕은 복사 - 주소만 가져옴
		ar2 = ar1; //같은 int 배열 타입
		
		System.out.println(ar2[0]); //예상 10
		
		ar1[1] = 1111;
		//깊은 복사 - 배열. 가져옴
		System.out.println(ar2[1]); //예상 1111
		
		int [] ar3 = new int[ar1.length];
		System.out.println(ar3[0]); //예상 0
		
		for(int i=0;i<ar1.length;i++) {
			ar3[i]= ar1[i];
		}
	
		System.out.println(ar3[0]);//예상 10
		
		ar1[0] = 2222;
		System.out.println(ar3[0]);//예상 10
		
		
	}

}
