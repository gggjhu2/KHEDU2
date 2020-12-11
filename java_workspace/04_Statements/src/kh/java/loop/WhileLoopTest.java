package kh.java.loop;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {

		WhileLoopTest w = new WhileLoopTest();
//		w.test1();
//		w.test2();
//		w.test3();
//		w.test4();
//		w.test5();
//		w.test6();
//		w.test7();
		w.test8();
		
	}
	// *while 조건식*
	// [초기식]
	// while(조건식){
	// //반복 실행구문
	// [증감식]
	//
	// }
	//

//	public void test1() {
//			
//		//for 문 복습 헬로 월드 10번반복(모든 포문과 와일문은 100프로 대채가능하다)
////		for(int i =0 ; i <10 ; i++) {
////			System.out.println("Hell");
////	}
//			//while 문 으로 바까본다,
//		
//		int i = 1;
//		while ( i <=10) {
//			
//			System.out.println("Hello world" +"\t"+ i+"번쨰");
//			i++;
//		}

//	public void test2() {
//				// 1 2 3 4 5 6 7 8 9 10
//				int i = 0;
//				while (i < 10) {
//					i++;
//					System.out.print(i + " ");
//				}
//				System.out.println();
//				
//				
//				// 1 3 5 7 9 11 13 15 17 19
//				int i2 = 1;
//				while (i2 < 20) {
//					System.out.print(i2 + " ");
//					i2 += 2;
//				}
//				System.out.println();
//				
//				
//				// 2 4 6 8 10 12 14 16 18 20
//				int i3 = 0;
//				while (i3 < 20) {
//					i3++;
//					if (i3 % 2 == 0) {
//						System.out.print(i3 + " ");
//					}
//				}
//				System.out.println();
//				
//				
//				// 10 9 8 7 6 5 4 3 2 1
//				int i4 = 10;
//				while (i4 <= 10 && i4 >= 1) {
//					System.out.print(i4 + " ");
//					i4--;
//				}
//				System.out.println();
//				
//				// 20 18 16 14 12 10 8 6 4 2
//				int i5 = 20;
//				while (i5 <= 20 && i5 >= 2) {
//					System.out.print(i5 + " ");
//					i5 -= 2;

//				//while 무한 순환 문	(반복문을 중지할수있는 코드를 써줘야한다)
//				while(true) {
//					System.out.println("HI");
//					//반복문중지코드 break는 이따 설명
//					break;
//				}
//				 System.out.println("");
//				
//				 for( ; ; i++) {
//					
//					System.out.println("hi2");
//					//반복문 중지코드 break 
//				}  //이또한 무한반복코드다
//					
//					
//
//				public void test3() {	
//		
//					int dan =8;
//					int g=1;
//					while(g<10) {
//						System.out.println(dan+"X"+ g +"= " +g);
//						g++;
//					}
//					System.out.println("구구단끄읏");
//					

//				실습 문제 : 사옹자에게 양수하나를 입력받고,
//					1부터 입력한 수 사이의 3의 배수 개수를 출력하세요.
//	
//				public void test4() {	
//					Scanner sc = new Scanner(System.in);
//					int N = sc.nextInt();
//					int i = 1;
//					int cnt = 0;
//					while(i<=N) {
//						if(i%3==0)
//							cnt++;
//							i++;
//					}
//					System.out.println("3의 배수의 개수는" + cnt + "개 입니다.");
//				
//				

//			do while 문은 ((조건문을 한번만 실행시켜보자라는 의도))
////	
//			public void test5() {
//					Scanner sc = new Scanner(System.in);
//					char yn =' ';
////					int i = 0;
////					
////					
////					while(i>0) {
////						System.out.println("hello");
////						i++;
////					}
//			
//					do {
//						System.out.println("게임 시작!");
//						//게임 관련코드 블라블라 작성
//						System.out.println("게임끝!");
//						System.out.println("한판 더 하시겠습니까?(y/n) :");
//						yn =sc.next().charAt(0);
//						
//						
//					} while (yn =='y');
//					System.out.println("===게임종료===");

//			public void test6() {
//				
//				Scanner sc = new Scanner(System.in);
//				String menu = "========\n"
//							+"1.참치 김밥===2500원\n"
//							+"2.멸치 김밥===3500원\n"
//							+"3.양치 김밥===500원\n"
//							+"=========\n"
//							+"선택 : ";
//				char yn ='y';
//				int sum =0;
//			do {
//				System.out.println("menu");
//				int num = sc.nextInt();
//				System.out.println(num + "을 선택 하셨습니다.");
//				//금액 누적 합계 쌓아서 구하기.
//				switch(num) {
//				case 1 : sum +=2500 ; break;
//				case 2 : sum +=2500 ; break;
//				case 3 : sum +=500 ; break;
//				default : System.out.println("잘못입력하셨습니다.");
//				}
//				
//				System.out.println("추가 주문을 하시겠습니까?(y/n) :");
//				yn = sc.next().charAt(0);
//			
//			}while (yn == 'y');
//				System.out.println("결제할 금액은 총["+sum +"]" +"입니다.");
//				System.out.println("===주문 완료!===");
//			}
//				
	// 실습문제 : 사옹자에게 2~9 사이의 단수를 입력 받고, 해당단수의 구구단을 출력하세요.
	// 계속 할지여부를 물어보고. 반복 실행합니다.
//	public void test7() {
////				Scanner sc = new Scanner(System.in);
////				System.out.println("구구단단수를 입력해주세요");
////				int dan = sc.nextInt();
////		
////				int g = 1;
////				while (g < 10) {
////					if (dan <= 1 || dan >= 10) {
////						System.out.println("잘못 입력하셨습니다.");
////						return;
////					} else if (dan > 1 && dan < 10) {
////						System.out.println(dan + "X" + g + "= " + g);
////						g++;
////					}
////		
////					System.out.println("구구단끄읏");
////				}
//		// 내가 풀어본거지만 한번만물어보고 끝나서 선생님 코드 참고 ==>한번물어보고 계속물어보는것.
//
//		Scanner sc = new Scanner(System.in);
//		char yn = 'y';
//		do {
//			// 1.단수 입력
//			System.out.print("구구단 몇단을 출력할까요?(2~9) : ");
//			int dan = sc.nextInt();
//			// 2.유효성검사
//			if (dan >= 2 && dan <= 9) {
//				// 3.구구단 출력
//				int i = 1;
//				while (i < 10) {
//					System.out.println(dan + " * " + i + " = " + (dan * i));
//					i++;
//				}
//				// 4.계속실행여부 입력
//			} else {
//				System.out.println("잘못 입력하셨습니다.");
//				System.out.print("계속 콜?(y/n) : ");
//				yn = sc.next().charAt(0);
//			}
//		} while (yn == 'y');
//		System.out.println("프로그램 종료!");
		
	
	//  메뉴 관리
	//
		public void test8() {
			
			Scanner sc =new Scanner(System.in);
			String mainMenu = "============\n"
							+ " 1.저장\n"	
							+ " 2.목록\n"
							+ " 3.업데이트\n"
							+ " 4.삭제\n"
							+ " 0.프로그램종료\n"
							+ "==========\n"
							+"선택 : " ;
			
		
			int choice =0;
			
			do {
				System.out.println(mainMenu);
				choice = sc.nextInt();
				switch(choice) {
				case 1: save();break;
				case 2: selectLsit();break;
				case 3: update();break;
				case 4: delete();break;
				case 0: System.out.println("프로 그램을 종료합니다");
				return ;
				
				}
			}while(choice !=0);
		
		}	
		public void save() {System.out.println("save 를 선택하셨습니다");}
		public void selectLsit() {System.out.println("selectList 를 선택하셨습니다");}
		public void delete() {System.out.println("delete 를 선택하셨습니다");}
		public void update() {
				Scanner sc =new Scanner(System.in);
				String updateMenu = "============\n"
							+ " 1.이름수정\n"	
							+ " 2.전번수정\n"
							+ " 3.주소수정\n"
							+ " 0.메인메뉴로돌아가기\n"
							+ "==========\n"
							+"선택 : " ;
			
		
				int choice =0;
			
				do {
				System.out.println(updateMenu);
				choice = sc.nextInt();
				switch(choice) {
				case 1: System.out.println("이름을 수정하겠습니다.");;break;
				case 2: System.out.println("전번을 수정하겠습니다.");;break;
				case 3: System.out.println("주소를 수정하겠습니다.");break;
				case 0: return;
				default :System.out.println("메인메뉴로돌아갑니다.");
				
				}
				}while(choice !=0);
			
			System.out.println("update 를 선택하셨습니다");}

}
