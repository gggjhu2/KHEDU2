package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
		
		
		Test2 t = new Test2();
	    t.test2();
		
//	    
//	    int a ;
//	    a = 'a';
//	    System.out.println(a);
//		
	    
	    
	    
	    
	    
		
	}

	public void test2() {
		
		
		
		
		System.out.println("A = "+ ('A'+0));
//		  string + (chaar A +int 0)
//		  string + (int 65 +int 0)
//		  string + int
//		  A =  +  65
        
        System.out.println("0 =" + ('0' + 0) );
//        String  +  (char '0' + int 0)
//        String  +  (int 0 + int 0)
//        String + int 0
//        
        
        
        System.out.println("(char)65 = " + (char)65);
//         string   +  int65        
//         string   +  char A
//        (char)65 = A
        
        byte bt1 = 125;
        char ch1 = 'C';
        int it1 = bt1 - ch1;
        System.out.println("it1 = "+it1);
//		 
//      String + (byte(125) - char (C(67))  
//             + (byte(125) - int (67)  
//        	   + int(125) -int  (67)
//        "it1 = " + 	
        
        boolean bool = false;
        
       
        bool = (2.0 == 5/2);
        System.out.println("bool = " + bool);
        
//      2.0(double) 이 5/2 의 결과값인 2(int)와 같냐
//      2.0(double) 이 2.0(double)과 같냐
//      같다  = true
        
        bool = ('C' == 67);
        System.out.println("bool = " + bool);
//        char 'C'  와  (INT)67 이같냐
//        INT 67    이  INT 67  과같냐
//        같다  =TRUE
        
        bool = ('A' == 'B'-1);
        System.out.println("bool = " + bool);
//		  CHAR 'A' 랑 CHAR'B' - INT1 과같냐
//        INT 67 이랑  INT 68 - INT1 이같냐
//        67 == 68-1   
//        같다==true
        
        bool = ('a' != 97 );//부정연산자
        System.out.println("bool = " + bool);
// 		bool = char 'a' 가 97과 같지않지? (같지않으면 투루 같으면 폴스)       
//      String  +   int 97 과  97이랑    (같으므로 폴스)
//		string  +   boolean
//      답은 폴스  
		
		
		
		
		

	}

}

