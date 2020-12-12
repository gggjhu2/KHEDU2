package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {

		OperatorTest ot = new OperatorTest();
//		ot.test();
//		ot.test1_1();
//		ot.test2();
//		ot.test2_1();
//		ot.test3();
		ot.test4();

	}
	
	//
	//단항 연산자		
	//
	//
		public void test() {
			
			int a =10;
			System.out.println(+a +"," +-a);
			
			boolean bool = a!=10; //같지않으면 true 같으면 false
			System.out.println(!bool);
			
			System.out.println((long)Integer.MAX_VALUE + 1);
			
			//증감 연산자 : ++ --
			
			//++a 전위 증감연산자	: 먼저1증감후 인접연산에 사용된다.
			//a++ 후위 증감 연산자. : 인접연산에 먼저사용된후 1증감한다.
			
			a++;// a= a+1
			
			a--;// a= a-1
			
			System.out.println("a =" +a);
			
//			System.out.println(++a + 1); //12
			System.out.println(a++ + 1);//11
			
			System.out.println("a =" +a);

			int k =1;
//			int m =++k;
			int m =k++;
			System.out.println("k = " + k + "\nm = " + m);
			
			int i =3;
			int j =i++ + 10;
			System.out.println("i =" + i + ",j" + j);
			
		}
		
		public void test1_1() {
			
			int x =10;
			int y = 10;
			int z = ++x; //x =11 z=11
			
			System.out.printf("x = %d , y = %d , z = %d%n" , x,y,z);
					//x= 11 y =11
			z =y++; //z =10
			
			System.out.printf("x = %d , y = %d , z = %d%n" , x,y,z);
			
			x= 20;
			z =x++ + --y; //x=20 y=10   z = 20 
			System.out.printf("x = %d , y = %d , z = %d%n" , x,y,z);
			
			int m =20;			//m = 21
			int n = m++ + m;	//n = 41	
			System.out.printf("m = %d , n =%d\n", m, n);
		}
		
		//
		// 이항연산자  
		//
		public void test2(){
				
			int a =10;
			int b =4;
//			System.out.println(a + b);
//			System.out.println(a - b);
//			System.out.println(a * b);
//			System.out.println(a / b);
//			System.out.println(a % b);
			
			System.out.println( a+ b * a / b - a %b);
			//(a +((b * a) /b)) - a % b
			
			//비교 연산자 영어이름 알아보기
			
			System.out.println(a > b);   //크다greater than
 			System.out.println(a < b);	// 작다 lt less than
			System.out.println(a >= b); //크거나 같다 ge(greater than) or(equal to)
			System.out.println(a >= b);//작거나 같다 le (less than) or (equal to)
			
		}
		
		//
		// 이항연산자
		//논리 비교연산자 && ||
		//
		//  -  && =AND연산자
		//     a && b  :a가참이면서 b가 참인가. 좌우 항 모두참이면참 아니면거짓
		//
		//  -  || = OR연산자
		//	   a || b :	a혹은 b가참인가?
		//				좌우항은 하나라도참이면 참 둘다 거짓인경우는 거짓
		//
		public void test2_1() {
			
			int i =3;
			System.out.println(i >0 && i<10);
			System.out.println(i == 0 || i <10);
			
			int a =1;
			int b =1;
//			System.out.println(a > 0 && ++b >0);
			System.out.println(a == 0 && ++b >0); //앞의 연산자가 이미 참이기때문에 뒷 항의 b를 아예 실행하지않는다
			System.out.println("a =" + a + ",b = " + b);
			
			a =1;
			b = 1;
//			System.out.println(a > 0 || ++b > 0);  
			System.out.println(a == 0 || ++b > 0);  
			
			System.out.println("a = " + a + ", b = " +b);
			
			// &(AND)  | (OR) 논리 비교 연산자
			//좌항의 결과와 상관없이 우항을 무조건 검사
			
			a =1;
			b = 1;
			System.out.println(a > 0 | ++b > 0);  
//			System.out.println(a == 0 ㅊ& ++b > 0);  
			
			System.out.println("a = " + a + ", b = " +b);
			
		}
		
		//
		// 사망 연산자
		//(논리식) ? (true일때 값) : (false 일때 값);
		//
		public void test3() {
			
			System.out.println(10>3 ? "ㅎㅎㅎ": "ㅋㅋㅋ");
			
			int a=10;
			int b=3;
			int c=a > b ? a :b ; //c =10
			
			System.out.println("c = " + c);
			
			//a 가 b 의 배수인가?
			
			String s = (a % b ==0) ? "a는 b의 배수입니다" : "a는 b의 배수가 아닙니다.";
			System.out.println(s);
			
			//짝수 홀수여부
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 :");
			int num = sc.nextInt();
			
			System.out.println(num % 2 ==0 ? "짝수" : "홀수");
			System.out.println(num % 2 !=0 ? "홀수" : "짝수");
			
		}
		
		//
		//복합 대입 연산자
		//
		public void test4() {
			
			int n = 10;
//			n = n + 5; // n+=5와같다
			n +=5;
			System.out.println("n = " + n);
			
//			n = n*3
			n *=3;
			System.out.println("n = " + n);
			
			n/= 9;
			System.out.println("n = " +n);
			
			n%= 3;
			
			System.out.println("n = " +n);
			
			
			
			
		}
		
}
