package com.oop.constructor;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {

		//1. 기본 생성자  + setter
		
		User u = new User();
		u.setUserID("hofofof");
		u.setPassword("1234");
		u.setRegDate(new Date());
		u.printUser();
		
		//2. 파라미터 생성자 
		
		User u2 =new User("신사임당"," 5678", new Date());
		u2.printUser();
		
		User u3 =new User("ususu");
		u3.printUser();
		
		User u4 = new User("hojae" ,"7878");
		
		u4.printUser();
		
		
		
	}

}
