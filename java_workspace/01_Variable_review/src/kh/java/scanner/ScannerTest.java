package kh.java.scanner;

import java.util.Scanner;

// Scanner
//1.next 계열
//   -next():String
//   -nextInt():int
//   -nextDouble():int
//   -nextBoolean():int
//
//
//2.nextLine 계열 
//  -nextLine(); :String 
//

public class ScannerTest {
	public static void main(String[] args) {

		ScannerTest st = new ScannerTest();
//		st.test();
//		st.test2();
		st.test3();

	}

	//
	// next 계열
	//
	// - 입력버퍼에서 공백이나 개행문자 전까지 읽어서 반환한다.
	// -사용자 입력값 이전의 공백은 무시한다.

	public void test() {

		//
//		//System.out (콘솔)
//		//System.in  (키보드)
//		//import 단축키 컨트롤 쉬프트 o
//		Scanner sc =new Scanner(System.in);
//		System.out.println("이름:");
//		String name=sc.next();
//		System.out.println("name = " + name);

		Scanner sc = new Scanner(System.in);

		// 스캐너호출

//		System.out.print("정수 : ");
//		int num =sc.nextInt();
//		System.out.println("num = " + num);
//		
//		System.out.print("실수 : ");
//		double d = sc.nextDouble();
//		System.out.print("입력한실수 = " +d +"입니다.");
//		
//		
//		System.out.print("참/거짓(true/false) :");
//		boolean bool =sc.nextBoolean();
//		System.out.print("boold =" +bool);
//
//		System.out.print("딱한글짜만 입력:");
//		char ch1 =sc.nextChar();  //next에 char형은없다.
//		System.out.println("입력한 한글자는:"+ch1);

//		System.out.println("딱 한글자만 입력합니다 :");
//		String s = sc.next();
//		
//		char ch= s.charAt(0);
//		 
//		System.out.println("ch = " + ch);
//		위의 선언과 변수 대입을 한줄로 줄일수있따.

//		char ch =sc.next().charAt(0);
//		System.out.println("첫글짜는= " +ch);

		// next 의 특징
		System.out.println("주소를 적으시오");
		String addr = sc.next();

		System.out.println("주소 :" + "[" + addr + "]");

		addr = sc.next();
		System.out.println("주소 :" + "[" + addr + "]");

	}

	    //
	 	// nextLine 계열
		//
		//
		//
		//
		//
		public void test2() {
			
			Scanner sc =new Scanner(System.in);
			
//			System.out.println("이름 :");
//			String name =sc.next();
//			System.out.println("name :" +name);
//			
//			sc.nextLine();  //개행문자 날리기용 넥스트라인입니다.
//			
//			System.out.println("주소 : ");
//			String addr = sc.nextLine();
//			System.out.println("주소 : " +addr);
			
		}
		
			
			//
			//실습 문제 
			//	사용자로 부터 이름, 나이, 주소 , 키(175cm) , 몸무게(70.3kg)을 입력받고
			//	출력라세요
			
			
			
			public void test3() {
				
				Scanner sc =new Scanner(System.in);
			
				
				 System.out.println("이름 :");
				 String name =sc.next();
				 System.out.println("나이 :");
				 int age =sc.nextInt();
				 System.out.println("주소 :");
				 sc.nextLine();
				 String addr =sc.nextLine();
				 System.out.println("키(cm) :");
				 double height =sc.nextDouble();
				 System.out.println("몸무게(kg) :");
				 double weight =sc.nextDouble();
				 
				 System.out.println("이름 :"+ name + "\n나이 :" +age + "\n주소 :" +addr +
						 "\n키(kg) :" + height + "\n몸무기(kg) :" +weight);
				 
	}
}
