package kh.java;

public class ReturnTest {

	public static void main(String[] args) {

		ReturnTest rt = new ReturnTest();
		rt.a();
		
		System.out.println("===메인 종료 ---");
		
	}
	public void a() {
		b();
		System.out.println("a===종료===");
		
///		System.exit(0);  해당구문 실행시 즉시 프로그램종료
		
	}
	public void b() {
		if(true)
			return; //현재 메소드를 호출한 곳으로 즉시 리턴
		System.out.println("====b종료---");
		
	}
}
