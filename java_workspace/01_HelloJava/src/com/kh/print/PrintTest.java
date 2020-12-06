package com.kh.print;

public class PrintTest {

	public static void main(String[] args) {

		
		
		
		
		
		PrintTest p = new PrintTest();
		
		p.test1();
		p.test2();
		p.test3();
		p.test4();
		
	}
	
private void test4() {
		// TODO Auto-generated method stub
		
//	문자열 더하기 연산
//	1. 문자열 + 문자열 =>문자열
	System.out.println("==============");
	System.out.println("==============");
	System.out.println("가나다" + "라마바사");
//	2.문자열 + 숫자  =>문자열
	System.out.println("==============");
	System.out.println("==============");
	System.out.println("abc" + 123); //"abc123"
	//	3.숫자 + 숫자 => 숫자 (연산)
	System.out.println("==============");
	System.out.println("==============");
	System.out.println("123" + 4); //  1234   "" 안에들어간것은 문자열이된다^^
	System.out.println( 123 + 4);  //127
	System.out.println("==============");
	System.out.println("==============");
	System.out.println(12 + "34" + 56);
	System.out.println(12 +34 +"56");
	System.out.println("12" +3 *7);

}

	
	public void test3() {
	
		System.out.println("====문제 2번출력!====");
		System.out.println("=================");
		System.out.println("홍길동\n        \"심사임당\"\n  \t세종대왕\\\"\'\\/");
	}
//		
//	"ShakeIt 알람"
//--------------------------------------------
//흔들기	쏴리질러	터치하기	원터치
//--------------------------------------------
		public void test2() {
			
			System.out.println("===문제 1번출력!====");
			System.out.println("================");
			System.out.println("		\"ShakeIt 알람\"\n---------------"
					+ "-----------------------------\n	흔들기	쏴리질러	터치하기	원터치\n----"
					+ "----------------------------------------\n");
	}

	public void test1() {
		
		System.out.println("안녕");//출력후 개행
		System.out.print("하1");//출력
		System.out.print("하2");//출력
		System.out.print("하3\n\n");//출력 개행 개행
		System.out.print("하\n");//출력 개행
		System.out.print("하4");//출력
		System.out.println("하5\r\n");//더블개행
		System.out.println("하6");
		
		//그는 말했다. "춥다...."
		
		System.out.println("그는 말했다.\"춥다....\"");
		
//		c: \dev\eclipese\eclipse.exe
//		디렉토리 구분자는 역슬래시를 사용한다.
		
//		System.out.println("c: \dev\eclipese\eclipse.exe");  //이렇게하면안된다. 
		System.out.println("c: \\dev\\eclipese\\eclipse.exe");
		System.out.println("c:/dev/eclipse/eclipse.exe");//경로쓸때는 그냥슬래시를써도 무관하다.
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}
	
}
