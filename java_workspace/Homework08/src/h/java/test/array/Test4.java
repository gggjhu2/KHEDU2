package h.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	/**
	 * - 메소드명 : public void test1()
	    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
	    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	     
	        힌트) 복사방법
	       - for문이용 1:1대입
	       - System.arraycopy() 매소드 이용
	       - clone() 매소드 이용
	 */
	public static void main(String[] args) {
		new Test4().test1();
		new Test4().test2();
		
	}
	
	
//	- 메소드명 : public void test1()
//    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
//    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
//     
//        힌트) 복사방법
//       - for문이용 1:1대입
//       - System.arraycopy() 매소드 이용
//       - clone() 매소드 이용

	public void test1() {
		String temp;
		char[] inputArr = new char[11];
		char[] outputArr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호11자리를 입력하세요 : ");
		temp = sc.nextLine();
		
		for(int i=0;i<temp.length();i++) {
			inputArr[i]=temp.charAt(i);
		}
		
		outputArr = inputArr.clone();

		for(int i=3;i<7;i++) {
			outputArr[i]='*';
		}
		System.out.println("원본 : "+Arrays.toString(inputArr));
		System.out.println("출력용 : "+Arrays.toString(outputArr));
		
	}
	
//	- 메소드명 : public void test2()
//    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
//    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
//    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
	public void test2() {
		String temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호11자리를 입력하세요 : ");
		temp = sc.nextLine();
		
		System.out.println(temp.substring(0,3)+"****"+temp.substring(7,11));
		
	}
}
