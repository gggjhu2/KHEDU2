package kh.java.loop;

//  초기 식
//while(조건식){
// 증감식
////반복 실행구문
//증감식
//}

public class WhileLoopTest_r {

	public static void main(String[] args) {

		WhileLoopTest_r w = new WhileLoopTest_r();
//		w.test1();
//		w.test2();
//		w.test3();
//		w.test4();
//		w.test5();
//		w.test6();
//		w.test7();

	}
}

	//
	// for 문을 while 문으로 바꿔보기

//	public void test1() {
//
////		for (int i = 0; i < 11; i++) {
////			System.out.printf("%d 번 반복 %n", i);
////		}
//		int i = 0;
//		while (i < 11) {
//			i++;
//			System.out.printf("%d 번 반복  %d 번째 출력 %n", i, i, i);
//		}
//
//	}
//
//	// 연습 문제
//	public void test2() {
//		// 1 2 3 4 5 6 7 8 9 10
////		int i =1;
////		while (i<11) {
////			System.out.print(i + " ");
////			i++;
////		}
//
//		// 1 3 5 7 9 11 13 15 17 19
//		System.out.println("===1번문제=");
//		int j = 0;
//		while (j < 20) {
//			j++;
//			if (j % 2 != 0) {
//				System.out.print(j + " ");
//			}
//		}
//		System.out.println("\n\n===2번문제===");
//
//		// 2 4 6 8 10 12 14 16 18 20
//		int k = 0;
//		while (k <= 20) {
//			k++;
//			if (k % 2 == 0) {
//				System.out.print(k + " ");
//			}
//		}
//
//		// 10 9 8 7 6 5 4 3 2 1
//		System.out.println("\n\n===3번문제===");
//		int l = 10;
//		while (l >= 1) {
//			System.out.print(l + " ");
//			--l;
//		}
//		// 20 18 16 14 12 10 8 6 4 2
//		System.out.println("\n\n===4번문제===");
//		int m = 20;
//		while (m > 1) {
//			if (m % 2 == 0) {
//				System.out.print(m + " ");
//			}
//			--m;
//
//		}
//		System.out.println("\n\n선생님 풀이방식==========\n==========\n========");
//		// 1 3 5 7 9 11 13 15 17 19
//		System.out.println("===1번문제=");
//		int a = 1;
//		while (a < 20) {
//			System.out.print(a + " ");
//			a += 2;
//		}
//		System.out.println();
//		System.out.println("\n===2번문제===");
//
//		// 2 4 6 8 10 12 14 16 18 20
//		int b = 2;
//		while (b <= 20) {
//			System.out.print(b + " ");
//			b += 2;
//		}
//
//		// 10 9 8 7 6 5 4 3 2 1
//		System.out.println("\n\n===3번문제===");
//		int c = 10;
//		while (c > 0) {
//			System.out.print(c + " ");
//			--c;
//		}
//		// 20 18 16 14 12 10 8 6 4 2
//		System.out.println("\n\n===4번문제===");
//		int d = 20;
//		while (d > 1) {
//
//			System.out.print(d + " ");
//			d -= 2;
//		}
//	}
//
//	//
//	// 구구 단 출력
//	// 아래와같은 방식으로 포문을 이용하여 구현해보자.
//	// 예 ) dan * su = dam*su
//	//
//	public void test3() {
//
//		final int dan = 8;
//		int su = 1;
//		// 8단을 2중포문을통해 구현해보았다.
////			for( dan=8; dan<9;dan++) {
////				for(su=1 ; su<10 ; su++) {
////					System.out.println(dan+" * "+ su +"="+ dan*su  );
////				}
////				}
//
//		// while문 을 통해 구현해보자
//
//		while (su < 10) {
//			System.out.println(dan + " * " + su + "");
//			su++;
//
//		}
//		System.out.println();
//	}
//
//	// 실습 문제 : 사용자에게 양수하나를 입력받고,
//	// 1부터 입력한 수 사이의 3의 배수 개수를 출력하세요
//	//
//	public void test4() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("양수를 입력해주세용");
//		int N = sc.nextInt();
//
//		int i = 1;
//		int cnt = 0;
//
//		while (i <= N) {
//			if (i % 3 == 0)
//				cnt++;
//			i++;
//		}
//
//		System.out.println("3의 배수의 개수는" + cnt + "개입니다.");
//
//	}
//
//
//	// do{한번은 실행되길바라는문장}
//	// while(조건식){
//	// 반복 조건문 증감연산자
//	// }
//	public void test5() {
////			int i =1;
////			do {
////				System.out.println("hellpo!"+i);
////				i++;
////			}while( i <0);
//		Scanner sc = new Scanner(System.in);
//		char yn = ' ';
//		int i = 1;
//		do {
//			System.out.println("게임시작!");
//			// 게임중...
//			System.out.println("게임 끝!");
//			System.out.println("한판더?(y/n)");
//			yn = sc.next().charAt(0);
//		} while (yn == 'y');
//		{
//
//			System.out.println("--게임 종료--");
//
//		}
//	}
//
//	public void test6() {
//		Scanner sc = new Scanner(System.in);
//		String menu = "======\n" + "1.참치김밥---2400원\n" + "2.1김밥---2100원\n" + "3.2치김밥---2200원\n" + "선택 :";
//		char yn = ' ';
//
//		do {
//			System.out.println(menu);
//
//			int num = sc.nextInt();
//			System.out.println(menu + "을 선택했습니다.");
//			System.out.print("추가 주문 하시겠?y/n:");
//			yn = sc.next().charAt(0);
//		} while (yn == 'y');
//		{
//			System.out.println("====주문완료=====");
//		}
//	
//	}
//
//	// 실습 문제
//	// 사용자에게 2~9 사이의 단수를 입력받고,
//	// 해당 단수의 구구단을 출력하세요.
//	// 단, 2~9사이의 수가 아니라면 잘못입력하셨습니다~출력

//	public void test7() {
//		Scanner sc =new Scanner(System.in);
//		
//		int su=1;
//		
//		char yn ='y';
//		
//		do {
//			//1.단수 입력
//			System.out.println("구구단 단수를 입력하세요");
//			
//			int dan =sc.nextInt();
//			//2.유효성 검사
//			if(dan>=2 && dan<=9) {
//			
//			int i = i ;
//			while(i<10); {
//				System.out.println(dan + " * " + i + " = " + (dan*i));
//				i++;
//			}
//			//4.계속 실행여부 입력
//			System.out.println("계속?y/n");
//			yn =sc.next().charAt(0);
//			}else{
//					System.out.println("잘못 입력하셨습니다.");
//			}
//			
//		
//		
//	
//			
//		
//	
