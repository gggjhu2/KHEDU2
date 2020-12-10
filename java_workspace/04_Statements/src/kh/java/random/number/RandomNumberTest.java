package kh.java.random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {

	public static void main(String[] args) {

		RandomNumberTest r = new RandomNumberTest();
//		r.test1();
//		r.test2();
//		r.test3();
		r.test4();

	}

	// **난수 **(임의의수)두가지방식이있다.
	//
	// 첫번째방식 java.util.Random
//	public void test1() {
//		
//		Random rnd = new Random();
//		
//		int num = rnd.nextInt();  //int 범위
//		//경우 의수 , 시작값(최소값) 을알아야한다.
//		
//		int num = rnd.nextInt(bound);  //bound 는 가지의 경우수 
//		
//		int num1 = rnd.nextInt(10);     // 0~10까지의 수를 나타냄     
//		int num2 = rnd.nextInt(10)+1;   // 0~9 까지의 결과값에 1을더하기떄문에 0은나올수없다.
//		//즉  nextint(경우의수) + 시작값 이렇게된다. 
//		int  num = rnd.nextInt(100)+101;  //101~200 : 경우의 수 100, 시작값 101
//		System.out.println(num);
//		
//		//0.0 (포함) ~1.0(미포함,미만) 의 난수를 리턴
//		double dnum = rnd.nextDouble();
//		System.out.println(dnum);
//		
//		boolean bool =rnd.nextBoolean();
//		System.out.println(bool);
//		

//	}

//	 Math.random()
//	
//	 0.0(포함) ~1.0(미포함0) 실수를 리턴
//	
//	
//	

//	public void test2() {
//		
//		double num =Math.random();
//		System.out.println(num);
//		//정수형 난수
//		//Math.random()  //경우의 수 + 최소값
//		int i =(int)(num*15) +1;  //1~15까지의 수출력
//		System.out.println(i);
//		
//		
//	}

//	
//	동전게임
//	a
//	public void test3() {

//		Scanner sc = new Scanner(System.in);
//		

//		System.out.println("동전 앞 / 뒤 를 입력 (1.앞 2.뒤)>>");
//		int user =sc.nextInt();
//		int coin =(int) Math.random()*2 +1 ;
//		
//		String result = user ==coin ? "정답!" : "오답";
//		
//	    System.out.println(result);
//	    
//	    System.out.println("user =" +user+ ", coin = " +coin);
//		Random rnd = new Random();
//		
//		System.out.println("동전 앞 / 뒤 를 입력 (1.앞 2.뒤)>>");
//		int user =sc.nextInt();
////		int coin =rnd.nextInt(2)+1 ; //
//		int coin = rnd.nextBoolean() ? 1 : 2;
//		
//		
//		String result = user ==coin ? "정답!" : "오답";
//		
//		System.out.println(result);
//	
//		 System.out.println("user =" +user+ ", coin = " +coin);

//	}

//	 올림
//	 올림 ceil  : double
//	 버림 floor     : double
//	반올림 round     : long
	public void test4() {

//		//1.올림 (소수 첫번째자리 를 올려서 정수까지만든다)
		double num = 1.23;
//		double result =Math.ceil(num);
//		System.out.println("result = " + result);  //2
//		
		// 2.버림
//		double result = Math.floor(num);
//		System.out.println("result = " + result );
//		
		// 3.올림 해서 소수점 첫번째자리까지 표현 : 1.3 (부동 소수점방식)
		// 1.23 *10 => 12.3 = > 13.0 / 10 =>1.3
		double num2 = 1.23;
		double reuslt = Math.ceil(num) * 10 / 10; // ===>해당부분 해결못함
		System.out.println("result = " + reuslt); // (/TODO)

		// 3.반올림

		double n = 3.75;
		long res = Math.round(n);
		System.out.println("res = " + res);
		// 반올림결과 3.8 나타내보기
		// 3.75 *10 -> 37.5 ->38/10(여기서문제가생긴다..) ->3
//		System.out.println(Math.round(n*10));  //38의결과
		System.out.println(Math.round(n * 10) / 10.0); // 3.8의결과

	}

}
