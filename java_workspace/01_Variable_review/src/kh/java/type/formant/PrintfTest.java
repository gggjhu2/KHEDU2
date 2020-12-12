package kh.java.type.formant;

public class PrintfTest {

	public static void main(String[] args) {
	
		PrintfTest pt = new PrintfTest();
		pt.test();
}
	
	//
	//	System.out.printf( "형식 문자열" ,요소1 ,요소2...)
	//
	public void test() {
		
		boolean bool=true;
		String s ="안녕하세요";
		char ch = '헐';
		int i = 100;
		double dnum =0.12345678;
//		
//		프린트 f  사용 명령어 형태
//		형식문자라고하는 %X의 형태를취하는 형식문자를사용한다. (%b =불리언 , %c = 차 , %s =스트링 ,%n = 개행 , %f = double , %d = int)
//		PRINTF 문안의 형식문자의 갯수에 맞게 요소를제공한다 (여기서요소는 밖에서의 선언 변수 도가능하고 직접적인 사용도가능하다.)
		System.out.printf("%b이냐 %b이냐~%b로다!!%n",!bool,bool,bool);
		System.out.println("\n123");
		
		System.out.printf("%c , %s%n",ch,s);
							//D=Decima number 에서 따왔다(정수)
		System.out.printf("i = %d, dnum =%f%n",i,dnum);
		 							 //%f 는 소숫점 6번째자리까지 표현해준다 7번째자리는 반올림된다.
		//%.2f = 소수점 이하 둘째자리까지 반올림하시오
		System.out.printf("%.8f",dnum);
		//소수점 8번째짜리까지 반올림하시오 즉 9번째짜리 숫자반올림한수가나온다.
		
//		//%10s :10개의 공간을 확보하고 , 요소를 우측 정렬
		System.out.printf("%n[%10s] [%-10s] %n","abc","abc");
		System.out.printf("%n[%10s] [%-10s] %n","안녕","안녕");  //한글 출력은 칸이좀다를수있다.
		//%n은 printf문안에서만쓸수잇다. 어디서든쓸수있는것은 \n
		
		//%s는 모든타입에 사용가능
		System.out.printf("%s %s %s %s %s %n",bool ,ch ,s ,i ,dnum);
		
		
		
		
		
	}
}
