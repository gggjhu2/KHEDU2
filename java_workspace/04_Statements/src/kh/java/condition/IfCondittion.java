package kh.java.condition;

import java.util.Scanner;

public class IfCondittion {

	public static void main(String[] args) {

		IfCondittion ict = new IfCondittion();

//		ict.test1();
//		ict.test2();
//		ict.test3();
//	    ict.test4();
//		ict.test5();
//		ict.test6();
//		ict.test7();
//		ict.test8();
	}

//   1.if
//   2.if else		
//	 3.if else if  else

//	public void test1() {
//		// 참이면 두개 다 출력 거짓이면 탈출
//		int n = 10;
//		if (++n > 1) {
//
//			System.out.println("if 절이 실행되었습니다."); // 트루 실행문
//		}
//
//		System.out.println("==Test1 종료===");// 탈출
//
//	}
//		
//	.if  ...else
//    -true		
//	  -else 
//	
//	public void test2() {
	// 사용자로 부터 수를 입력받고, 그 수가 짝수인지 홀수 인지 출력!

//			
//			int n =3;
//			if( n > 0 ) {
//				
//				System.out.println("if 절이 실행되었습니다.");
//				
//			}
//			else {
//				
//				System.out.println("else 절이 실행 되었습니다.");
//			}
//			
//			System.out.println("====test2종료====");
//			
//			 Scanner sc = new Scanner(System.in);
//			 System.out.println("정수 입력 :");
//			 int num =sc.nextInt();
//			 

	// 홀수가 되면 트루가 되는 이프엘스문
//			if( num % 2 !=0 ) {
//				
//				System.out.println("홀수:if 절이 실행되었습니다.");
//				
//			}
//			else {
//				
//				System.out.println("짝수:else 절이 실행 되었습니다.");
//			}
//			
//			System.out.println("====test2종료====");
//			//짝수가 되면 트루가 되는 이프엘스문
//			 if( num % 2 ==0 ) {
//					
//					System.out.println("짝수:if 절이 실행되었습니다.");
//					
//				}
//				else {
//					
//					System.out.println("홀수:else 절이 실행 되었습니다.");
//				}
//				
//				System.out.println("====test2종료====");
//				
//			//예시로 설명 여자면 전단지준다 안준다 if
//			//여자면 왼손에있는전단지 아니면 오른쪽전단지준다 if else

//	}

//		
//			사용자로부터 나이를 입력받고,
//			20세 이상이면 , "성인 인증되었습니다."
//		    20세 미만이면,  "미성년자 입니다.
//		
//		
//	public void test3() {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 입력 :");
//
//		int age = sc.nextInt();
//
//		if (age >= 20) {
//
//			System.out.println(" 성인 인증 되었습니다.");
//
//		} else {
//
//			System.out.println("미성년자입니다.");
//
//		}
//
//	}

//
//	//		삼항연산자 -중첩사용 가위바위보 구현해보기
//
//		//삼항 연산자 -중첩 사용
//		//1.가위 
//2.바위
//3.보
//
//	public void test4() {
//
//		int num = (int)(Math.random()*3)+1;
//		
//			System.out.println(num);
//	    
//			String rockPaperScissors =
//				num ==1 ?
//						"가위" :
//							(num ==2 ? "바위" : "보");
//			System.out.println(rockPaperScissors);
//		

	//
	// if ----else if ---[else...]
	// 1.조건식 1 : 참인경우 해당 if 절 실행, 거짓인경우 다음 조건식 검사 ....~~~
	// 2.조건식 2 :
	// *즉 트루폴스로 쭊내려간다 트루면 해당단계에서 탈출하는것이다.
//	public void test5() {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 점수는 =");
//		int num = sc.nextInt();
//
//		char grade = ' '; // char 의 기본값은 공백
//
//		if (num >= 90) {
//
//			grade = 'A';
//
//		} else if (num >= 80) {
//			grade = 'B';
//		} else if (num >= 70) {
//			grade = 'C';
//		} else if (num >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//
//		}
//		System.out.println("당신의 학점은 =" + grade + "입니다.");
//	}

//	public void test6() {
//
//		// 엘스를 없앴을시에 현상보기
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 점수는 =");
//		int num = sc.nextInt();
//
//		char grade = 'F'; // char 의 기본값은 공백 (기본값을 F로놓을 시 모든조건에해당되지안ㅎ으면 Fㅎ다)
//
//		if (num >= 90) {
//
//			grade = 'A';
//		}
//		if (num >= 80 && num < 90) {
//			grade = 'B';
//		}
//		if (num >= 70 && num < 80) {
//			grade = 'C';
//		}
//		if (num >= 60 && num < 70) {
//			grade = 'D';
//		}
//        //결론은 여러개의 이프문보다는 이프엘스로 간결하게 해결하는게 효율적이고 가시성이좋다.
//		System.out.println("당신의 학점은 =" + grade + "입니다.");
//	}

//	public void test7() {
//
//		//
//		// block scope(범위)
////		// 블럭내에 변수를 선언하면 ,블럭 외부에서 접근할수 없다.
////		if(true) {
////			
////			int num = 100;
////			
////		}
////		System.out.println(num);
////		
////	}
//		// 블럭내에 변수를 선언하면 ,블럭 외부에서 접근할수 없다.==> int numm=100; 을 이프 블럭바깥으로빼면 적용할수잇따.
//		int num = 100;
//
//		if (true) {
//
//		}
//		System.out.println(num);
//
//	}
	
	//
	//
//	public void test8() {
		
		//@실습문제 1
		//  @실습 문제 : 사용자로부터 문자를 입력받고 , 숫자인지 아닌지 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자 / 숫자 분별기 작동합니다.");
//		System.out.println("문자/숫자 입력 : ");
//		char ch = sc.next().charAt(0);
//		
//		
//		if(ch >='0' && ch <='9') {
//			
//			System.out.println("[" + ch + "] 는 숫자입니다.");
//		}
//		
//		else {
//			
//			System.out.println("[" + ch + "] 는 숫자가 아닙니다.");
//		}
//		
		//@실습문제 2
		//  =숫자인지 영문자인지 한글인지 여부를 출력하세요.
		//   '가' ~ '힣'  ==>유니코드 한글의 처음과 끝 
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자 / 숫자/ 영문/한글 분별기 작동합니다.");
//		System.out.println("문자/숫자 /영문 /한글 입력 : ");
//		
//		char ch = sc.next().charAt(0);
//		
//		ch = '\u11aa';
//		
//		if(ch >='0' && ch <='9') {
//			
//			System.out.println("[" + ch + "] 는 숫자입니다.");
//		}
//		
//		else if(ch='A' && ch ) {
//			
//			System.out.println("[" + ch + "] 는 숫자가 아닙니다.");
//		}
//		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

