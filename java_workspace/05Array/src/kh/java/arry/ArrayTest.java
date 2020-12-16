package kh.java.arry;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayTest at = new ArrayTest();
		at.test0();
		at.test1();
		at.test2();
		at.test3();
		at.test4();
		at.test5();
		at.test6();
		at.test7();

	}

	public void test0() {
		// 동일한 자료형을가진 여러값들이 있따라고 전재

		int kor = 10;
		int ma = 1;
		int en = 100;
		int japan = 100;
		int socy = 55;

		// 총점 ,평균

		int total = kor + ma + en + japan + socy;
		double avg = total / 5;
		System.out.println("총점은" + total + "이고," + "평균은" + avg + "임니당");
	}

	public void test1() {
		// 1.배열 선언(두가지방식)
		int[] arr; // 자바에서 선호하는 방식
		String[] arr2;
//			//int arr[];//c언어에서 선호하는타입

		// 2.배열 할당 = 배열길이를 [ ] 안에 반듯이 지정할껏
		// 메모리 heap영역에 int 값을 담을수있는. 공간 할당.
		// 배열은 각 타입별 초기값으로 미리 처리됨
		// int 0 , double 0.0 , char ' ' , boolean false 로 세팅됨
		// 참조형 -null (값 없음)
		arr = new int[5];
		arr2 = new String[2];

		// 배열 각번지수 참조
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr2[0]);

		// 3.배열 각번지에 값대입
		System.out.println("==============");
		arr[0] = 10;
		arr[1] = 1;
		arr[2] = 100;
		arr[3] = 100;
		arr[4] = 55;
		arr2[0] = "널!";
		arr2[1] = "그켬!";
		System.out.println("==============");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println("==============");
		System.out.println("==============");
		// for (int i = 0 ; 1<5; i++) {

		// System.out.println(arr[i]);
//			초기화 하면 이렇게 쉽게표현할수있다.
		// int[] arr3 = { 10, 1, 100, 100, 55 };

		// 4.총점 ,평균 내보기

		// magic number
		int total = 0;
		double avrg;
		for (int i = 0; i < arr.length; i++) {

			total += arr[i];
		}

		double avg = (double) total / arr.length;// 배열의 길이
		System.out.println(arr.length);
		System.out.printf("총점 : %d점, 평균 : %.2f\n", total, avg);

	}

	public void test2() {
		double[] arr;
		arr = new double[3];
//		double [] arr =new double[3];// 윗 두줄 한줄에도 가능
		arr[0] = 1.1;
		arr[1] = 2.2;
		arr[2] = 3.3;// 배열 마지막 인덱스 : arr.length -1

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	// 초기화
	// 배열변수 선언 + 배열할당(heap) + 인덱스별 값대입
	//
	public void test3() {

		// char [] chArr = {'a','b','c'};//이한문장은다음처럼 풀어쓸수있다.
		// char [] chArr =new charr[] {'a','b','c'}; 아래와같다.

		char[] chArr;
		chArr = new char[3];
		chArr[0] = 'a';
		chArr[0] = 'b';
		chArr[0] = 'c';
		// 이렇게쓸수있는것을 위에 서 쓴것처럼 줄여쓴다.

		System.out.println(chArr);
	}

	// 배열의 요소에 담긴 값에 규칙이 있다면 , 값대입시에 반복문을 사용할 수잇따.
	//
	// 예){1,2,3,4,5....100}
	// {'a','b','c','d'}
	// {2,4,6,8,10}
	//

	public void test4() {
		int[] arr = new int[100];
		// 값대입
		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 101;
		}
		// 값출력
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("arr[%d]=  %d%n", i, arr[i]);

		}
	}

	// 실습 문제 :
	// 1번문제알파벳 소문자가 담긴 char배열을 생성하고 출력하세요.
	// a ,b ,c ,d ,e ... . . . . . .z 맨마지막 컴마 제거
	// 2번문제
	//

	public void test5() {
		// 내가푼방식
		char[] arr = new char[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (i + 97);
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}

		System.out.println("");
		// 선생님이 푼방식
		char[] abc = new char[26];
		for (int i2 = 0; i2 < abc.length; i2++) {

			abc[i2] = (char) ('a' + i2);
			System.out.print(abc[i2]);
			System.out.print(i2 == abc.length - 1 ? " " : ", ");
		}
	}

	//
	// String []
	//
	public void test6() {
//		String[] nameArr =new String[3];
//		nameArr[0] = "홍길동";
//		nameArr[1] = "홍길동2";
//		nameArr[2] = "홍길동3";
		String[] nameArr = { "홍1", "홍2", "홍3" };
		for (int i = 0; i < nameArr.length; i++) {

			System.out.println(nameArr[i]);
		}

	}

//
// 배열의 특징
//
// =배열의 길이는 변경할 수 없다.
//
	public void test7() {

		int[] arr = new int[10];
		System.out.println(arr.length);
		// hashCOde 비교 : 객체 주소값에 접근할 수 잇는 key값 해쉬코드가 같다면 동일한객체 동일한값이다.
		System.out.println(arr.hashCode());
		arr = new int[7];
		// hashCode 비굑
		System.out.println(arr.hashCode());
		System.out.println(arr);
		System.out.println(arr.toString());
		// to.Strong : 객체를 문자열 정보로 표현
		System.out.println(arr.length);
		System.out.println(arr);
		System.out.println(arr.toString());

		// 참조형 변수의 기본값 null
		arr = null; // 삭제

	}
}