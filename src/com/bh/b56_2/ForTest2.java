package com.bh.b56_2;

public class ForTest2 {
	
	public static void main(String [] args) {
		System.out.println("ForTest2 Start");
		
		System.out.println("증감연산자");
		int num = 0;
		++num;
		System.out.println(num);//1
		num++;
		System.out.println(num);//2
		
		int check1 = ++num;
		System.out.println("Num : "+num); //3
		System.out.println("Check1 : "+check1); //3
		
		check1 = num++;
		System.out.println("Num : "+num);//4
		//3을 먼저 check1에 대입하고 그 다음 후행연산 진행
		//따라서 check1은 4가 아니라 3
		System.out.println("Check1 : "+check1);
		
		System.out.println(++num);//5
		//출력 먼저 하고 num++진행
		//그래서 출력 값은 5
		//다음 출력을 할 경우에야 num이 6으로 나옴
		System.out.println(num++);//5
		System.out.println(num); //6
		System.out.println("ForTest2 Finish");
	}

}
