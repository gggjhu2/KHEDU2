package kh.java.method;

public class MethodTest {

	public static void main(String[] args) {

		MethodTest mt = new MethodTest();
		mt.test1();
		
	}
	
	
	
	
	public void test1() {
		
		//1. 데이터 할당부
		
	    String name ="홍길동";
	    int age = 30;
	    
	    //2.데이터 출력부
//	    System.out.println("안녕하세요~" + age + "살," +name + "입니다.");
//	    
//	    
//	    name ="신사임당";
//	    age = 50;
//	    
//	    System.out.println("안녕하세요~" + age + "살," +name + "입니다.");
//	    
//	    name ="세종대왕";
//	    age = 150;
//	    
//	    System.out.println("안녕하세요~" + age + "살," +name + "입니다.");
//	    /////////////////////위 코드 문처럼  프린트문이 반복되는경우 프린트를 새로운 파라미터로
	    //구성하여 일괄적으로처리할수있다.
	    
	    
	    
	    printInfo(name , age);
	    name ="신사임당";
	    age = 50;
	    printInfo(name , age);
	    name ="세종대왕";
	    age = 150;
	    printInfo(name , age);
	    printInfo("유관순", 270); 
	    
	}
	//	매개인수(인자) ; 메소드 호출에 전될된 값 (값) ( ex=> 출력부의name , age) =>arguments
	//	매개 변수 :  매소드 호출시 전달 될 값이 보관될 변수.,(공간)(ex => String name , int age) =>parameter 
	//
	//
		public void printInfo(String name , int age) {
			
			 System.out.println("안녕하세요~" + age + "살," +name + "입니다.");
			 System.out.println("name = "  +name);
			 System.out.println("age = " +age);
			
		}
		
		

}
