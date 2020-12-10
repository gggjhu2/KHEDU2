package kh.java.condition;

import java.util.Scanner;

public class SwitchConditionTest {

	public static void main(String[] args) {

		SwitchConditionTest s = new SwitchConditionTest();
//		s.test1();
//		s.test2();
//		s.test3();
//		s.test4();
//		s.test5();
//		s.test6();
		

//		System.out.println("===프로그램종료==="); //test2 에서사용한것

	}

//		(boolean , float  , double, long 은 불가능)
//	 byte  short char int String 으로 처리되변수 또는 계산식.또는 열거형으로 처리되는 변수또는 계산식.
//	//switch(변수 또는 계산식)
//	case 값1 : 처리구문 1; break;
//	case 값2 : 처리구문 2; break;
//	 ---(case문의 갯수 제한은없다.)
	// default : 기본 처리구문; (default 문은 써도되고 안써도되는, 생략가능)
//	
//  계산식의 값이 일치하는 해당 case문이 실행되고,	
//	break 문을 만나면 switch 문을 빠져나온다.
//	
//	if문과 가장 큰 차이는 if는 참이냐아니냐이지만 스위치문은 계산식이다.
//	
//	
//	**범위 처리는 switch 문 사용이 불편하다.
//	

//	public void test1(){
//		
//		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("어떤 과일을 좋아하세요? 1.에아뽀올 2.버네너 3.오릔즤");
//		
//		int num =sc.nextInt();
//		
//		switch(num){
//			case 1:System.out.println("사과는빨개!"); break;
//			case 2:System.out.println("바나나는길어!"); break;
//			case 3:System.out.println("어릔즤는...."); break;
//			default :System.out.println("잘못 입력 하셨습니다.");//디폴트는 브레이크가필요없다.
//		}
//		
//	public void test2() {
//
//		Scanner sc = new Scanner(System.in);
//		String menu = "===============\n" + "\t오늘의 메뉴\n" + "1.순대국\n" + "2.미역국\n" + "3.김치찌게\n" + "================\n"
//				+ "선택 :";
//		System.out.println(menu);
//
//		int num = sc.nextInt();
//		int price = 0;
//		switch (num) {
//
//		case 1:
//			System.out.println("case1 실행!");
//			price = 7000;
//			break;
//			
//		case 2:
//			System.out.println("case2 실행!");
//			price = 8000;
//			break;
//		case 3:
//			System.out.println("case2 실행!");
//			price = 8000;
//			break;
//			default : System.out.println("잘못 입력하셨습니다.");
//			return;//조기리턴 문  : 이하코드는 실행하지않고,메소드 호출부로 돌아감.
//			
//		}
//		
//		System.out.println(price+"원을 지불해주세요");
////		return;//이것이 생략되어있다
//		
//	}

//	public void test3() {

	// 범위처리는 switch문 사용이 불편하다.
	// but 그렇다고 못할건아니다.
	//
//				int mark = 100;
//				char grade = ' ';
//				switch(mark) {
//				case 100 : grade = 'A'; break;
//				case 99 : grade = 'A'; break;
//				case 98 : grade = 'A'; break;
//				case 97 : grade = 'A'; break;
//				case 96 : grade = 'A'; break;
//				case 95 : grade = 'A'; break;
//				}30...grade..grade..grade..grade..grade.
//		위의 구문을  처리하는걸해보겟다
//		int mark = 100;
//		char grade = ' ';
//		switch (mark) {
//
//		case 100: System.out.println(100); 
//		case 99:  System.out.println(99); 
//		case 98:  System.out.println(98); 
//		case 97:  System.out.println(97); 
//		case 96:  System.out.println(96); 
//		case 95:  System.out.println(95); 
//		case 94:  System.out.println(94); 
//		case 93:  System.out.println(93); 
//		case 92:  System.out.println(92); 
//		case 91:  System.out.println(91); 
//		case 90:  System.out.println(90); 
//			grade = 'A';
//			break;
//		case 89:
//		case 88:
//		case 87:
//		case 86:
//		case 85:
//		case 84:
//		case 83:
//		case 82:
//		case 81:
//		case 80:
//			grade = 'B';
//			break;
//		case 79:
//		case 78:
	// 위처럼 가능하다...
//		int mark = 100;
//		char grade = ' ';
//		String m = "";
//		switch (100) {
//		//fall through 라고한다.
//		case 100: System.out.println(100);  m += "안";
//		case 99:  System.out.println(99);   m += "녕";
//		case 98:  System.out.println(98);   m += "하";
//		case 97:  System.out.println(97);   m += "세";
//		case 96:  System.out.println(96);   m += "요";
//		case 95:  System.out.println(95);   m += "여";
//		case 94:  System.out.println(94);   m += "러";
//		case 93:  System.out.println(93);   m += "분";
//		case 92:  System.out.println(92);   m += "잘";
//		case 91:  System.out.println(91);   m += "가";
//		case 90:  System.out.println(90);   m += "요";
//			grade = 'A';
//			break;
//		case 89:
//		case 88:
//		case 87:
//		case 86:
//		case 85:
//		case 84:
//		case 83:
//		case 82:
//		case 81:
//		case 80:
//			grade = 'B';
//			break;
//		case 79:
//		case 78:
//
//		}
//		System.out.println(m);
//	}

//	
//	90~100A
//	80~89B
//	70~79C
//	60~69D
//	~~59 F
//	
//	public void test4() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 :");
//		int n = sc.nextInt();
//		char grade = ' ';
//		switch (n / 10) {
//
//		case 10:
//			
////			break;// 이건 /fall through 를이용해서 없어도된다
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
//
//		System.out.println("학점 : " + grade);
//
//	}
//	public void test5() {
//		
//
//		Scanner sc = new Scanner(System.in);
//		String menu = "===============\n" + "\t오늘의 메뉴\n" + "1.순대국\n" + "2.미역국\n" + "3.김치찌게\n" + "================\n"
//				+ "선택 :";
//		System.out.println(menu);
//
//		int num = sc.nextInt();
//		int price = 0;
//		switch (num) {
//
//		case 1:
//			System.out.println("case1 실행!");
//			price = 7000;
//			break;
//			
//		case 2:
//			System.out.println("case2 실행!");
//			price = 8000;
//			break;
//		case 3:
//			System.out.println("case2 실행!");
//			price = 8000;
//			break;
//			default : System.out.println("잘못 입력하셨습니다.");
//			return;//조기리턴 문  : 이하코드는 실행하지않고,메소드 호출부로 돌아감.
////	}
//		public void test6() {
//			// 사용자 선택에 따라 가격을 출력하세요
//			int choice = menu();
//			//사용자 선택에 따라 가격을 출력하세요
//			if(choice!=-1)
//				System.out.println("가격은 "+choice+"원 입니다.");
//		}
////		public int menu() {
//			System.out.print("메뉴를 입력하세요 1.밥 2.국 3.반찬 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			switch(input) {
//			case 1:
//				return 1000;
//			case 2:
//				return 2000;
//			case 3:
//				return 500;
//			default:
//				return -1;
//			}
//			/**
//			 * @실습문제 : 메뉴를 출력하고, 사용자선택값을 리턴하는
//			 * menu 메소드를 생성하세요.
//			 * 선택값이 메뉴에 없다면, -1을 리턴.
//			 * 
//			 */
////			public void test5() {
//			int choice = menu();
//			//사용자 선택에 따라 가격을 출력하세요
//			if(choice!=-1)
//				System.out.println("가격은 "+choice+"원 입니다.");
//		}
//		public int menu() {
//			System.out.print("메뉴를 입력하세요 1.밥 2.국 3.반찬 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			switch(input) {
//			case 1:
//				return 1000;
//			case 2:
//				return 2000;
//			case 3:
//				return 500;
//			default:
//				return -1;
//			}
//		}
			
		}
