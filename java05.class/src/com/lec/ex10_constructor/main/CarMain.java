package com.lec.ex10_constructor.main;

public class CarMain {

	public static void main(String[] args) {
		// 기본생성자 이외의 다른 생성자가 정의가 되어 있다면
		// 기본생성자는 자동으로 추가 되지 않기 때문에 기본생
		// 성자를 사용하려면 별도로 정의해야 한다.
		// Car car1 = new Car(); // 에러
		Car car2 = new Car("분홍", 300);
		Car car3 = new Car(300, "파랑");
	}

}
