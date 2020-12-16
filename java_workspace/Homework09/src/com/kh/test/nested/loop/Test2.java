package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		new Test2().test();
	}
	/**
	 * 메소드명: public void test()
    정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    
    출력예)
    정수 입력 : 5
    *****
    ****
    ***
    **
    *
    출력예)
    정수 입력 : 0
    양수가 아닙니다.
	 */
	public void test() {
		
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		while(true) {
			temp = sc.nextInt();
			if( temp > 0 ) break;
			System.out.print("다시 정수를 하나 입력하세요 : ");
		}
		
		for(int i =0 ; i < temp ; i++ ) {
			for(int j =0 ; j < temp-i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
