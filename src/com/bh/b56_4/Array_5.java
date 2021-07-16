package com.bh.b56_4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1. 정보출력 2. 정보추가 3. 정보삭제 4. 종료
		//Scanner로 1~4 중 하나 입력받고 다시 1. 2. .. 4.로 돌아가기
		//4. 종료 눌렀을 때 반복문 끝나

		boolean flag = true;
//		int [] ar = {45, 56, 67};
//		위의 식과 아래 식과 같은 뜻
		int [] ar1 = new int[3];
		ar1[0] = 45;
		ar1[1] = 56;
		ar1[2] = 67;
		int [] ar2;
		int [] ar3;
		int [] ar4;
		
		//1번 눌렀을 경우 배열의 정보 출력
		//2번 눌렀을 경우 Array_4처럼 칸 하나 추가
		//3번 눌렀을 경우 칸 하나 삭제합니다
		//3번 계속 눌러서 더이상 추가할 칸 없을 경우
		//더이상 삭제할 정보가 없습니다. 출력하기
		//4번 눌렀을 떄 삭제할 인덱스 번호 입력받고 삭제하기
		
		while(flag) {
			System.out.println("1. 정보출력 2. 정보추가 3. 정보삭제 4. 삭제할 정보선택 5. 종   료");
			System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
			System.out.println("번호를 입력하세요.");
			int num = sc.nextInt();
			
			//if-else문의 경우 {}끝나면 그 조건문도 끝나는 것이기 때문에
			//ar2변수로 계속 써도 중복이라 인식하지 않음.
			//switch문의 경우 새로운 변수 선언 안하면 중복이라 인식하기때문에
			//새로운 변수 선언 필수!!
			if(num==1) {
				if(ar1.length==0) {
					System.out.println("출력할 정보가 없습니다.");
				}else {
					System.out.println("정보를 출력합니다.");
				}
				for(int i=0;i<ar1.length;i++) {
					System.out.println(ar1[i]);

				}
			}else if(num==2) {
				System.out.println("정보를 추가합니다.");
				ar2 = new int[ar1.length+1];
				for(int i=0;i<ar1.length;i++) {
					ar2[i] = ar1[i];
				}
				System.out.println("새로운 정보 입력");
				ar2[ar1.length] = sc.nextInt();
				ar1 = ar2;
			}else if(num==3) {
				if(ar1.length==0) {
					System.out.println("더 이상 삭제할 정보가 없습니다.");
					System.out.println("정보를 추가하거나 프로그램을 종료하세요.");
					continue;//증감식으로 바로 올라가기
				}else {
					System.out.println("정보를 삭제합니다.");
				}
				ar3 = new int[ar1.length-1];
				for(int i=0;i<(ar1.length-1);i++) {
					ar3[i] = ar1[i];
				}
				ar1 =ar3;
			}else if(num==4){
				int c = 0;
	
				if(ar1.length==0) {
					System.out.println("더 이상 삭제할 인덱스가 없습니다.");
					System.out.println("인덱스를 추가하거나 프로그램을 종료하세요.");
					continue;
				}
				
				System.out.println("삭제할 인덱스를 입력하세요.");
				c=sc.nextInt();
				
				if(c>=ar1.length || c<0) {
				System.out.println("해당 정보는 범위를 벗어났습니다.");
				continue;
				}
				
				ar4 = new int[ar1.length-1];
				int index = 0;
				
				for(int i=0;i<ar1.length;i++) {
					if(c==i) {
						continue;
					}
					ar4[index] = ar1[i];
					index++;
				}
				ar1=ar4;
			}else if(num==5) {
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
			}else {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		}
		System.out.println("﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌﹌");
		System.out.println("FINISH (//•ᴗ•//)੭⁾⁾");
	}

}
