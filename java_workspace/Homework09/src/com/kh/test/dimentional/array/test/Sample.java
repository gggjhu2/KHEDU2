package com.kh.test.dimentional.array.test;

//[2차원 배열 실습문제]
//		 - 클래스 생성 : com.kh.test.dimentional.array.test.Sample.java
//		[문제 1]
//		 - 메소드명 : public void exercise1()
//		 - 구현내용 : 
//		    1. 3행짜리5열 2차원배열 선언 및 생성
//		    2. 1~100사이의 임의의 정수를 모든 방에 기록함
//		    3. 각 행별 열의 합계가 5의 배수인 행열값만 출력함

public class Sample {

	public static void main(String[] args) {

		Sample s=new Sample();
		s.exercise1();
		System.out.println("====연습1 종료");
		s.exercise0();
		
	}

	public void exercise1() {
		int[][] arr = new int[3][5];
		int[] sum = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] += arr[i][j];
			}
		}
		// 기존값 보여주기
		
		System.out.println("기존값");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 한자리 수가나왔을대 이쁘게 맞춰주려고 작성
				if (arr[i][j] >= 10)
					System.out.print("[" + arr[i][j] + "]");
				else
					System.out.print("[ " + arr[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		// 문제해결 한뒤 값 보여주기
		System.out.println("문제 해결뒤 ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (sum[i] % 5 != 0) {
					System.out.print("[  ]");
					continue;
				} else if (sum[i] % 5 == 0 && arr[i][j] >= 10)
					System.out.print("[" + arr[i][j] + "]");
				else // 한자리 수가나왔을대 이쁘게 맞춰주려고 작성
					System.out.print("[ " + arr[i][j] + "]");
			}
			System.out.println(" ==> sum : " + sum[i]);
		}
	}

	// 이건 잘못 생각해서 5의 배수만 출력함....
	public void exercise0() {
		int[][] arr = new int[3][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					continue;
				else if (arr[i][j] % 5 != 0)
					System.out.print("[  ]");
				else if (arr[i][j] >= 10)
					System.out.print("[" + arr[i][j] + "]");
				else
					// 5가나왔을대 이쁘게 맞춰주려고 작성
					System.out.print("[ " + arr[i][j] + "]");
			}
			System.out.println();
		}
	}

}
