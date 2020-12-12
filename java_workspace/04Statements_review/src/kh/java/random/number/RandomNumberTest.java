package kh.java.random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		System.out.println(sdf.format(new Date()));  시간  알려주는 메소드
		RandomNumberTest rn = new RandomNumberTest();
//		rn.test1();
//		rn.test2();
//		rn.test3();
		rn.test4();

	}

	//
	// java.util.Random
	//
	//
	public void test1() {

		Random rnd = new Random();
//			int num = rnd.nextInt();//int 범위

		// 경우의 수, 시작값(최소값)

		int num = rnd.nextInt(10) + 1; // (0~9) +1
		System.out.println(num);

		// 101~200
		int num2 = rnd.nextInt(100) + 101;
		System.out.println(num);

		// 0.0(포함) ~1.0(미포함) 의 난수
		double dnum = rnd.nextDouble();
		System.out.println(dnum);

		boolean boo = rnd.nextBoolean();
		System.out.println(boo);

	}

	//
	// Math.random()
	//// java.lang 패키지로 호출없이 바로 사용할수있다.
	//
	// 0.0(포함) ~1.0(미포함) 의 실수를 리턴
	//

	public void test2() {

		double num = Math.random();
		System.out.println(num);
		// 정수형난수
		// Math.random()*10을하고 인트형으로변환을하면 소수점이 탈락되어 정수형이된다.(버림이다) *경우의 수 +최소값
		int i = (int) (num * 10) + 1;
		System.out.println(i);

	}

	//
	// 동전 게임
	//
	//
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("동전 앞/뒤를 입력.(1.앞 2.뒤) >");
		int user = sc.nextInt();
		
		
		
//		int coin = (int) (Math.random() * 2) + 1;
		Random rnd =new Random();
//		int coin  =rnd.nextInt(2)+1;
		int coin = rnd.nextBoolean() ? 1 : 2;
		
		
		
		
		String result = user ==coin ? "정답" : "오답";
		System.out.println(result);
		System.out.println("user =" + user + ", coin" + coin);
		
	}	
	
	//
	// 올림 ceilling    : double
	// 버림 floor		   : double
	// 반올림 round	   : long
	
	public void test4() {
		
		//1. 올림 
		double num =1.1;
		double result = Math.ceil(num);
		System.out.println("result =" +result);
		
		//2. 버림
		
		result =Math.floor(num);
		System.out.println("result =" + result);
		
		//올림해서 소수점 첫번째자리까지 표현 :1.3
		//1.23*10 =>12.3 =>13.0 /10 =>1.3
		//
		num =1.23;//올림1.3
		System.out.println("result =" + result);
		result=Math.ceil(num*10)/10;
		System.out.println("result =" + result);
		
		//부동 소수점 방식
		
		//3. 반올림:
		
		  double n =3.75;
		  long res = Math.round(n);
		  System.out.println("res = " +res);
		
		//반올림 결과 3.8
		  //3.75*10 => 37.5 =>(double) 38 /10 =>3.8
		 System.out.println(Math.round(n*10)/10.0);
		 
		 
		 
		 
		  
		
		
	}
}
