package com.lec.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 클래스(필드, 생성자, 메서드로 구성)
		String str1 = new String();       // 기본생성자
		String str2 = new String("소향"); // 매개변수가 있는 생성자
		System.out.println(str2.toString());
		
		Human kim  = new Human();
		Human park = new Human("박씨");
		
		Human adam = new Human();
		System.out.println(adam);
		System.out.println(adam.toString());
		System.out.println();
		
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		adam.ssn = "991118-1234567";
		
		System.out.println("아담의 이름 = " + adam.name);
		System.out.println("아담의 성별 = " + adam.gender);
		System.out.println("아담의 나이 = " + adam.age);
		System.out.println("아담의 주민 = " + adam.ssn);
		System.out.println();
		
		Human eve = new Human("이브");		
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 9000;
		eve.ssn = "991111-2234567";
		
		System.out.println("이브의 이름 = " + eve.name);
		System.out.println("이브의 성별 = " + eve.gender);
		System.out.println("이브의 나이 = " + eve.age);
		System.out.println("이브의 주민 = " + eve.ssn);
		System.out.println();
		
		adam.think();
		adam.eat();
		adam.speak();
		adam.move();
		System.out.println();
		
		eve.think();
		eve.eat();
		eve.speak();
		eve.move();		
	}

}
