package com.oop.constructor;

import java.util.Date;

// 생성자 constructor
	//
	// new 연산자를 통해 호출되는 메소드.
	//
	//	객체 생성시 마지막에 호출되어 객체 필드 초기화 처리를 담당.
	//
	//	-기본 생성자		=파라미터 생성자가없다면 JVM에의해 자동생성
	//					but 파라미터 생성자가 하나라도 있다면, 자동생성 안됨.
	//					직접 작성해야된다.
	//	-파라미터 생성자	=필드값을 넘겨받아서 한번에 값 세팅 등의역할
	//
	//		
	//	기본 생성자가 필요한 이유
	//	1. 상속시 자식 클래스에서 부모 클래스의 기본생성자를 호출
	//	2. java ee 스펙에 따라 사용자 객체 생성시 내부적으로 호출.
	//
	//
	//
	//	리턴타입이 없고, 클래스명과 동일해야 한다.
	//
	//
	//
public class User {

	
		private String userID;
		private String password;
		private Date regDate;
		
	
		//
		//기본 생성자 : 파라미터 없음
		public User(){	
			
			
			System.out.println("User 객체 생성!");
			
			userID ="adc";
			String user2= userID;
			
			
		}
		public User(String userID ,String password) {
			
			this.userID=userID;
			this.password=password;
			
		}
		public User(String userID) {
			
			this.userID=userID;
		}
	
			//파라메터 생성자 필드 값 세팅
			//
			//
			//	this() => 올바른사용법
			// 다른 생성자를 호출해서 생성자 안의 중복된 코드 제거.
			//	user() =>X
			//
			//	딱한번만 맨 첫줄에서만 호출이 가능하다.
			//
			//
		
		public User(String userId, String password, Date regDate) {
			this(userId,password);//다른 생성자 호출
//			this.userID =userId;
//			this.password=password;
			this.regDate=regDate;
			
			
			
			
		}

		public String getUserID() {
			return userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getRegDate() {
			return regDate;
		}

		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}
		
		public void printUser() {
			
			System.out.println(userID + "," + password + "," +regDate);
			
		}
	

	}



