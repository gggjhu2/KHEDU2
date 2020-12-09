package kh.java.scanner;

import java.util.Scanner;

public class ScannerTest {

//	
//  Scanner (두가지계열로나뉜다)	
//	1.next계열
//	  -nexst()	         ==>String 을 돌려준다.   (nextChar 는 안만들어져있는기능이다)
//	  -nexstInt()		 ==> Int     ...
//	  -nextDoublue()	 ==>....	...
//	  -nextBoolean()	 ==>...		...
//	  
//	2.nextLine계열
//	  -nextLine()        ==>String 을 반환
//	
//	
	public static void main(String[] args) {

		ScannerTest s = new ScannerTest();
//		s.test1();
//		s.test2();
//		s.test3();

	}

	
     //next 계열 사용	
	 //-입력버퍼에서 공백이나 개행문자 전까지 읽어서 반환한다.         (next의 작동방식)
	 //-사용자 입력값 이전의 공백은 무시한다.	/개행문자는 무시한다.		  (===========)
	 //import 가 필요할때는 컨트롤 쉬프트 o를 누르면 해당 매소드사용시에 필요한
	 //클래스 위치를 임포트하는것을 자동처리
	  public void test1() {
		
     //System.out   표준출력(콘솔에출력)
	 //System.in    표준입력(키보드)
   	 //(인풋  아웃풋의 기준은 JVM을 기준으로 이루어진다.단,이기준은얼마든지바뀔수있다.)
	 //	(예로 JVM에 어떤프로그램이들어오는것 을인풋 JVM에서 어떤것이나가는것을 아웃풋)
	 	Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
	//	호출된 값은 실행을마친후 호출된값으로 돌아오는데 그것을 retuern값이라고한다.
		
	//	위 넥스트에 마우스올릴시 api문서 설명이나온다.
	//	String java.util.Scanner.next()  (이같은 메소드주소를 메소드시그니쳐 )
    //   리턴값   패키지 ~   클래스   매소드    (method signature 라고한다.  )
    //                                     =>해당 메소드의 위치 및 리턴타입을 자세히설명해준다.
		System.out.print("name=" + name);
		
		System.out.print("정수 :");
		int num =sc.nextInt();
		System.out.println("num = " + num);
//		
		System.out.println("실수 :");
		double d = sc.nextDouble();
		System.out.println("double =" + d);
  //     *출력을 한다거나 사용자가 입력을하는 모든것은 일단 String으로 입출력이된다.*		
  //	 *그러나 스캐너나 내부 매소드들이 형변환처리를해주는것이다  
		
      System.out.print("참/거짓(true/false) :");
      boolean bool = sc.nextBoolean();
      System.out.print("bool = " + bool);

		System.out.print("딱 한글자만 입력 :");
		//char ch = sc.nextChar();  이런건없다.
		//이런건 다음과같이 구현가능하다.
		String s = sc.next();
		char ch =s.charAt(0);     //charAT(0) 은 문자열의 첫번째것을 출력하라는것이다.
		System.out.println("CH = " + ch);
		//위같이 쓰는것이 fm이고 이것을 줄여서 쓰는방법이있다. 
		
		char ch2 = sc.next().charAt(0);
		System.out.println("ch =" + ch);
		
		//next의 특징
		System.out.print("주소 :");
		String addr = sc.next();
		System.out.println("주소 =" + addr +"]");
		//scanner의 입력 buffer는 공백전까지의 입력만을 담는다.
		System.out.print("주소 :");
		String addr2 = sc.next();
		System.out.println("주소 =" + addr +"]");
		addr = sc.next();
		System.out.println("[주소=" + addr + "]");
		
		System.out.print("주소 :");
		String addr3 = sc.next();
		System.out.print("[주소 =" + addr );
		addr = sc.next();
		System.out.print(" " + addr + "]");
		
		
		
		
		
	}
	// ===========================제일 중요한 부분==========================
   //     nextLine계열	(공백여하 상관없이 풀 출력가능하다)
	//   -*입력버퍼에서 개행문자까지 읽어온후, 개행문자를 제외하고 반환하다.
   //	   -개행 문자 전까지만하고 작업이멈추기때문에 버퍼공간에 남아있는 %n개행을 날려주는
   //	     개행 문자 날리는 명령어를 넣어줘야한다.
   //	===========================제일중요한부분============================
	
//	public void test2() {
//	   
//		
//	   Scanner sc2= new Scanner(System.in);
//	   
//	   System.out.println("이름 : ");
//	   String name2 = sc2.next();
//	   System.out.println("name =" + name2);
//	   String addr2 =sc2.nextLine();   //개행 날리는 문장
//	   System.out.println("주소 : ");
//	   String addr3 =sc2.nextLine();
//	   System.out.println("addr = " + addr2 + addr3);

	public void test3() {
		
		//실습 문제
		//사용자로 부터 이름, 나이 , 주소 키(숫자) ,몸무게 (실수) 를 출력하세요
		
      
       Scanner sc4 = new Scanner (System.in);
       System.out.println("이름(예:김개똥) : ");
       String name = sc4.nextLine();
       System.out.println("주소(예:지구 미국..) : ");
       String addr = sc4.nextLine();
       System.out.println("키(예:cm) : ");
       int height = sc4.nextInt();
       System.out.println("몸무게(예:kg) : ");
       double weight = sc4.nextDouble();
       sc4.close();
       
       System.out.printf("이름은 %s\n"
               + "주소는%s\n"
               + "키는%d\n"
               + "몸무게는%.2f\n"
               , name, addr, height, weight);
//
//	   입력부를 전부 먼저 작성한다.
//     밑에 출력부를 한꺼번에모아서 작성해주면된다
//     (입력문 출력문 입력문 출력문으로가아닌  출력문을 한번에 작성하면 된다.)  
//      *즉  next 문 이후에 nextline 계열을 사용할시에 날려주는 문장 코드한줄만작성해주면된다.**       
//	
}
}


