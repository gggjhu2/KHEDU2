package kh.java.type;

//

//  컴퓨터의 작동 원리
//
// 1. 같은 자료형끼리 연산할 수 있다.(예= int () int ,byte()byte, String () String...)
// 2. 연산 결과 역시 동일한 자료형이다.( 예 int + int =int  , double + double +double...)
// 3. 같은 자료형의 변수에만 대입할 수 있다. 
// 
//  위의 조건을 만족하기 위해서 암묵적 / 명시적 형변환이 필요하다.
//
//  1. 암묵적 : 자동적으로 처리
//  2. 명시적 : 수동적으로 처리(형변호나코드필요)
//
//

public class CastingTest {

	public static void main(String[] args) {

		CastingTest c = new CastingTest();

//		c.test1();
//		c.test2();
//		c.test3();
		c.test4();

	}

//	
//	자동 형변환	
//
// -크기가 작은 타입에서 큰 타입으로 변환은 자동으로 처리
// -정수에서 실수로의 변환은 자동처리
// -byte(1) -> short(2) -> int(4) ->long(8) ->float(4)
//				char(2)

	 void test1() {
//      컴퓨터 작동원리 3번에 위배된다.
//		대입연산자
		int num = 300;
		long lNum = num;
		System.out.println("lNum = " + lNum);

		int a = 3;
		double b = 1.5;

		System.out.println(a + b);// int + double 은안 된다
//									  //double(3.0) +double(1.5) = double(4.5) 가된다 

		int c = '0'; // int = char 와같다 이런경우는 법칙위배이다. 그러나 아스키코드라는 걸로 모든문자는 숫자로 저장이되어있다.
						// int = int 이를 아스키코드라고하며 이것을모아놓은것이 아스키코드 표이다.(각알파벳마다의 정해진 숫자코드값이있다)
		System.out.println(c);

		int c2 = 'ㄱ';

		System.out.println(c2);

		System.out.println('c' + 1); // char + int ('c'는99이다 + 1 이되므로 100이된다.)
										// int + int

	}

//	명시적 형변환 
//	1. 크기가 작은 타입으로 형변환. -데이터 손실
//	2. 크기가 큰 타입으로 형변환할때도
	public void test2() {

		// 1.데이터 손실이 있는경우
		int num = (int) 3.7; // int = double 인트방에 더블을넣을순없다.
								// 소수점이하가 자동으로 날라간다.
		System.out.println(num);
		// 2. 데이터 손실 없이 큰 타입으로 변환

		int a = 10;
		int b = 4;

		System.out.println(a / b); // 2가나온다.
		System.out.println((double) a / b); // (double)int/ int
											// double / int => double / double

		System.out.println(a * 1.0 / b); // int * double =double /b (double)
//		                    
		// 2147483647 + 1 = > 2147483648

		int i = Integer.MAX_VALUE;
		System.out.println((long) i + 1);
		System.out.println(i + 1L);// 작은수도 변환을해서 짝을마춰주면된당.

//		
//	  형변환 유의 사항	
//		- byte , short , char 타입은 연산시 자동으로 
//		 int(정수 기본형) 으로 변환되서 처리한다.
//		
	}

	public void test3() {

		byte b1 = 10;
		byte b2 = 20;
//			byte result =b1 + b2; //Type mismatch: cannot convert from int to byte 
		byte result = (byte) (b1 + b2);
		System.out.println("result = " + result);

		boolean bool = 'a' > (b1 + b2);//
		// char > (byte + byte )
//						  char > (int + int   )
//						int(97)> int(30)
		System.out.println(bool);

//			char 변수에 int 대입

		char ch = 65;
		System.out.println(ch);

		char ch2 = 63;
		System.out.println(ch2);

		ch = '\ud734'; // '\'u 는 유니코드라는 뜻이다
		System.out.println(ch);

	}

//		
//		java.lang.String 문자열
//		"abc"
//		-참조형 (객체 만들어서 사용)
//		-기본형처럼 사용가능(리터럴을 대입하는 형태)
//		
//		
	public void test4() {

		String name = "홍길동";
		System.out.println(name);// 원래는 이방식으로 참조형을 사용할수없다.
		String name2 = new String("홍길동"); // 원래는 이런식으로써야하는데 예외로 스트링은너무많이쓰기에 윗처럼사용가능
		System.out.println(name2);

		// 더하기 연산

		System.out.println(name + "만세!");

		// char
		System.out.println(name + 'a');
		System.out.println(123 + 'a');
		System.out.println("abc" + 'z' + 123);
		System.out.println(123 + "z" + "abc");

	}

}
