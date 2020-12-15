package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
			
//		정수하나 입력받아, 그 수가 양수일때만 입력된 
//	    수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
//	    출력예)
//	    정수 하나 입력 : 5
//	    1
//	    12
//	    123
//	    1234
//	    12345
//	    출력예)
//	    정수 하나 입력 : -5
//	    양수가 아닙니다.
		
		Test1 t=new Test1();
		t.test1();

	}
	
	
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		for (i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("●");
				if (i % 2 != 0)
					break;
				
			}
			System.out.println();
		}
		
	}
	
	
}
