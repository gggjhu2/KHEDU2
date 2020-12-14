package h.java.test.array;
/**
 * 
 * [문제5]
- 클래스 : kh.java.test.array.Test5.java
- 메소드명 : public void test()
    주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
 *
 */
public class Test5 {

	public static void main(String[] args) {
		new Test5().test();
	}
	
	public void test() {
		char[] chArr = {'y','y','m','m','d','d','-','1','2','3','4','5','6','7'};
		char[] tempArr = chArr.clone();
		
		for(int i = tempArr.length-6;i<tempArr.length;i++) {
			tempArr[i] = '*';
		}
		System.out.println(chArr);
		System.out.println(tempArr);
		
	}

}