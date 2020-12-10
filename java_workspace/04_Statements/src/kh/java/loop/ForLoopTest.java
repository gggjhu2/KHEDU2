package kh.java.loop;

import java.util.Scanner;

public class ForLoopTest {
	public static void main(String[] args) {

//	for문의 모양
//	for(초기식 ;조건식 ;증감식 ){
//	  //반복실행할 코드
//	}
//  =초기식 : for문이 시작하면서 단한번 실행	
//	 -증감 변수  선언
//	=조건식 :조건식의 결과가 true 면 반복문 1회 실행, false 면 반복문 중지
//	=증감식 : 초기식의 증감변수가 증가또는 감소 하도록 처리하는 식이 위치.
//	
//	=처리순서=
//	1.초기식
//	2.조건식-->true
//	3.반복 실행 코드
//	4.증감식 
//	2.조건식-->true
//	3.반복 실행 코드
//	...
//	.
//	.
//	.
//	5.조건식 -> false 반복문 중지
//	

		ForLoopTest l = new ForLoopTest();
//		l.test();
//		l.test2();
//		l.test3();
//		l.test4();
//		l.test5();
		l.test6();
		
	}

//
//		
//
//
//	public void test() {
//
//			System.out.println("초");
//		// 단독 후위연산자는 전위연산자와 같다.
//			
//			
//		for (int i = 1; i >0 ; i++) {
//			System.out.println("조\n반\n증" +i);
//		}
//		System.out.println("조\n반\n끝");
//	}

//		public void test2() {
//			// 11 12 ....~19
//			
//			
////			for(int i = 11 ; i <12 ; i++) {
////				System.out.print("11 12 13 14 15 16 17 18 19 20 ");
////			}
////			
////			//1 부터 홀수 10개
////			
////			//홀수 10개 출력
////			for( int i = 1 ; i<=19;i+=2) {
////				
////				 System.out.print(i + "   ");
////				
////			}
//			// 짝수 10개 출력
//			
//			for(int i =10 ; i<0 ; i--)	
//				{
//				
//				System.out.print( i*2 + " ") ;
//			
//				}
//			
//	
//	규규 댠 짜기
//	

//	public void test3() {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단수를 입력해주세요");
//		int dan = sc.nextInt();
//
//		for (int i = 1; i <= 9; i++) {
//
//			System.out.println(dan + "*"+(dan*i) + " = " + (dan * i));
//		}
//
//	}
	
//	
//	실습 문제 : 사옹자에게 이름을 입력 받고 , 숫자를 입력 받아서
//	해당 이름을 해당 횟수만큼 반복 출력하세요.
//	
//	public void test4() {
//		
//		String name;
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용자 이름 : ");
//		name = sc.nextLine();
//		System.out.print("반복 횟수 : ");
//		num = sc.nextInt();
//		for(int i = 0; i<num;i++) {
//			System.out.println(name);
//		}
//	}
//	}
	
//	합계구하기
//		1~10 합계구하기.
//	
//	1 + 2 + ...... + 9 + 10	
//	
//	public void test5() {
//		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("XX까지의 수의 합을 구해드려요 입력해보세용 :");
//	    long max = sc.nextLong();
//		
//		long sum =0;
//		
//		for(int i = 1 ; i<=max ; i++) {
//			
//			sum+= i ; //sum =sum +i;
//		}
//		
//		System.out.println("합계 :" + sum);
//		
//		
//	}
//	
//	// 1, 2, 3, .....출력하기
//	
//	
//	public void test6() {
//		
//		
//		
//		for (int i = 1 ; i <11 ; i++) {
//			if(i == 10) {
//			System.out.print(i+" ");
//			}else {
//				System.out.print(i+", ");
//			}
//		}
//		
public void test6() {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = sc.next();
	System.out.println("name = " + name);
		
		
		
	}


}










