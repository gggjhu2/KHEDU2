package kh.java.method;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {

		MethodTest m = new MethodTest();
//		m.Test1();
		m.Test2();

	}

//	public void Test1() {
//		//1.데이터할당부
//		String name ="홍길동";
//		int age = 30;
//		
//		//2.데이터 출력부
//		System.out.println("안녕하세요~" + age + "살," + name + "입니다.");
//		
//		name ="김개똥";
//		age = 31;
//		System.out.println("안녕하세요~" + age + "살," + name + "입니다.");
//		name ="홍길동3";
//		age = 32;
//		printInfo( name, age);
//		System.out.println("안녕하세요~" + age + "살," + name + "입니다.");
//		
//		
//	}

//								매개인수(인자):메소드호출에 전달된 값.(name ,age)
//	    						(arguments)
//	
//								매개변수  : 메소드 호출시 전달된 값이 보관될 변수.(아래 String name~~~age)
//	// (parameters)
//	public void printInfo(String name ,int age){ 		
//				//				변수는 값이담길공간.
//			
//			
//				System.out.println("안녕하세요~" + age + "살," + name + "입니다.");
//			    System.out.println("name = " + name);
//			    System.out.println("age = " + age);

	 	public void Test2() {
	 		
	 		int num1 = inputNumber();
	 		int num2 = inputNumber();
	 		
	 		
	 		System.out.println(num1 + " + " +num2 + "="+ (num1 + num2));
	 		
	 			
	}
//	 	int 형 값을 리턴하는 메소드
//	 	@return
//	 	
	 	public int inputNumber() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("정수 입력 :");
	 		int num =sc.nextInt();
	 		
	 		return num;  //메소드 호출부 리턴시 num값을 가지고가라
	 	}
	 	
	 	
	 	
}
