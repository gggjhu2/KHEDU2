package kh.java.args;

import java.util.Scanner;

public class ddasdas {

	public static void main(String[] args) {
		ddasdas dda = new ddasdas();
		dda.test1();
		
		
	}

	public void test1() {
		int temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");

		while (true) {

			temp = sc.nextInt();
			if (temp > 0)
				break;
			System.out.print("다시정수를 하나입력하쇼");
		}
		for (int i = 0; i < temp*2 -1; i++) {
			for (int j = 0; j < temp; j++) {
				if (i < temp && j <= i) {
					System.out.print("♥");
				} else if (i >= temp && j <= i - temp) {

					System.out.print(" ");
				} else if (i >= temp)
					System.out.print("♡");

			}
			System.out.println();
		}

	}

}
