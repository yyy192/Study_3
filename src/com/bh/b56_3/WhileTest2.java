package com.bh.b56_3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("*•.¸♡ WhileTest2 Start ♡¸.•*");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in); 
		int id = 92;
		int pw = 56;
		int yid = 0;
		int ypw = 0;
		boolean check = true;
		// 1. 로그인 - id, pw 입력 -> 로그인 판단
		// 로그인 판단에서 틀리면 id, pw입력으로 가는게 아니라 1.로그인 2.종료 창으로
		// 2. 종료
		
		while(check) {
			System.out.println("1. 로그인 2. 종료");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("로그인을 시도합니다.");
				System.out.println("ID 입력");
				yid = sc.nextInt();
				System.out.println("PW 입력");
				ypw = sc.nextInt();
				
				if(yid==id && ypw ==pw) {
					System.out.println("로그인 성공");
					check = !check; //false
				}else {
					System.out.println("로그인 실패");
					break;
				}
				break;
			default:
				System.out.println("종료");
				check = !check; //false
				break;
			}
		
		}
		//로그인이 성공했으면 rpg 게임을 시작
		//최초 레벨은 1레벨, 만렙은 15레벨
		//최초 gold는 0
		//레벨 5 달성시 1000Gold 받음 레벨 10 달성시 2000Gold 15레벨 3000Gold
		//모든 몬스터의 경험치는 동일
		//레벨 1에서 2로 갈 때 잡아야 하는 몬스터의 개수 = 3
		//ㄴ 몬스터 1마리사냥 몬스터 2마리사냥 몬스터3마리사냥 레벨업
		//레벨 2에서 3으로 갈 때 잡아야 하는 몬스터의 개수 = 6
		//ㄴ 몬스터 1마리사냥 몬스터 2마리사냥 ... 몬스터6마리사냥 레벨업
		//...
		//레벨 14에서 15로 갈 때 잡아야 하는 몬스터의 개수 = 42
		//마지막에 최종레벨,최종Gold 출력
		//횟수가 정해져있으면 for문으로 돌리기..
		
		int gold = 0; //gold 변수선언
		int lv = 0; //level 변수선언
		int mon = 0; //monster 변수선언
		
		//로그인판단 = boolean타입으로 이걸 활용하자
		if(!check) {
			System.out.println("💕 RPG GAME START 💕");
			

			for(lv=1;lv<=15;lv++) {
				System.out.println("현재 레벨은 Lv"+lv+"입니다.");
				
				if(lv%5==0) {
				gold= gold+lv/5*1000;
				System.out.println("Lv"+lv+" "+gold+"gold 획득!");
				}
				
				if(lv==15) {

					break;
				}
				
				mon = lv*3;
				System.out.println("Lv"+lv+"에서 Lv"+(lv+1)+"로 갈 때 잡아야 하는 몬스터 = "+mon+"마리");
				for(int i=0;i<mon;i++) {
					System.out.println("몬스터 "+(i+1)+"마리 사냥 성공 (๑˃̵ᴗ˂̵๑)♡");
				}
				System.out.println("☹☻☹☻☹☻☹ LEVEL UP ☹☻☹☻☹☻☹");

				}
			
			
		System.out.println("최종 레벨 = "+lv+"Level");
		System.out.println("최종 골드 = "+gold+"Gold");
		}
		System.out.println(" ");
		System.out.println("*•.¸♡ WhileTest2 Finish ♡¸.•*﻿");
	}

}
