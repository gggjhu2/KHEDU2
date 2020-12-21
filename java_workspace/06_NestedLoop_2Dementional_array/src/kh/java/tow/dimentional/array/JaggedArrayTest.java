package kh.java.tow.dimentional.array;

import java.util.Scanner;

//
//가변 배열 JaggedArray 
//int[][] arr = new int[3][2];
//참조의 참조
//
//참조의 참조인 배열의 길이가 제각각인 배열
//
//
//
public class JaggedArrayTest {

	public static void main(String[] args) {

		JaggedArrayTest jat = new JaggedArrayTest();
//		jat.JaggedArrayTest();
		jat.test();
	}

	public void JaggedArrayTest() {
		int[][] arr = new int[3][];

		// 2차원 배열 할당
		arr[0] = new int[10];
		arr[1] = new int[3];
		arr[2] = new int[7];

		// 값 입력

		int k = 0;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = k++;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	// @실습문제:
	// 구매목록 입력 받습니다.
	// 의류 5종류 , 식료품 2종료 , 기타물품3종류 담을수 있는
	// 가변 배열을 선언하고, 사용자로부터 각각 입력 받으세요.
	public void test() {

		
//		System.out.println("구매할 의류 목록 :");
//		list[0][0]= sc.next();
//		list[0][1]= sc.next();
//		list[0][2]= sc.next();
//		list[0][3]= sc.next();
//		list[0][4]= sc.next();
//		
//		System.out.println("구매할 식료품 : ");
//		
//		list[1][0] = sc.next();
//		list[1][0] = sc.next();
//
//		System.out.println("구매할 기타물품:");
//		
//		list[2][0] = sc.next();
//		list[2][1] = sc.next();
//		list[2][2] = sc.next();
		// ==============================위처럼 일일히 받을수있는것을
		// 포문을 써서 입력받는걸 구현해본다.

		// 갑 입력받기
//		for (int i = 0; i < list.length; i++) {
//			if (i == 0) {
//				for (int j = 0; j < list[0].length; j++) {
//					System.out.println("구매할 의류 입력 : ");
//					list[0][j] = sc.nextLine();
//				}
//			} else if (i == 1) {
//				for (int j = 0; j < list[0].length; j++) {
//					System.out.println("구매할 식료품 입력 : ");
//					list[1][j] = sc.nextLine();
//				}
//			} else {
//				for (int j = 0; j < list[0].length; j++) {
//					System.out.println("구매할 기타물품 입력 : ");
//					list[2][j] = sc.nextLine();
//				}
//			}
//		}
//		// 출력
//		for (int i = 0; i < list.length; i++) {
//			for (int j = 0; j < list[i].length; j++) {
//				System.out.print(list[i][j]);
//			}
//			System.out.println();
//		}
		String[][] buyArr = new String[3][];
		buyArr[0] = new String[5];
		buyArr[1] = new String[2];
		buyArr[2] = new String[3];
		Scanner sc = new Scanner(System.in);
		//입력
		for(int i = 0; i < buyArr.length; i++) {
			switch(i) {
			case 0: System.out.print("의류 "); break;
			case 1: System.out.print("식료품 "); break;
			case 2: System.out.print("기타물품 "); break;
			}
			System.out.println(buyArr[i].length + "가지를 입력하세요.");
			for(int j = 0; j < buyArr[i].length; j++) {
				System.out.print(j + 1 + " : ");
				buyArr[i][j] = sc.next();
			}
		}
		//출력
		for(int i = 0; i < buyArr.length; i++) {
			switch(i) {
			case 0: System.out.print("의류 : "); break;
			case 1: System.out.print("식료품 : "); break;
			case 2: System.out.print("기타물품 : "); break;
			}
			for(int j = 0; j < buyArr[i].length; j++) {
				System.out.print(buyArr[i][j]);
				System.out.print((j != buyArr[i].length - 1) ? ", " : "");
			}
			System.out.println();

	}
}
}
