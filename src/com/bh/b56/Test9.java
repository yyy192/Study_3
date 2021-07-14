package com.bh.b56;

public class Test9 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST9 START ====");
		
		boolean check = true;
		
		check = !check;
		if(!check) {
			System.out.println("Test"); 
//check는 false인데 또 거기서 !을 해줬기때문에 true로 바뀜 -> 출력
		}
		System.out.println(check);
		
		//삼항연산자
		//조건식 ? true일 때 실행 : false일 때 실행
		int age = 30; //백현이나이★
		String result = age>19 ? "성년★" : "미성년★";
		System.out.println("RESULT : "+result);
		System.out.println(3+2);
		
		
		System.out.println(1+"1");//11 - 문자열11
		System.out.println(2*1+"1");//21 - 문자열21
		System.out.println("1"+1*3);//13 - 문자열13
		System.out.println('1'+"1");//11 - 문자열11
		System.out.println(1+'1'+"1");//501
		//1 = int(4byte), '1' = char(2byte), "1" = string
		//'1'이 char에서 int로 형변환 '1'은 숫자 49
		//1+49+"1" = 501 - 문자열
		
		System.out.println("==== TEST9 FINISH ====");
	}

}
