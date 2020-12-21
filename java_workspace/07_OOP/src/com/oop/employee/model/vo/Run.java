package com.oop.employee.model.vo;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		Employee e1= new Employee(1, "홍길동", '남', "010-1234-5678");
		Employee e2 = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3000000, 0.15);
		e.printEmployee();
		e1.printEmployee();
		e2.printEmployee();
	}

}
