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
		
//		for(int i=0;i<ar2.length;i++) {
//			ar2[i]=i;
//			System.out.println("ar2["+i+"] = "+ar2[i]);
//		}
//		
//		for(int i = 0; i<ar1.length;i++) {
//			ar2[i] = ar1[i];
//		}
//		ar2[ar1.length] = 5;
//		
//		System.out.println("===========");
//		
//		ar1 = ar2;
//		
//		for(int i=0; i<ar2.length;i++) {
//			
//			System.out.println("ar1["+i+"] = "+ar1[i]);
//			
//			}
// 위에는 내가 한 코드인데 값은 나오지만 응용 하려면.. 밑에 강사님처럼
			
		for(int i = 0; i<ar1.length;i++) {
			ar2[i] = ar1[i]; 
			//내가 임의로 값을 넣는게 아니라 ar1의 값을 그대로 복사하는거야
		}
		ar2[ar1.length] = 5;
		
		ar1 = ar2;
		
		//ar2의 주소를 그대로 복사해왔기 때문에
		//현재 ar1의 주소길이 = ar2의 주소길이
		//따라서 4칸이 된다.
		for(int i=0;i<ar1.length;i++) {
			System.out.println("ar1["+i+"] = "+ar1[i]);
		}
	}


	}
