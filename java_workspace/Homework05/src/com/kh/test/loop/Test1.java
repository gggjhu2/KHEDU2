package com.kh.test.loop;

import java.util.Scanner;
/**
 * [문제 1]
- 클래스 : com.kh.test.loop.Test1.java
- 메소드명 : public void test()
    1부터 사용자로부터 입력 받은 정수까지 존재하는 짝수의 합을 출력하세요. 
    (for문 활용)
 */
public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.test();
		
	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int temp = sc.nextInt();
		int sum =0;
		for(int i = 1 ; i <= temp; i++) {
			if(i %2 ==0)
				sum+=i; //sum = sum+i 
		}
		System.out.println("1 ~ " + temp + " 까지 존재하는 짝수의 합 = " + sum);
	}

}