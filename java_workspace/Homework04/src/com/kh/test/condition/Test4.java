package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Test4 t4 = new Test4();
		t4.test();

	}

	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10사이의 숫자를 입력해주세용");
		int i =sc.nextInt();
			
		
		if(i<1 || i>10){
			
			System.out.println("반드시 1~10을입력해야된다.");
			return ;
			
		}else if(i%2==0) {
			System.out.println("짱수입니다.");
			return;
		}else {
				
			System.out.println("홀수입니다.");
			return;
			
		}
		
	}
	
	
}
