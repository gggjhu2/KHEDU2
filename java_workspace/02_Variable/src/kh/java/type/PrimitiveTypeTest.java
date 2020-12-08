package kh.java.type;

public class PrimitiveTypeTest {

	public static void main(String[] args) {

		PrimitiveTypeTest p = new PrimitiveTypeTest();
//		p.test1();
//		p.test2();
//		p.test3();
		p.test4();
	}
	//
	// 자료형 Data Type(어떤 언어든 거의공통)
	//
	// 1.기본형 Primitive Type (뜻:원시형태)
	//
	// - 값(literal)을 저장함
	// - 8가지 형태가 전부
	// 문자형=>char ==> 'a' , '가','1'(하나의문자) =>(2byte,0~65536가지를표현가능1bit는 0과1 1024bit가
	// 1byte 이기떄문에)
	// 논리형=>boolean ==>true or false (참,거짓) =>(1byte)
	// 정수형 =>byte,short,int,long
	//
	// byte (1byte) ==> -128 ~ 127 (256가지표현가능)
	// short (2byte) ==> -32768 ~32767 (65536가지를 표현가능)
	// 가장많이쓰임=>int(정수기본형) (4byte) ==> -21억 ~ 21억 (대략42억개표현가능)
	// long (8byte) ==> -922경 ~ 922경 (1900경정도가능)
	//
	// 실수형=>float,double
	//
	// float (4byte) ==> 소수점이하 7자리
	// double (8byte) ==> 소수점이하 16자리 (실수형의 기본형 )
	//
	// (실수는 크기가아니라 정밀도라고하여 소숫점 몇번째까지표현이가능하냐 라고 표현한다.)
	//
	//

	// 2.참조형 Reference Type
	//
	// - 주소 값을 저장 (4byte)
	// -기본형을 제외한 모든 타입
	// String, System, Date ,Calendar
	// 모든 클래스는 자료형이다.
	//
	// *비트 단위*
	// bit
	// byte -8bit
	// kilo byte -1024byte
	// mega byte -1024kilo byte
	// giga byte -1024mega byte
	// tera byte -1024giga byte
	// peta byte -1024tera byte
	// exa byte -1024peta byte
	// zetta byte -1024exa byte
	// yotta byte -1024zetta byte
	//
	//
	//
	//
	//

	public void test1() {

		// 1.변수 선언

		boolean bool;
//				(참거짓)
		char ch;
//				(문자열 한글자)
		byte b;
		short sh;
		int i;
		long l;
//				(정수 4가지)

		float f;
		double d;
		double d2;
		// 2.변수에 값대입

		bool = true;
		bool = false;
		bool = (5 > 2); // >크다 <작다 >=크거나 같다 <=작거나 같다 (무조건 왼쪽기준으로 말해야한다.)
		bool = (3 == 4); // 3은 4와 같니?
		bool = (3 != 4); // 3은 4와 같지않니? 같지않으면 true 같으면 false
		bool = !bool; // 불리 언의 결과 값인 트루를 뒤집어 달라는 뜻! 즉.false가된다아

		ch = 'a';
//				ch   = '가';
//				ch   = '韓';
//				ch   = ' ';//공란

//				정수 기본형 int : 1234  -> int
		b = 120;
//              b 	 = 130;//type mismatch : cannot convert from int~~(범위값을 초월해서 안되는에러)				

		sh = 32000;

		i = 1000000;

//				l    =12321321321;  //The literal 12321321321 of type int is out of range
//(이유:정수를적으면 기본적으로 인트타입으로 잡히기떄문에 에러가잡히지만 이것을 알려주려면 접미어로 L 혹은 l을 입력해주어
//				명시해주어야한다.)
//				
		l = 10000000l;

//				
//				실수 기본형은 double 로서 접미에 f, F를 붙이지않으면 에러가나온다.
//				f   =0.12345;  
		f = 0.12345F;
		d = 0.1234567890;// 소숫점 16번째 이하는 오류가난다.
		d2 = 0.1234567890123456789;// 0.12321312321321322 실제 출력값과다르다

		// 3.변수사용

		System.out.println("bool = " + bool);
		System.out.println("ch   = " + ch);
		System.out.println("ch   = " + ch);
		System.out.println("b    = " + b);
		System.out.println("sh   = " + sh);
		System.out.println("i    = " + i);
		System.out.println("l    = " + l);
		System.out.println("f    = " + f);
		System.out.println("d    = " + d);
		System.out.println("d2   = " + d2);

	}

// 		    초기화		
//	 	    변수 선언과 값대입을 한줄에서 처리		
	public void test2() {

//			int num;
//			
//			num = 123;

		int num = 123;

		System.out.println(num);

//			
//			double d;
////			변수는 값대입 없이 사용할 수 없다. 변수명에대한 초기화없이  사용할수없다.
//			
//			d = d + 1.23;
////			The local variable d may not have been initialized 값이 대입되어있찌않는데?
//			
//			System.out.println(d);

		double d;

		d = 0.1;

		d = d + 1.23;

		System.out.println(d);

		int a, b;
		int j = 10;
		int i = 3;
		a = 1;
		b = 2;

//		    System.out.println(a , b);//이와같이 출력하고싶을경우는 이대로 사용할수없다
		System.out.println(a + "" + b); // 숫자의 연속 출력은 사이에 문자열을 넣어서 공백을 넣어주면가능하다.

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); // 나누기의경우는 나머지를 표현하지않는다 몫만 구한다.
		System.out.println(j / i); //
		System.out.println(i % j); // 나머지 연산자이다 i를 j로나누고 의 나머지를 표현한다.
		System.out.println(j % i); //

	}

//			
//			상수 			
//			
//			한번 값대입 후에 값을 변경할 수 없는 변수
//			final이라고한다.
//			
	public void test3() {

//				int age =20;
//				
//				age  	=30;
//				
//				System.out.println(age);
//				
//				final int age =20;   // Alt  +  Shift  +r 을 누르면 동일한 참조형을 한번에 바꾸는 단축키이다.//Todo

		final int AGE = 20;

		System.out.println(AGE);

		int myAge = AGE + 1;

		System.out.println(myAge);

//				FINAL 값은 변경은안되고 가져다 사용하는것만 가능하다.
//				jdk 가 지정해둔 상수
		System.out.println(10 * 10 * 3.14);// Math.PI 좀더 상세하기 표현해주는 메소드상수
		System.out.println(10 * 10 * Math.PI);

		System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

	}

	public void test4() {

		int i = Integer.MAX_VALUE;
		System.out.println(i);

		i = i + 1;

		System.out.println(i);

//			 해당 정수 그릇에 담을수있는 크기를 넘으면 최소값에반대방향을 을 제공한다(이것을 date overflow라고한다)

		i = i + 2;

		System.out.println(i);

		i = i * 123;

		System.out.println(i);

	}

	{

	}

}
