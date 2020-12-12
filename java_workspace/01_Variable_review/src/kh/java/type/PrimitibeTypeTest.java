package kh.java.type;
import java.math.BigInteger;
public class PrimitibeTypeTest {

	// 자료형 Data Type
	//
	// 1. 기본형 Primitive Type
	// =값(literal)을 저장
	// =8가지(문자형char,논리형boolean,정수형(byte,short,int,long4가지),실수형(float,double2가지))
	//
	// 문자형 char,
	// 논리형 boolean
	// 정수형 byte ,short ,int, long
	// 실수형 float double
	//
	//
	// 2. 참조형 Reference Type
	// =주소값을 저장(4byte로통일)
	//
	// =기본형을 제외한 모든 타입
	// String ,System , Date, Calendar ... 등등
	// 모든 클래스는 자료형인다.
	//
	// =*= Data 크기 단위 정리
	//
	// bit 1bit
	// byte -8byte
	// kilo byte -1024byte
	// mega byte -1024KB
	// giga byte -1024MB
	// tera byte -1024GB
	// peta byte -1024TB
	// exa byte -1024PB
	// zatta byte -1024EB
	// yotta byte -1024YB
	//

	// 컨트롤 엠을누르면 해당 작업 환경을 최대화면으로 할수있다.
	public static void main(String[] args) {

		// 객 체 PrimitibeTypeTest 형태의 p 객체만들기!

		PrimitibeTypeTest p = new PrimitibeTypeTest();
		//현재 클래스안에있는 클래스호출 방법  메인메소드의 객체 이름.호출하려는 클래스이름();
//		p.test1();
//		p.test2();
//		p.test3();
		p.tesst4();

	}
	
	//
	//기본형 
	//
	//1. 논리형
	//   	= boolean(1byte)  : trun | false
	//2. 문자형(String 은 문자형이아니라 참조형이다)
	//  	= char(2byte)	-0~65535  표현가능         =:  'a' , '가' , '1' ...
	//(가지수로치면0을포함해서35536가지경우의수를 표현가능)  
	//  	 
	//3. 정수형
	//  	   		=byte  (1byte) -128~127		(256가지)   까지표현가능      
	//  	   		=short (2byte) -32768~32767 (65536가지) 표현가능  
	//	    (정수기본형)= int  (4byte) - -21억~21억  (42억정도가지)
	//  	   		= long (8byte) - -922경~922경 (1900경정도)
	//4. 실수형
	//  	  		 =flaot  (4byte) 소수점 이하 7 자리까지 보장
	//	(실수형의 기본형)=double (8byte) 소수점 이하 16자리까지
	//
	public void test1() {

		// 1.변수 선언
		boolean bool;
		
		char ch;
		
		byte b;
		short sh;
		int i;
		long l;
		
		float f;
		double d;
		//2.변수에 값대입
		
		bool = true;
		bool = false;
		bool = ( 5 > 2 ); //>,<,<=,>=
		bool = ( 3 == 4); //3 은 4하고 같냐!?라고물어보는것
		bool = ( 3 !=4);  //위의것을 반전하는것이다  같지않니!?라는것이므로 같지않으면 true 같으면 false
		bool = !bool;     //bool 에는 바로위의 트루가 들어있따.  트루의 반전의 값을넣으면 false 가된다 이값을 bool에 넣는다.
		 
		//우측에들어가는 값을 리터럴이라고한다.
		ch ='a' ;
		ch = ' ';
		ch = '가';
	//	ch = ''; //띄어쓰기 공란은가능하지만 리터럴 값이 아에안들어갈경우는 에러가발생한다.
		
		
		//정수의 기본형 int : 우리가 숫자를적게되면 기본적으로 무조건 인트로 입력된다.
		b = 120;
//		b = 130;//바이트의 범위를 초과할경우 에러가발생한다.
//		(Type mismatch: cannot convert from int to byte 범위초과 에러메세지)
		
		sh =3200;
		i =10000;
//		l =1212313123213123; (The literal 1212313123213123 of type int is out of range 롱인데 에러가뜬다)
		l =1231231231212313L;//(l 혹은 L 을 뒤에 붙이면 정상출력된다.)
		//수업 복습중 생긴궁금증 long보다큰 정수를 출력하는방법. 위같이한다.
		//https://javariankm.tistory.com/26
		BigInteger bi = new BigInteger("32131321312312312321312311231212312312323123123123123123");
		
		
		//실수 형의 경우는 정수형과달리 해당표현자리수가 넘어갈 경우는 원하는값을 출력못해줄뿐 출력이아예안되는것이아니다.
		//이것을 실수형 출력의 정밀도 기준에의한 사용이라고한다. 
		f = 0.123F;//롱대와의 경우와같이 기본이 double  로되어었기 떄문에 float을 표현하고싶을시에는 f 나 F를 뒤에 붙여주어야된다.
		d = 0.123456789;
		
		//3. 변수 사용(출력)
		System.out.println("bool = " + bool);
		System.out.println("ch =" + ch);
		System.out.println("b =" + b);
		System.out.println("i =" + i);
		System.out.println("l =" + l);
		System.out.println("bi =" + bi);
		System.out.println("f =" + f);
		System.out.println("d =" + d);
		
	}
	
	
	
	//
	// 		초기화
	//
	//	변수 선언과 값대입을 한줄에서 처리
	//
	//
	public void test2() {
			
		int num =123;
		System.out.println(num);
		
//		//변수는 값대입없이 사용할수없다.
//		double d ;
//		d = d+1.23;
//		System.out.println(d);
			// 변수에 값대입후 사용하면 문제없다.		
		double d = 1 ;
		d = d+1.23;
		System.out.println(d);
		
		int a,b;  //한줄에 변수 여러개선언가능
		//비추 방식 
		a=1;
		b=2;
		System.out.println(a+b);
		
		int c = 3, e =4;//한줄에 이렇게 선언 대입도가능
		//추천 하는 방식은아니다.
		System.out.println(c+e);
		System.out.println(a+ "" + b);//해당정수를 연산자+가아닌 각각의 숫자표현방식을하고싶을떄는 정수타입 +""문자열 + 정수타입 이렇게하면가능하다.
		
		//정수연산
		
		int i =10;
		int j = 3;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); //나누기는 몫을구하는식이다.
		System.out.println(i%j); // %나눈후 몫을 구하는 식이다.
		
	}

     /**
	*
	*   상수
	*   한번 값대입 후에 값을 변경할수 없는 변수
	*   final 키워드를쓴다
	*/
		public void test3() {

//			int age = 20;
//			
//			age= 30;  가능
			
			
			//보통 상수 파이널붙일 시에는 대문자로 표현을해준다
			//원하는 부분만 대문자로 변경수정하고싶은경우는
			//알트 쉬프트 r을누르면 해당 내용을한번에 변경가능하다.
			//컨트롤 쉬프트 X , Y로 해당원하는문자 대소문자로변경가능하다.
			final int AGE =20;
			
//			age 30 ;// final 을 붙인 타입의 변수 값을변경할수없다
//					그러나 사용하는것은 자유다.
			
			System.out.println(AGE+5);
			
			int myage = AGE +1;
			System.out.println(myage);
			
			//JDK 가 지정해둔 상수가존재한다.
			
			System.out.println(10*10*3.14);
			System.out.println(10*10*Math.PI);
								//Math.PI처럼 정해진 상수값이존재한다.
			
			System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
			System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
			System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
			
			
		}
		
		
		
		//
		//
		//  Data Overflow
		//
		public void tesst4() {
			int i =Integer.MAX_VALUE;
			System.out.println(i);
			
			//인트의 최대값을 넘어갈경우 음의 방향의 최소 값에서 추가연산이된다. *나/의연산은 엉뚱한 수를 출력할수있다.
			i = i+1;
			System.out.println(i);
			
			
			
			
			
		}
		
		
	
	
}
