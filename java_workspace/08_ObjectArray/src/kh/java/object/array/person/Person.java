package kh.java.object.array.person;


	//
	// data 를 담을 용도의 클래스.
	//
	//	Vo class = value object class
	//
	//	같은 이름의 명칭이많다.
	//	Entity class (database)
	//	Do Class	  (domain object class)
	//	Dto CLASS	  (data transfer object class)	
	//	Bean 
	//

public class Person {

	private String name;
	private int age;
	
		
	public Person(String name, int age) {
	this.name=name;
	this.age=age;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printPerson() {
		
		System.out.println(name + "," + age + "," );
	}
	
	
}
