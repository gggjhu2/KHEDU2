package kh.java.args;

public class CommandLineArgumentsTest {

	//
	// 프로그램 시작과 동시에 사용자 입력값 받아 처리 가능하다.
	// 사용자 입력값을 " " 을 구분자로 끊어서 String[]로 만들어
	// main메소드에 전달.
	//
	// ex>abc ,def ,123
	// ---->[abc,def,123] 이런배열로 바꿔전달해준다.
	public static void main(String[] args) {
		ddasdas n =new ddasdas();
		
//		for(int i = 0; i < args.length; i++) {
//		System.out.println(args[i]);
//	}
		CommandLineArgumentsTest c = new CommandLineArgumentsTest();
//		c.test1(args);
		c.test2(1);
		c.test2(1, 2);
		c.test2(1, 2, 3);
		c.test2(1, 2, 3, 4);
		System.out.println("프로그램 종료!");
	}

	/**
	 * "1 2 3 4" -> "1", "2", "3", "4"
	 * 
	 * @param args
	 */
	public void test1(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}

	///
	/// 가변인자
	/// 타입이동일하고, 개수가 정해지지 않은 매개인자를 처리할 수 있다.
	///
	public void test2(int... arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
			sum += arr[i];
		System.out.println(sum);
	}

	 {
		
		
	}
}

