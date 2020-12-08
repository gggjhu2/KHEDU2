package kh.java.format;

public class PrintfTest {

	public static void main(String[] args) {

		PrintfTest p = new PrintfTest();
		p.test1();

	}

//
//		System.out.printf( "형식 문자열" 	,요소 1 ,요소2 , ...)
//	
	public void test1() {

		boolean bool = true;      //%b
		char ch = '헐';			  //%c
		String s = "안녕하세요";	  //%s
		int i = 100;			  //%d (모든정수는 d로표현 Decimal Number의약자이다)
		double dnum = 0.12345678; //%f 
		
		// 요소의사용의 갯수 제한은없다.
		System.out.printf("%b참이냐 %b거짓이냐~ %b 이다.", bool, !bool, bool);// 불리언사용은 %b
		// 개행이 하고싶을 때는 %n 이라든지 /n 을 사용하면된다!
		System.out.printf("%n%n%c , %s %n ", ch, s);// 스트링은%s 차는 %c
		// %.2f : 소수점이하 둘째자리까지 반올림처리
		System.out.printf("%ni = %d , dnum = %.2f%n", i, dnum);
		// %10s => 10개의 공간(10byte)을 확보하고 , 요소를 우측정렬해라. 10칸안에서 요소를정렬하라양수는 우측 음수는 좌측
		System.out.printf("[%10s] [%-10s] %n", "abc", "abc");
		System.out.printf("[%10s] [%-10s] %n", "우안녕", "좌안녕");

		//%s 는 모든타입에 사용가능하다
		System.out.printf("%s %s %s %s %s %n", bool , ch , s, i ,dnum);
		System.out.printf("%s %s %s %s %.5s %n", bool , ch , s, i ,dnum);
		
	}

}
