package kh.java.loop;

import java.util.Scanner;

/**
 * for( 초기식; 조건식; 증감식) {
 *		//반복 실행할 코드
 *}
 * 
 * - 초기식 : for문이 시작하면서 단한번 실행. 증감변수 선언
 * - 조건식 : true면 반복문 1회 실행, flase먄 반복문 중지
 * - 증감식 : 증감변수 증감
 * (초조반증) = 초기->조건->반복->증감
 * 처리순서
 * 1. 초기식
 * 2. 조건식 -> true
 * 3. 반복 실행 코드
 * 4. 증감식
 * 
 * 2. 증감식 -> 조건식  -> 
 * 	  true - >반복실행코드 -> 증감식(반복)
 * 
 * 2. 조건식 -> false ->반복종료
 */

public class ForLoopTest {

	public static void main(String[] args) {
		ForLoopTest f = new ForLoopTest();
//		f.test1();
//		f.test2();
//		f.test3();
//		f.test4();
//		f.test5();
		f.test6();
	}
	/**
	 * 증감변수의 추이 0 1 2 
	 * ->
	 * 반복횟수 3
	 * 
	 * 
	 */
	public void test1() {
		//Hello World를 5번출력
		for(int i = 1; i > 0; i++) {
			
		
		System.out.println("Hello Wolrd"+i);
		}
	}
	public void test2() {
		//1 ~ 10개 홀수
		for(int i = 1; i <11; i+=2) {
			
			System.out.print((i * 2) + " " );
		 
			
		}
		System.out.println();
		
		for(int i = 1; i<=20; i++) {
		System.out.print((i += 1) + " " );
		}
		System.out.println();
		
		//20 18...2
		for(int i = 20; i>=0; i-=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//10 ~1
		for(int i = 1; i <= 10; i++) {
			System.out.print((11 - i) + " ");
		}
		
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?(2~9) > ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " * "+ i + " = "+ dan * i+ "\n");
		}
	}
	/**
	 * @실습문제 : 사용자에게 이름을 입력받고, 숫자를 입력받아서
	 * 해당 이름을 해당 횟수만큼 반복 출력하세요.
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num ; i++) {
			System.out.println(name + "  ");
		}
	}
	/**
	 * 
	 * 1~ 10까지 합계구하기
	 * 
	 * 1 + 2 + 3 ....+0 + 10
	 */
	public void test5() {
		int sum = 0;
		
		for (int i = 1; i<=100 ; i++) {
		System.out.println(i);
		sum += i; // sum = sum +i
	}
	System.out.println("합계 : " + sum);
	}
	/**
	 * 1~10	
	 */
	public void test6() {
		int len = 100;
		for (int i = 1; i<= len; i++) {
			System.out.print(i);
			System.out.print(i != len ? ", " : "");
			
		}
	}
}

