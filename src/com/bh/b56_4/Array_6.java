package com.bh.b56_4;

import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {3, 5, 1, 7, 4};
		int bincan = 0;
		int index = 0;
		//정렬
		//1. 높은 것에서부터 낮은 것으로 : 내림차순 desc
		//2. 낮은 것에서부터 높은 것으로 : 오름차순 asc
		
		for(index = 0;index<(ar.length-1);index++) {
			for(int i=(index+1);i<ar.length;i++) {
				if(ar[index]<ar[i]) {
					bincan = ar[index];
					ar[index]=ar[i];
					ar[i]=bincan;
				}
		
			}
		}

		for(int j=0;j<ar.length;j++) {
			System.out.println(ar[j]);
		}
	}

}
