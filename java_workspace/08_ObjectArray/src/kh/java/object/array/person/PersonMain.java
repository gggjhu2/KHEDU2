package kh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {
	
	
	
	//
	//	Person 객체를 배열로 관리
	//
	//
public static void main(String[] args) {
	
	PersonMain pm= new PersonMain();
//	pm.test1();
//	pm.test2();
	pm.test3();
	
	
}
	
	public void test1() {
	
	
	//1. 객체 배열 선언
		Person[] arr = new Person[3];
		
		
		
	//  향상된 for문(foreach문) : index값 없이 요소에 바로접근
		
		for(Person p: arr) {
			
			System.out.println(p);
		}
		
		
	//2. 객체를 각각 할당
		arr[0] =new Person("홍길동",23);
		arr[1] =new Person("홍길동2",24);
		arr[2] =new Person("홍길동2",25);

		
		
    //3.출력
		for(int i = 0 ; i < arr.length ; i ++) {
			
			Person p = arr[i];
			p.printPerson();
		}
		System.out.println("====포이치문으로 출력해봅니다!");
		for(Person p :arr) {
			p.printPerson();
		}
	}
	
		//
		// 초기화 객체 배열 선언
		//
		//
	
		public void test2() {
			Person[] arr = {
					new Person("홀길동", 3),
					new Person("홀길동2", 32),
					new Person("홀길동3", 33)
			
		};
			System.out.println("테스트2 포이치문입니다.");
			
			for(Person p : arr) {
				p.printPerson();
			}
			
}
		
		//
		// 실습문제:
		// 사용자 입력받아서 3명의 Person 정보를 배열에 담고,출력하세요.
		//	파라미터 생성자를 이용해서 객체 생성할 것
		//
		public void test3() {
//			Scanner sc = new Scanner(System.in);
//			Person[] arr = new Person[3];
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print((i+1)+": 이름 - ");
//				String name = sc.next();
//				System.out.print((i+1)+": 나이 - ");
//				int age = sc.nextInt();
//				arr[i] = new Person(name, age);
//			}
//			for(Person x : arr) {
//				x.printPerson();
//			}
//		}
			
			///선생님버전갑니다
//				//1.입력	
			Scanner sc =new Scanner(System.in);
				Person[] arr = new Person[3];
				for(int i =0 ; i <arr.length;i++) {
					
					System.out.println("------"+(i+1)+"=======");
					System.out.println("이름 :" );
					String name =sc.next();
					System.out.println("나이 :" );
					int age =sc.nextInt();
					Person p = new Person(name , age);
					arr[i] = p;
				}
				//2.출력
					System.out.println("=============");
					
					for(Person x : arr) {
						x.printPerson();
			
		}
		}
}
