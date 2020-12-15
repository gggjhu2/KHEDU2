package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
//		n.test4();
//		n.test5();
//		n.test6();
//		n.test7();
		n.test8();

	}

//	public void test1() {
//			
////			for(int i = 0; i < 5; i++) {
////				//System.out.println("<<<"+i+">>>");
////				for(int j = 0; j < 3; j++) {
////					System.out.print("["+ i + "]"+"["+ j + "] ");
////				}
////				System.out.println("");
////			}
////		}
//			for(int i = 0; i < 3; i++) {
//				//System.out.println("<<<"+i+">>>");
//				for(int j = 0; j < 5; j++) {
////					System.out.print("["+ i + "]"+"["+ j + "] ");
//					System.out.print("♬");
//				}
//					System.out.println();
//			}
//			
//			//
//			// 사용자 로부터 행과 열을 입력받고 해당 크기의 별을 출력하세요
//			//
	//
//	public void test2() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("행 :");
//		int row = sc.nextInt();
//		System.out.println("열 :");
//		int col = sc.nextInt();
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print("♬");
//			}
//			System.out.println();
//
//		}
//		
//		//사용자로부터 행과 열을 입력받고 해당크기의 별을 출력하세
//		// 1열의 별은 ☆  나머지열은 ★로 출력하세요
//		//
//	public void test3() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("행 : ");
//		int line = sc.nextInt();
//		System.out.print("열 : ");
//		int column = sc.nextInt();
//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j < column; j++) {
//				if (j == 0)
//					System.out.print("☆☆");
//				else {
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}

	// ====구구단 2단 출력하기 ===
	//
	// 2 * 1 =2
	// 2 * 2 =2
	// 2 * 3 =2
	// 2 * 4 =2
	// 2 * 5 =2
	// 2 * 6 =2
	// 2 * 7 =2
	// 2 * 8 =2
	// 2 * 9 =2
	// ====그그딘 3딘 츨략하기 ===
	// 3 * 1 =2
	// 3 * 2 =2
	// 3 * 3 =2
	// 3 * 4 =2
	// 3 * 5 =2
	// 3 * 6 =2
	// 3 * 7 =2
	// 3 * 8 =2
	// 3 * 9 =2
	// .... 9단까지 출력해보시오

//	public void test4() {
//
//		System.out.println("구구단 출력");
//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("---%d단---%n", i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d%n", i, j, i * j);
//			}
//			System.out.println();
//		}

	//
	// label 이 있는 break문
	//
	// dan * su 의 결과가 300 미만일 때 까지만 출력!
	//
	//

//		public void test5(){
//		
//			System.out.println("구구단 출력");
//			
//			outer: 
//			for(int dan =2 ; dan<=100 ; dan++) {
//				
//				System.out.println("==="+dan + "단 ===");
//				
//				for(int su =1 ; su <=9 ; su++) {
//					if(dan*su>300)
//						break outer;
//					System.out.println(dan+" * " + su + " = " + (dan*su));
//					
//				}
//			System.out.println();
//	}

	// label 이 있는 continue 문
	//
	// 각 단에서 dan, su 가 동일한 때까지 출력
	//
	//
	//
	//
	//
	public void test6() {
		System.out.println("구구단 출력");

		outer: for (int dan = 2; dan <= 9; dan++) {

			System.out.println("===" + dan + "단 ===");

			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				if (dan == su) {
					System.out.println();
					continue outer;
				}
			}
			System.out.println();

		}
	}

	// 실습 문제:
	//
	// ♥
	// ♥♥
	// ♥♥♥
	// ♥♥♥♥
	// ♥♥♥♥♥
	// ♥♥♥♥♥
	//
	public void test7() {

		System.out.println("식전 문제 가보즈아");
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//
	// 식전문제 2
	// 행
	// ▩▩▩ 0일때 3
	// ▩ 1일때 1
	// ▩▩▩ 2일때 3
	// ▩ 3일때 1
	// ▩▩▩ 4일때 3
	//

	public void test8() {
//
//		for(int i = 0; i < 5; i++) {
//			if(i%2==0) {
//			for(int j = 0; j <3; j++) {
//				System.out.print("●");
//				}
//			}
//			else
//				System.out.print("●");
//			System.out.println();
//			내가푼문제

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("●");
				if (i % 2 != 0)
					break;
			}
			System.out.println();
		}
	}
}
