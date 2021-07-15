package com.bh.b56_4;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		
		//ar1[3] 추가하고싶음
		//깊은 복사(배열 복사) 응용
		int [] ar2 = new int[ar1.length + 1];
		
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=(i+1);
			System.out.println("ar2["+i+"] = "+ar2[i]);
		}
		
		System.out.println("===========");
		
		ar1 = ar2;
		
		for(int i=0; i<ar2.length;i++) {
			
			System.out.println("ar1["+i+"] = "+ar1[i]);
			
			}
			
		}


	}
