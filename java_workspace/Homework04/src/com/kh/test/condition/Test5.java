package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Test5 t5 = new Test5();

		t5.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력: ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력: ");
		double weight = sc.nextDouble();

		double bmi = weight * 10000 / (height * height);
		System.out.printf("당신의 BMI: %5.2f \n", bmi);
		if (bmi < 18.5) {
			System.out.println("저체중입니다.");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상입니다");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중입니다");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만입니다");
		} else {
			System.out.println("고도 비만입니다.");
		}
	}
}
