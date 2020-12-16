package kh.java.tow.dimentional.array;

public class TowDimentionalArray {

	public static void main(String[] args) {
		TowDimentionalArray tda = new TowDimentionalArray();
//		tda.test1();
//		tda.test1_1();
//		tda.test1_2();
//		tda.test2();
//		tda.test3();
		tda.test4();

	}
	// 2차원 배열
	// {{1,2,3},{4,5,6},{7,8,9}}
	// aee[0][0] --->1
	// aee[0][1] --->2
	// aee[0][2] --->3
	//
	// aee[1][0] --->4
	// aee[1][1] --->5
	// aee[1][2] --->6
	//
	// aee[2][0] --->7
	// aee[2][1] --->8
	// aee[2][2] --->9
	//

//	public void test1() {
//
//		//1.배열 선언
//		int [][] arr ;
//		
//		
//		
//		//2.힙영역 배열할당.
//		arr =new int[2][3];
//		//타입당 기본세팅 배정
//		
//		
//		//3. 값대입
//		
//		arr [0][0]=1;
//		arr [0][1]=2;
//		arr [0][2]=2;
//
//		arr [1][0]=4;
//		arr [1][1]=5;
//		arr [1][2]=6;
//		
//		
//		//4. 값 출력
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);

//	public void test1_1() {
//		
//		//1.배열 선언
//		int [][] arr ;
//		
//		
//		
//		//2.힙영역 배열할당.
//		arr =new int[2][3];
//		//타입당 기본세팅 배정
//		
//		
//		//3. 값대입
//		
//		arr [0][0]=1;
//		arr [0][1]=2;
//		arr [0][2]=2;
//
//		arr [1][0]=4;
//		arr [1][1]=5;
//		arr [1][2]=6;
//		
//		
//		
//		//행 : arr.length
//		//열 : arr.[0].length
//		//i = 0,1
//		for(int i = 0; i < arr.length; i++) {
//			//j : 0,1,2
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//		

	public void test1_2() {

		// 1.배열 선언
		int[][] arr;

		// 2.힙영역 배열할당.
		arr = new int[2][3];
		// 타입당 기본세팅 배정

		// 3. 값대입
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 2;
//
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
		// 이부분의 일정한규칙이있을때
		// 일정한규칙이있는 경우 값대입도 포문을이용해 대입할수잇다.
		// ===**대입할 값사이의 규칙성이 있을때 중첩반복문사용가능**==
		// 위의 일일히 넣는 방식 을 아래 이중포문으로 가능하다.
		int k = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

//					arr[i][j] = k;//
//					k++;//
				arr[i][j] = k++;// 한줄로줄이는것도가능하다
			}
		}

	}

	// 행 : arr.length
	// 열 : arr.[0].length
	// i = 0,1
//		for (int i = 0; i < arr.length; i++) {
//			// j : 0,1,2
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
//
//	}
	//
	// 2차원 배열의 초기화
	//
	// 선언, 배열 할당, 값대입

	public void test2() {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.println(arr[i][j] + " ");
		}
		System.out.println();

	}

	//
	// 실습 문제 : 알파벳 배열
	// +
	// 0행 대문자 26개
	// 1행 소문자 26개
	//
	// char[][]을 생성하세요.

	public void test3() {

//		char[][] arr = new char[2][26];
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(i==0) {
//					arr[i][j]=(char)(j+'A');
//				}else {
//					arr[i][j]=(char)(j+'a');
//				}
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();

		char[][] arr = new char[2][26];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) ((i == 0 ? 'A' : 'a') + j); // i는 0또는 1 i==0 true라며 'A' false라면 'a'
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	//
	// 2차원 배열의 이해
	//
	// -배열안의 배열
	//
	// -참조의 참조
	//
	public void test4() {

		int[][] arr = new int[2][3];

		int k = 100;
		// int[][]의 길이 : 첫번쨰 가리키는 배열의 길이
		for (int i = 0; i < arr.length; i++) {

			// int[]의 길이 : 두번째 가리키는 배열의 길이
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = k++;

				System.out.print(arr[i][j]);

			}

			System.out.println();
		}

	}

}
