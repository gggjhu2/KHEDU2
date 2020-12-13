package com.kh.java;
import java.util.Date;


//임포트는 클래스를 불러오는 호출명이다
//import com.kh.java.other.OtehrJava;  //
import com.kh.java.other.OtehrJava;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Hello world~~");

		
		
//		클래스 -> 객체
		HelloWorld hw = new HelloWorld();
		hw.test1(); // 메소드 호출부
		hw.test2();
		System.out.println();

		KHJava kh = new KHJava();
		kh.welcome();

		System.out.println("메인 메소드 출력!");

// 타 패키지의 매소드를 호출하는 방법도 똑같은방식이나 import문을 작성해서 호출후 작성
		OtehrJava cm = new  OtehrJava();
		
		cm.callMe();
		
		//jdk 제공 클래스 사용하기
		
		Date now = new Date();
		
//		java.util.Date now = new java.util.date();  //이렇게하면 임포트문없이 호출가능합니다.!!
		
		System.out.println(now);
		System.out.println("====");
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		
		System.out.println(today);
	}

	
	   
	
	
	    
	
	
	public  void test2() {
		// TODO Auto-generated method stub
		System.out.println("test 2 호출!!");
		
	}

	// 메소드 선언부
	public void test1() {

		System.out.println(" test1 호출!");

	}
}
