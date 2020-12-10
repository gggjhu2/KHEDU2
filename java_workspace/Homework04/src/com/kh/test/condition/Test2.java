package com.kh.test.condition;

import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {

		Test2 t = new Test2();

		t.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력하시오");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력하시오");
		int en = sc.nextInt();
		System.out.println("수학 점수 입력하시오");
		int math = sc.nextInt();

		int aver = (kor + en + math) / 3;

		if (aver >= 60) {

		} else if (kor > 40 && en > 40 && math > 40) {
			System.out.println("당신은 합격입니다!^^");

		}else
		
		System.out.println("당신은 불 합격입니다. 공부더하세요!");
	}

}

