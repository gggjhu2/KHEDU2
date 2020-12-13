package com.kh.test.condition;

import java.util.Scanner;


public class Test8 {
	/**
	 * [문제 8]
	- 클래스 : com.kh.test.condition.Test8.java
	- 메소드명 : public void test()
	    **********메  뉴*********
	       1. 떡볶이 ----------------1000
	       2. 김밥 ------------------ 2000
	       3. 오뎅 ------------------ 1000
	       4. 순대 ------------------ 2000
	       5. 튀김 ------------------ 3000
	       6. 떡튀순 ---------------- 8000
	    *************************
	     메뉴번호 입력 : ‘번호입력’
	    떡볶이 선택시 “떡볶이는 1000원입니다.” 출력
	    김밥 선택시 “김밥은 2000원입니다.” 출력
	    오뎅 선택시 “오뎅은 1000원입니다.” 출력
	    순대 선택시 “순대는 2000원입니다.” 출력
	    튀김 선택시 “튀김은 3000원입니다.” 출력
	    떡튀순 선택시 “떡튀순은 8000원입니다.”출력
	    다른문자열 입력시 “번호가 잘못 입력되었습니다. 영업을 종료합니다.”

	 */
	public static void main(String[]args) {
		Test8 m = new Test8();
		m.test();
}
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		String menu = "**********메  뉴*********\r\n" + 
				"       1. 떡볶이 ----------------1000\r\n" + 
				"       2. 김밥 ------------------ 2000\r\n" + 
				"       3. 오뎅 ------------------ 1000\r\n" + 
				"       4. 순대 ------------------ 2000\r\n" + 
				"       5. 튀김 ------------------ 3000\r\n" + 
				"       6. 떡튀순 ---------------- 8000\r\n" + 
				"    *************************";
		System.out.println(menu);
		System.out.println("메뉴번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		int price = 0;
		
		
		switch(num) {
			case 1 :
			System.out.println("떡볶이는 1000원입니다.");
			price = 1000;
			break;
			case 2 :
			System.out.println("김밥은 2000원입니다.");
			price = 2000;
			break;
			case 3 :
			System.out.println("오뎅은 1000원입니다.");
			price = 1000;
			break;
			case 4 :
			System.out.println("순대는 2000원입니다.");
			price = 2000;
			break;
			case 5 :
			System.out.println("튀김은 3000원입니다.");
			price = 3000;
			break;
			case 6 :
			System.out.println("떡튀순은 8000원입니다.");
			price = 8000;
			break;
			default : System.out.println("번호가 잘못 입력되었습니다.\n영업을 종료합니다.");
			return;
		}
		System.out.println(price + "원을 결제해 주세요, 감사합니다!");
	}
}
