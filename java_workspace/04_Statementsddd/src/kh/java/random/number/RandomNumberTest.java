package kh.java.random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {

	public static void main (String[]args) {
	
		RandomNumberTest r = new RandomNumberTest();
//		r.test1();
//		r.test2();
//		r.test3();
		r.test4();
		
	}
	/**
	 * 난수는 임의의 수.
	 * java.util.random
	 */
	public void test1() {
		Random rnd = new Random() ;
//		int num = rnd.nextInt();//int 범위
		
		//경우의 수, 시작값(최소값)
//		int num = rnd.nextInt(10) + 1;//0 ~ 9까지의 수
		
		
		//101 ~200
		int So = rnd.nextInt(100)+101;
		System.out.println(So);
		
		//0.0(포함) ~ 1.0 (미포함)의 난수
		double dnum = rnd.nextDouble();
		System.out.println(dnum);
		
		boolean bool = rnd.nextBoolean();
		System.out.println(bool);
		
	}
	/**
	 * Math.random()
	 * 
	 * 0.0(포함) 1.0(미포함) '실수'를 리턴
	 * 
	 */
	public void test2() {
		
		double num = Math.random();
		System.out.println(num);
		
		//정수형 난수
		//Math.random() * 경우의 수 + 최소값
		int i = (int)(num * 15) + 1 ;
		System.out.println(i);
	}
	/**
	 * 동전게임
	 */
	public void test3( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("동전 앞/뒤를 입력(1.앞, 2.뒤) >  ");
		int user = sc.nextInt();
		
//		int coin = (int)(Math.random() * 2) + 1;
		Random rnd = new Random();
		int coin = rnd.nextBoolean() ? 1 : 2;
		
		String result = user == coin ? "정답" : "오답" ;//유저와 코인이 동일하다면 정답 or 오답
		System.out.println(result);
		System.out.println("user = " + user + ", coin = " + coin);
	}
	/**
	 * 올림 ceiling : double을 리턴
	 * 버림 floor : double을 리턴
	 * 반올림 round : long을 리턴
	 */
	public void test4() {
		//1.올림
		double num = 1.1;
		double result = Math.ceil(num);
		System.out.println("result = " + result);
		
		//2.버림
		result = Math.floor(num);
		System.out.println("result = " + result);
		
		//부동소수점 방식 : 올림해서 소수점 첫번째자리까지 표현 :  -> 1.3
		//1.23 * 10 => 12.3 => 13.0 / 10 => 1.3
		num = 1.23; 
		result = Math.ceil(num * 10) / 10;
		System.out.println("result= " + result); //부동소수점방식
		
		//3.반올림 
		double n = 3.75;
		long res = Math.round(n);
		System.out.println("res = " + res);
		
		//반올림 결과 3.8
		//3.75 -> 37.5 -> (dobule)38 / 10 -> 3.8
		double K = 3.75;
		long mes = Math.round(K * 10) ;
		System.out.println("res = " + (double)mes/10.0);
	}
}
