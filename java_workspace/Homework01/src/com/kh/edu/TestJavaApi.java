package com.kh.edu;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TestJavaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		
		System.out.println(now);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

		 System.out.println(date.format(now));

		
	}

}
