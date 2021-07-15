package com.bh.b56_4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//11, 20, 32
		
		int num1 = 11;
		int num2 = 20;
		int num3 = 32;
		//numbers의 데이터타입은? int (X) int [] (O)
		int [] numbers = new int[3]; //집합 생성, 아직 모아진 것은 아님
		

		System.out.println(numbers);
		
		numbers[0] = 11;//int 타입
		numbers[1] = 20;//numbers[] 3개를 모으면 int타입 아님
		numbers[2] = 32;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("배열의 크기 : "+numbers.length);
		
		//3.12, 2.3, 4.123, 5.0 배열을 선언하고 데이터 대입
		double [] dots = new double[4];
		
		dots[0] = 3.12;
		dots[1] = 2.3;
		dots[2] = 4.123;
		dots[3] = 5.0;
		
		System.out.println("배열 크기 = "+dots.length);
		for(int i=0;i<4;i++) {
		System.out.println("출력 : "+dots[i]);	
		}
		
//		System.out.println(dots[4]);
//		오류나는 코드 - dots[4]는 존재하지 않기 때문에
		
		//문자열을 담을 배열 3칸짜리 생성
		//모두 출력
		
		String [] strings = new String[3];
		
//		strings[0] = "백현아";
//		strings[1] = "사랑해";
//		strings[2] = "보고싶어";
		
		for(int i=0;i<3;i++) {
			System.out.println(strings[i]);
		}
		
		//Scanner를 담을 배열 2칸짜리 생성
		//모두 출력
		Scanner [] names = new Scanner[2];
		System.out.println(names[0]);
		System.out.println(names[1]);
		
	}

}
