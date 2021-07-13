package com.bh.b56;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String [] args) {
		
		System.out.println("==== TEST8 START ====");
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0;
		
		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3.0;
		System.out.println("총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+avg+"점 입니다.");
		
		//합격 기준
		//평균이 60점 이상
		//과목당 40점 이상
		//합격, 불합격 출력
		String result = "불합격";
		
		if(kor>=40 && eng>=40 && math>=40) {
			if (avg>=60) {
				result = "합격";
			}
		}
		 
		System.out.println(result);
		
		System.out.println("==== TEST8 FINISH ====");
		
/** if-else문
		 if(avg>=60) {
		 	if(kor>=40) {
		 		if(eng>=40) {
		 			if(math>=40) {
				System.out.println("합격");
				}else {
					System.out.println("수학 과락 불합격");
				}
			} else {
					System.out.println("영어 과락 불합격");
				}
			} else {
				 System.out.println("국어 과락 불합격");
			}
		 }else {
		 System.out.println("불합격");
		 }
**/

//&& 사용한 if-else문 1
//		if(avg=60) {
//			if(kor>=40 && eng>=40 && math>=40) {
//				System.out.println("합격"); 
//		  }
//		}else {
//			System.out.println("불합격"); 
//		}
		
//	&&를 사용한 if-else문 2
//		if(avg>=60 && kor>=40 && eng>=40 && math>=40 ) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}

		
	}

}
