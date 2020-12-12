package kh.java.type;


//
	//컴퓨터 작동원리
	//1.같은 자료형 끼리만 연산할 수 잇다.
	//2.연산 결과 역시 동일한 자료형이다
	//3.같은 자료형의 변수에만 대입할 수있다.
	//
	//위의 조건을 만족하기 위해서 암묵적 /명시적 형변환이 필요하다.
	//
	//1.암묵적: 자동으로 처리
	//
	//2.명시적 : 형변환 코드 필요

public class CastingTest {
public static void main(String[] args) {

	
	CastingTest ct = new CastingTest();
//	ct.test();
//	ct.test2();
//	ct.test3();
	ct.test4();
	
}
	//	
	//자동 형변환
	//
	// 자동형변환의 조건
	//	-크기가 작은타입에서 큰 타입으로 변환은 자동으로 처리
	//  -정수에서 실수로의 변환은 자동 처리
	//  -byte(1) =>short(2) => int(4) => long(8) => float(4) => double(8)
	//						  char(2)  <=예외
 public void test() {
	 
	 int num = 300;
	 long lnum = num;
	 //자동형변환이다. 8바이트의 롱에 는 자연스럽게 4바이트의 인트가 담길수잇다. 
	 System.out.println("lnum = " + lnum);
	 
	 int i=1;
	 float f=3.1f;
	 
	 System.out.println(i + f);
	 
	 
	 int i2=3;
	 double b =1.5;
	 System.out.println(i2+b);//int+double 계산할수없기에
	 						// double(3.) + double = double
	 
	 int c ='a';			//int =char
	 						//2비트인 차를 인트로 바꿀시에는 미리짜여져있는 아스키코드로 자동변환을한다.
	 System.out.println(c);
	 int c2 = '0';
	 System.out.println(c2);
	 
	 System.out.println('c' + 1); //char + int 
	 							 //int(99) + int
	 //char 가 인트로바껴 
	 //int() + int 
 }
 	//
 	//명시적 형변환
 	//  
 	//  1.크기가 작은 타입으로 형변환 = 데이터손실
	//	2.크기가 큰타입으로 형변환 (이런경우도있다.) 
  public void test2() {
	  
	  //1.데이터 손실이 있는경우
	  
	  int num =(int)3.7; //int = double  왼쪽은 고정
	  System.out.println(num); //소수점이하를 날릴때 사용하는방식으로 정수가된다.
	  
	  //2. 데이터손실 없이 큰 타입으로 변환.
	  
	  int a =10;
	  int b = 4;
	  
	  System.out.println(a/b);  //2가나오지만 소수점까지 알고싶을경우는 다음과같이한다.
	  System.out.println((double)a/b); //뒤의 변수 두개다 인트형이므로 어떤것을 더블로바꿔주든 상관없다.
	  System.out.println(a/(double)b); //
	  System.out.println((double)a/(double)b);
	  					
	  System.out.println(a*1.0/b); // 궂이 더블로 써서 바꾸기보다는. 1.0을 곱해주면 a값이 10.0이되기때문에 자동으로 명시적형변환과똑같은결과다.
	  
	  //2147483647(인트최대값)
	  int i = Integer.MAX_VALUE;
	  //인트 최대값보다 큰 값을 출력하고싶을 때는 둘중하나 혹은둟다 롱형태로 바꽈줘야한다.
	  
	  System.out.println((long)i +1);
	  System.out.println(i +(long)1);
	  System.out.println(i +1l);
	  System.out.println(i +1L);
//	  System.out.println(il +1); //이렇게하면안되는이유는 변수명이바뀌기떄문에다.
//	  System.out.println(iL +1); //값에 접미로 L l 혹은 f F로 형변환가능
	  
	  
	  
  }
	
    	//  
    	// 형변환 유의 사항  
    	//  -byte, short , char 타입은 연산시
    	//  자동으로 int(정수 기본형) 으로 변환되서 처리
    	//  
	  public void test3() {
		  
		  
		  byte b1 = 10;
		  byte b2 = 20;
		  
//		  byte result= b1 + b2;// 연산시 인트로 자동 변환이되어 에러가난다.
		  byte result=(byte)(b1 + b2);
		  System.out.println("result =" +  result);
		  
		  boolean bool = 'a' > (b1 + b2);
		  			//'a'는 정수 97이다.	
		  int c ='a';
		  System.out.println(c);
		  System.out.println(bool);
		  
		  //char 변수에 int 대입
		  
		  char cch = 65;  //int인 65 를 작은 char에 담으면 당연히 아스키코드의 정의에의해 변환가능하다.
		  System.out.println(cch);//아스키코드의 65 는 대문자 A이다 아스키코드는 127번까지 확장된아스키코드256가지다.
		  //한글 , 아랍어 등 각종 기호 포함 모든문자를 담으것이 UTF-8이다 유니코드다.
		  
		  
		  cch = '\ud734';  //이것은 유니코드 다라는 것이다 \ u를 입력하고 뒤의 16진수 숫자를 써주면  해당 유니코드에대한 문자가나온다.
		  System.out.println(cch);
		    
		  //한글을 유니코드로 바꿔 출력하는방법
		  
		  int h='한';
		  System.out.println("한의 유니코드는 =" + Integer.toHexString(h));
		  // 한을 16진수 스트링으로 반환한 그러나 해당 16진수의 알파벳이 소문자로 출력되기에 대문자로바꽈주면완료다.
		  System.out.println("한의 유니코드는 =" + Integer.toHexString(h).toUpperCase());
		  
		  int h2='글';
		  System.out.println("글 의 유니코드 는 = "+Integer.toHexString(h2).toUpperCase());
		  
		  int h3 = '좋';
		  System.out.println("좋 의 유니 코드는 = " + Integer.toHexString(h3).toUpperCase());
		  
		  int h4 = '아';
		  System.out.println("아 의 유니 코드는 =" + Integer.toHexString(h4).toUpperCase() );
		  
		  
	
	  }
	  
	  //
	  //	java.lang.String 문자열
	  //		"abc"
	  //	-참조형(객체 만들어사용)
	  //	-기본형 처럼 사용가능
	  //	    (리터럴을 대입하는형태로 그냥 사용가능)
	  public void test4() {
		  
		  String name = new String("홍길동");
		  System.out.println(name);
		  //원래 이와같이 스트링은 참조형이므로 객체를만들어준후 사용해야한다.
		  //그러나 너무자주 쓰이는 클래스이기때문에 기본형처럼 사용할수있게 되어있다.
		  
		 String name2 ="스트링을 기본형처럼 쓴다.";
		 System.out.println(name2);
		  
		  //더하기 연산
		 System.out.println(name2 + "만세!");
		 
		 //char
		 char a ;
		 System.out.println(name + 'a');  //문자열을만나면 문자로바뀌고
		 System.out.println(123+ 'a');	  //정수를 만나면 정수로바뀐다.
		 System.out.println(123 + " " + 'a');
		 System.out.println(123 + " " +(int)'a');
		 System.out.println((char)123 + " " +(int)'a');
		 //위의 예제처럼 자유롭게 변환이가능하다.
		  
		  
		  
		  
		  
		 
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	 
	 
	 
	 
 }
