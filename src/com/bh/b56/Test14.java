package com.bh.b56;

public class Test14 {
	
	public static void main(String [] args) {
		System.out.println("test14 start");
		
		//평균을 이용해서 A, B, C, D, F
		//switch문 이용해서
		int avg = 100;
		
/** 노가다 방법 - 완전 효율 개똥(울애기 똥 아님ㅎ)
  		
		switch(avg) {
		case 90:
			System.out.println("A");
			break;
		case 91:
			System.out.println("A");
			break;
		case 92:
			System.out.println("A");
			break;
		case 93:
			System.out.println("A");
			break;
		case 94:
			System.out.println("A");
			break;
		case 95:
			System.out.println("A");
			break;
		case 96:
			System.out.println("A");
			break;
		case 97:
			System.out.println("A");
			break;
		case 98:
			System.out.println("A");
			break;
		case 99:
			System.out.println("A");
			break;
		case 100:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 81:
			System.out.println("B");
			break;
		case 82:
			System.out.println("B");
			break;
		case 83:
			System.out.println("B");
			break;
		case 84:
			System.out.println("B");
			break;
		case 85:
			System.out.println("B");
			break;
		case 86:
			System.out.println("B");
			break;
		case 87:
			System.out.println("B");
			break;
		case 88:
			System.out.println("B");
			break;
		case 89:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		case 71:
			System.out.println("C");
			break;		
		case 72:
			System.out.println("C");
			break;
		case 73:
			System.out.println("C");
			break;
		case 74:
			System.out.println("C");
			break;
		case 75:
			System.out.println("C");
			break;
		case 76:
			System.out.println("C");
			break;
		case 77:
			System.out.println("C");
			break;
		case 78:
			System.out.println("C");
			break;
		case 79:
			System.out.println("C");
			break;
		case 69:
			System.out.println("D");
			break;
		case 68:
			System.out.println("D");
			break;
		case 67:
			System.out.println("D");
			break;
		case 66:
			System.out.println("D");
			break;
		case 65:
			System.out.println("D");
			break;
		case 64:
			System.out.println("D");
			break;
		case 63:
			System.out.println("D");
			break;
		case 62:
			System.out.println("D");
			break;
		case 61:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}   **/
		
		switch(avg/10) {
		
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		
		} //으아아아아아 풀었드앙아아아ㅏ!!!!
		
		System.out.println("test14 finish");

	}
}
