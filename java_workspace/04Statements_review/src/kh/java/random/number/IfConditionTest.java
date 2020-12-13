package kh.java.random.number;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//
// 1.if
// 2.if...elses(선택)
// 3.if ..else if
// 

public class IfConditionTest {

	public static void main(String[] args) {

		IfConditionTest ict = new IfConditionTest();
		
//		ict.tes1();
//		ict.test2();
//		ict.test3();
//		ict.test4();
//		ict.samang();
//		ict.test5();
		ict.test6();
		
		
	}
	
	// 
	//	if
		public void tes1() {
			
			int n = 11;
			if(n > 10) {
				
				System.out.println("if절이 실행 되었습니다.");
			}
			System.out.println("===test1 종료===");
		}
		
//		if ... else
//		
//		- true : if 절 실행		
//		- false : else절 실행
//		
//		
		public void test2() {
			
			// 사용자로 부터 수를 입력받고 , 그 수가 짝수인지 홀수 인지 출력!
			Scanner sc = new Scanner(System.in);
			
			System.out.print("홀짝수 판별해드립니다.(정수를입력하시오)=");
			
			int user =sc.nextInt();
			
			
			
			if(user %2 ==0) {
				System.out.println("짝수 :if절이 실행되었습니다.");
				
			}else {
				
				System.out.println("홀수 :else 절이 실행되었습니다..");
			}
			System.out.println("----test2 종료----");
		}
		
		//
		// 사용자로부터 나이를 입력받고,
		// 20세 이상이면 , "성인 인증되었습니다."
		// 20세 미만이면 , "미성년자입니다."
		public void test3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력 :");
			int age = sc.nextInt();
			
			if(age>=20) {
				
				System.out.println("성인 인증되었습니다.");
				
			}else{
				System.out.println("미성년자 입니다.");
				
				
			}
			System.out.println("프로그램이종료되었스빈다.");
		}
		
		// 사망 연산자 - 중첩 사용
		//	 
		// 1.	 
		// 2.	 
		// 3.
		public void samang() {
			
			int num =(int)(Math.random()*3)+1;//1~3 난수생성
			System.out.println("가위 바위 보합니다.\n1.가위\n2.바위\n3.보");
			System.out.println("컴퓨터는"+num +"을눌럿습니다.");
			String rps = num ==1 ? "가위" : ( num==2 ? "바위" : "보" );
			System.out.println(rps);
			
		}

		//	if ...else if ...[else...]
		//
		// 1. 조건식 1 : 참인경우 해당 if절 실행, 거짓인경우 다음 조건식검사.
		// 2. 조건식 2 :
		public void test4() {
			//
			// 90 ~100 : A
			// 80 ~89  : B
			// 70 ~79  : C
			// 60 ~69  : D	 
			// 50 ~59  : F
			Scanner sc =new Scanner(System.in);
			System.out.println("당신의 점수를 입력해주세용");
			int num = sc.nextInt();
			
			char grade = 'F'; //차의 기본값은 공백(공백을쳐야된다)
			
			if(num >=90) {
				grade ='A';
		}	else if(num>=80) {
			grade ='B';
		}	else if(num>=70) {
			grade ='C';
		}	else if(num>=60) {
			grade ='D';
		}	else if(num>=50) {
			grade ='F';
		}	else {
		}	
			System.out.println("당신의 학점은" +grade + "입니다."  );
			
}
		//
		//block scaope(범위)
		//-블럭내에 변수를 선언하면, 블럭외부에서 접은할 수 없다.
		public void test5() {
			
			int num =100;
			if(true) {
				
			}
			System.out.println(num);
		}
		
		//
		//  실습 문제 : 사용자로부터 문자를 입력받고,
		//	숫자인지 아닌지 출력하세요.
		//	나머지는 기타 특수문자입니다~ 라고 출력
		//  유니코드 표의 한글범위'가'~'힣'
		//
		public void test6() {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자 입력 :");
			char  ch =sc.next().charAt(0);
			
			if(ch>='0' && ch <='9' ) {
				System.out.println("[" +ch + "]는 숫자입니다.");
				
			}
			else {
			System.out.println("[" + ch + "]는 숫자입니다.");
			
			
		}
		
}
}
