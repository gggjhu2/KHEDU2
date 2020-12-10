package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
//
//		t1.test1();
//		t1.test2();
		t1.test3();
	}

	public void test1() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 =");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 =");
		int en = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 =");
		int math = sc.nextInt();

		int total = kor + en + math;

		if (total >= 250) {

			System.out.printf("**우수 생입니다.**\n" + "========\n너의 점수 \n=======\n 국어%d점\n 영어%d점\n 점수학%d점  ", kor, en, math);
		} else {
			System.out.printf("**우수 생입니다.**\n" + "========\n너의 점수 \n=======\n 국어%d점\n 영어%d점\n 점수학%d점  ", kor, en, math);
			System.out.println("넌 안 우수생입니다.\n");
		}
	}

	public void test2() {

		int a = 5000;
		int b = 2500;
		int c = 5600;

		if (a >= 5000) {
			System.out.println("a" + "는 고액연봉자입니다.");
		}
		else {
			System.out.println("당신은 저액 연봉자입니다.");
		}
		if (b >= 5000) {
			System.out.println("b" + "는 고액연봉자입니다.");
		}
		else {
			System.out.println("당신은 저액 연봉자입니다.");
		}
		if (c >= 5000) {
			System.out.println("c" + "는 고액연봉자입니다.");
		}
		else {
			System.out.println("당신은 저액 연봉자입니다.");
		}
			System.out.println("=======================");
	}

	public void test3() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세욥(소수안됨)\n =>");
		long i = sc1.nextLong();
		
		String s2 = (i %2 ==1) ? "홀수" :"짝수";
		
		System.out.println(s2);
		
		
		
		
		
		
		
	}
		
}

