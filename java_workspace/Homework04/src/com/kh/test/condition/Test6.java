package com.kh.test.condition;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {

		Test6 t6 = new Test6();
		t6.test();

	}

	
	
	public void test() {
		
		
		Scanner sc = new Scanner(System.in) ;
		
		
		
		
		
		System.out.println("===가위 바위 보 게임===\n 숫자를 선택하세요.\n(1.가위/2.바위/3.보)");
		
		
		
		int user = sc.nextInt();
		int rand=(int)(Math.random()*3)+1;
		
		System.out.println("========= 결과 =========");
		
		if(user ==1) {
			
			System.out.println("당신은 가위를 냈습니다.");
		}
	else if(user==2)
	{

		System.out.println("당신은 바위를 냈습니다.");
	
	}else if(user==3) {
		System.out.println("당신은 보를 냈습니다.");
	}
	 if(rand==1) {
		System.out.println("컴퓨터는 가위를 냈습니다.");
	}
	 else if(rand==2){
	
		System.out.println("컴퓨터는 바위를 냈습니다.");
		
	}else if(rand==3)
	{
		System.out.println("컴퓨터는 보를 냈습니다.");
	}System.out.println("======================");

	// 비겼을때
	if(user==rand)
	{
		System.out.println("비겼습니다.");
	}
	// 이겼을때
	else if((user==1&&rand==3)||(user==2&&rand==1)||(user==3&&rand==2))
	{
		System.out.println("당신의 승리입니다~~~~~~!");
	}
	// 졌을때 12 23 31
	else if((user==1&&rand==2)||(user==2&&rand==3)||(user==3&&rand==1))
	{
		System.out.println("당신의 패배입니다 ㅋㅋㅋㅋ");
	}

}

	}


