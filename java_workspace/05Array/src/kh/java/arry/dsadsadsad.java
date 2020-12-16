package kh.java.arry;

public class dsadsadsad {
	public static void main(String[] args) {

		dsadsadsad d = new dsadsadsad();
		d.test7();
	}

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

//
// String []
//