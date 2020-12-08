package com.kh.test;



public class Test1 {

	public static void main(String[] args) {

		Test1 q = new Test1();
		q.test1();

	}

	public void test1() {
		//		선언
		int i;
		long l;
		float f;
		double d;
		String s1;
		String s2;
		boolean bool;

		
		//		갑대입
		//  1-1
		i = 100;
		l = 99999999999l;
		//  1-2
		f =486.520f;
		d =567.890123;
		s1 = "A";
		s2 = "Hello world";
		bool = 1!=3;
//
//1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.		
//		
		System.out.println("문제 1-1");
		System.out.println("정수형 100나타내기\n" +"==>"+ i + "\n9999억만들기\n" +"==>"+ l);
		System.out.println("문제 1-2");
		System.out.println("실수 만들기1\n ==>"+f+"\n실수 만들기2\n ==>" + d);
		System.out.println("문제 1-3");
		System.out.println("문자 A출력하기 \n"+ "=>   " + s1);
		System.out.println("Hello world 출력하기");
		System.out.println("=>  " + s2);
		System.out.println(bool);
	
		
		
		
		
		
		
		
		
		
		
	
	}

}

	

