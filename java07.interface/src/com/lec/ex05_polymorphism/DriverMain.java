package com.lec.ex05_polymorphism;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new 오토바이());
		driver.drive(new 자전거());
		driver.drive(new 킥보드());
		
	}
}

class 오토바이 implements Vehicle {

	@Override
	public void run() {
		System.out.println("오토바이를 탑니다.");
	}
	
}
class 자전거 implements Vehicle {

	@Override
	public void run() {
		System.out.println("자전거를 탑니다.");
	}
	
}
class 킥보드 implements Vehicle {

	@Override
	public void run() {
		System.out.println("킥보드를 탑니다.");
	}
	
}














