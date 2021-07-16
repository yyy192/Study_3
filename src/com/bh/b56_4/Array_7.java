package com.bh.b56_4;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// 한 학생의 정보 = 이름, 번호, 국어, 영어, 수학, 총점, 평균
		// 3명
		String [] names = new String[3];
		names[0] = "BAEKHYUN";
		names[1] = "kYOONG";
		names[2] = "BAEKU";
		
		int [] nums = new int [3];
		nums[0] = 5;
		nums[1] = 29;
		nums[2] = 2;
		
		//이름하고 번호들을 출력
		//번호 순서대로 출력
		int bincan = 0;
		
		for(int idx=0;idx<(nums.length-1);idx++) {
			for(int i=(idx+1);i<nums.length;i++) {
				if(nums[idx]<nums[i]) {
					bincan = nums[idx];
					nums[idx] = nums[i];
					nums[i] = bincan;
				
				
					//이름 자리바꾸기
					String t = names[idx];
					names[idx] = names[i];
					names[i] = t;
				}
			}
		}
		for(int i=0; i<nums.length;i++) {
			System.out.println("==========");
			System.out.println(nums[i]);
			System.out.println(names[i]);
			System.out.println("==========");
		}
		

	}

}
