package com.kh.function;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Example {

	public void opsample1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 =");
		int ks = sc.nextInt();
		System.out.print("영어 =");
		int es = sc.nextInt();
		System.out.print("수학 =");
		int ms = sc.nextInt();

		int avr = (int) Math.floor((ks + es + ms) / 3.0f);

		System.out.println("국어 =" + ks);
		System.out.println("영어 =" + es);
		System.out.println("수학 =" + ms);
		System.out.println("총점 =" + (ks + es + ms));
		System.out.println("평균 =" + avr);

	}
	public void opSample2(){
		
		String name ;
		int    grade;
		int    cl;
		int    num;
		String sex;
		double point;
		String sexM = "M";
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("이름 =");
		String names = sc2.nextLine();
		System.out.print("학년 =");
		int    grades = sc2.nextInt();
		System.out.print("반  =");
		int    cls = sc2.nextInt();
		System.out.print("번호 =");
		int    cns  = sc2.nextInt();
		System.out.print("성별(M/F) =");
		String scancle = sc2.nextLine();
		String sexs = sc2.nextLine();
		String sex2 = (sexs.equals(sexM) ? "남학생" :"여학생");
		char ch = sex2.charAt(0);  
		System.out.print("점수 =");
		double  ps  =  sc2.nextDouble();
		
		
		
		
		System.out.printf( grades+ "학년 " 
							+cls +"반 "
							+cns + "번 "
							
							+ch + "학생"
							+names
							+"은 성적이"
							+"%.2f"
							+"이다." ,ps);
		
		

				//TODO 여기서드는 생각과 구현하고싶은부분
//  만약에 반을 물어보는곳에서 3학년이라고 입력하는 변수는 어떻게할것인지.
//	내가 원하는대로 사용자가 입력하지않을시의 출력의 가지수는어떻게할것인지.
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
