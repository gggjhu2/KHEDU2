package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Test3 t = new Test3();
		t.test();
	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정 수를 입력 해주세요(음수안됨)");
		int i = sc.nextInt();
		System.out.println("두번째 정수를 입력 해주세요(음수안됨)");
		int i2= sc.nextInt();
		System.out.println("연산자를 입력해주세요(+ , - , * , / 중택일)");
		char ch=sc.next().charAt(0);
		
			if(ch== '+') {
				
				System.out.println(i +"+" + i2+ "=" +(i+i2));
			}
			else if (ch == '-') {
				System.out.println(i +"-" + i2+ "=" +(i-i2));
			}
		
			else if (ch == '*') {
				System.out.println(i +"*" + i2+ "=" +(i*i2));
			}
			else if (ch == '/') {
				System.out.println(i +"/" + i2+ "=" +(i/i2));
			}
			else  {
				System.out.println("잘못 입력했어 잘좀해봐.");
			}
		
		
		
		
		
	}

	
}

