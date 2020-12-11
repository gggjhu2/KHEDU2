package kh.java.loop;

public class BreakContinueTest {
	public static void main(String[] args) {

		BreakContinueTest bc = new BreakContinueTest();
//		bc.test1();
//		bc.test2();
//		bc.test3();
		bc.test4();

	}

//	
//			//break: 반복문 블럭을 즉시 탈출 . 반복문 즉시중지
//	
//			//continue : (까다로움)  이하 코드 실행하지 않고 , 반복문 시작으로 이동.
//			  	
//				-for 문인 경우 증감식으로
//				-while 문 :  조건식으로 
//	
//	
//	

//	
//	
//			public void test1() {
//			
//				int i = 1;
//				//무한반복문//
//				while(true) {
//					System.out.println(i);
//					if(i++==100) {
//						break;
//					}
//				}
////				System.out.println("123");// 무한 루프문 밑에 명령어는 에러가난다.
//				
//					//예습 문제	
//					//11의 배수가 1000이 넘기 전까지만 출력하세요.
//	
//				public void test2() {
//					final int num = 11;
//					int i = 1;
//					while (true) {
//						int n = NUM*1++;
//						if (n<1000 )
//							System.out.println(n);
//						else 
//							breake;
//						
//					}
//					System.out.println("종료!");
//	}

//	
//			continue!!!!
//	
////	
//	public void test3() {
//					
//					int i =0;
//					while(i <=100) {
//						
//							//홀수는 true , 짝수는 false
//							i ++;
//							if(i %2 !=0) 
//								
//								continue;
//							//i++ (이런식으로하면 무한반복문이다)컨티뉴아래에 증감식 위치시키지않기.
//								System.out.println(i);
//							
//						}
//						
//					}
//
//	for(
//
//	int i = 1;i<=100;i++)
//	{
//		if (i % 2 != 0)
//			continue;
//		System.out.println(i);
//	}
	
//			실습 문제 : ascii code  범위에서 숫자와 영무낮만 출력하기.
//					단, continue를 무조건 사용해서 코드를 전개하세요.
//	
//	
				
				public void test4() {
					
					
//					int i = 0;
//					
//					while(i<=127) {
//					
//						i++;
//						if((i>='A'&&i<='Z')||(i>='a'&&i<='z')) {
//							System.out.print((char)i+ " ");
//						}
//						else {
//							continue;
//						}
//					}
//				}
					
					int i = -1;
					
					
					while( i++<128) {
						//
						//pseudo 의사(모의 ,가짜) 코드 
//						if((i>='A'&&i<='Z')||(i>='a'&&i<='z'))continue;
					
						if(i<'0')continue;
						if(i>'9'  && i<'A')continue;
						if(i>'Z' && i < 'a')continue;
						if(i > 'z')continue;
						
						System.out.println(i + " : " +(char)1);
						
					
					}
				
				

}
}