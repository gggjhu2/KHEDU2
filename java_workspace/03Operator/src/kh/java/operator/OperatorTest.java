package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {

		OperatorTest ot = new OperatorTest();
//		ot.test1();
//		ot.test2();
//		ot.test2_1();
//		ot.test3();
//		ot.test4();
//	}

//	   
//	   단항 연산자
//	
//	

//	private void test1() {
//
//		
//		int b =12;
//		int a = 10;
//		System.out.println(+a + "," + -a);
//		
//		boolean bool = (a != 10);  //같지 않으면 true , 같으면 false  
//		System.out.println(!bool);//
//		
//		System.out.println((long)Integer.MAX_VALUE+1);  //()연산자가 +연산자보다 순위가높으므로 인티저 맥스값을 롱으로 변환시킨것에 +연산자가 실행되어 최고연산자 에 1이더해진값이 출력된다.
//		
////	   증감 연산자 : ++  --
// 
	// 증감연산자가뒤로 붙을시 후위증감연산자==> 인접연산에 먼저 사용된후 , 1증감된다.
//		//증감연잔사가 앞에붙을시  전위 증감연산자==>먼저 1증감후 인접연산에 사용된다.
//		a++;// a = (a+1)
//		a--;//a = a-1
//		System.out.println(++a   +1);
//		System.out.println(a++ +1);
//	
//		int k =1;
////		int m =++k;
//		int m =k++;
//		System.out.println("k = "+ k +"," + "m =" + m);
//	
////		예제
//		int x = 10;
//		int y = 10;
//		int z = ++x;
//		System.out.printf("x = %d, y =%d , z =%d%n",x,y,z);
//		z = y++;
//		System.out.printf("x = %d, y =%d , z =%d%n",x,y,z);
//		x=20;
//		z = x++ + --y;
//		System.out.printf("x = %d, y =%d , z =%d%n",x,y,z);
//		
//		int m = 20;
//		int n = m++ + m ;
//		System.out.printf("m = %d , n = %d%n ," ,m , n);

//	public void test2() {
//
//		int a = 10;
//		int b = 4;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
//
//		System.out.println(a + b * a / b - a % b); // 연산순서를 알아야 괄호를 사용할수있다. 절대 좌측 처럼 작성하지말고 하단처럼 괄호를 적극적으로사용하야 코딩하자.
////		             연산순서  =>   ((a + ( ( b * a ) /b ) ) -(a % b ) )
//
////			비교연산                         한글      영어      약어
//		System.out.println(a > b); // 크다 greater than (gt)
//		System.out.println(a < b); // 작다 less than (lt)
//		System.out.println(a >= b); // 크거나 작다 (greater than) or (equal to) =>(ge)
//		System.out.println(a >= b); // 작거나 같다. (less than) or (equal to) =>(le)
//		System.out.println(a > b);
//		System.out.println(a > b);
//	}

//	public void test2_1() {
//
////				
////			이항 연산자	
////		논리 비교 연산자 &&||		
////	----&& AND 		
//// 				
////	EX)  a  && b  :a가 참이면서 b가 참인가.?			
////		            좌/우항 모두 참이면 참 아니면 거짓
////	----|| or		
////				
////	EX) a  || b	  : a 혹은 b 가 참인가?		
////				   좌/우항 중 하나라도 참이면 참 , 둘다거짓인경우만 거짓.
////				
//		int i =3;
//		System.out.println(i>0 && i <10);
////		                  3은 0보다크다 맞다 , 3은 10보다작다 맞다  좌우가 모두맞는다.결과는 참
//		System.out.println(i==0 && i ==10);
////						   3은 0 인가  3은 10인가 둘다 아니므로 거짓 둘다거짓
//		System.out.println(i==0 && i <10);
////							3은0인가 3은10보다작다?   좌는 거짓 우는 참 하나가 거짓이므로 거짓
//		System.out.println("============");
//		System.out.println(i>0 || i<10);
//		System.out.println(i<0 || i<10);
//		System.out.println(i<0 || i>10);
//		
//		int a=1;
//		int b=1;
//		System.out.println("=========");
//		System.out.println(a > 0 && ++b > 0 );
//		                  //1이 0보다크니 (참) && 2는 0보다큰가?(참)  =>참
//		System.out.println(a == 0 && ++b > 0);  //f
//		System.out.println("a ="+ a +"   "+ ", b =" + b);
////		
////		| | 연산
////		
//		a= 1;
//		b= 1;
////		System.out.println(a > 0 || ++b >0);  //a =1  b-1
//		System.out.println( a ==0 || ++b > 0); //a =1 b=2
//		System.out.println("a =" + a +"  "+  ", b =" + b);
//		
//		
////		번외 
////		&(AND) , |(OR) 논리비교 연산자.
////		좌항의 결과와 상관없이 우항을 무조건 검사.
//		System.out.println("============");
//		a= 1;
//		b= 1;
//		System.out.println(a > 0 | ++b >0);  //a =1  b-1
//		System.out.println( a ==0 | ++b > 0); //a =1 b=2
//		System.out.println("a =" + a +"  "+  ", b =" + b);
//		
//		//위의 예문같은 단독 엔드 단독 오아 연산자는 궂이사용하진않는다. 이런것도있다라는것정도만알면된다.
//		
//		
//		public void test3() {
//			
////			
////		삼항 연산자
////		(논리식) ? (true일때 값) : (false일때 )
////		
//		
//			System.out.println( 10 > 12 ? "크다" : "작다!!!!");
//			
//			int a =10;
//			int b =3;
//			int c = a > b ? a: b;
//			System.out.println("c = " + c);
//		//   a 가 b의 배수인가?
//			String s = (a/b ==0) ? "a는 b의 배수입니다." : "a는 b의 배수가아닙니다.";
//			System.out.println(s);  //a를 5로바꾸면 배수가된당.
//			
//			//짝수인지 /홀수인지 여부
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("정수 :");
//			int num = sc.nextInt();
//			
//			System.out.println( num %2==1 ? "홀수입니다":"짝수입니다 "   );
//			sc.nextLine();
//			int num21 = sc.nextInt();
//			System.out.println( num %2!=1 ? "짝수입니다 ":"홀수입니다"   );
//			}
//			
	}
      public void test4() {
    	  
//    	  
//    	 보캅 대입연산자. 
//    	  
//    	 +=  
//    	 -+
//    	 *= 
//    	 /+ 
//    	 %= 
//    	  
    	  int n =10;
    	      n=  n + 5;
    	      //  ==> n +=5;
    	      //좌항은 항상 공간이여야한다. n 공간에 n + 5 를 대입해라
    	   System.out.println("n =" + n);
    	   
    	   n = n-5;
    	   //  ==> n -=5
    	   System.out.println("n = " + n);
    	   
    	   n = n * 3 ;
//    	       ==>n *=3;
    	   System.out.println("n = " + n);
//    	   n은 여기까지 30의값을담고잇땅.
    	   n  /= 9;  //몫
    	   System.out.println("n = " + n);	   
    	   n  %= 3; //나머지
    	   System.out.println("n = " + n);	   
    	   
    	   
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	
	
	
		
	}

}
