package com.junni.classes;

public class Refrigerator {

	void goOnOpen() {

		System.out.println("문이 열립니다");

	}

	void goOnClose() {

		System.out.println("문이 닫힙니다");

	}

	boolean isDoorOpen(boolean chose) {  //테스트과정에서 직접 열렸는지 입력하면 바로 간다

		boolean open = true;  //문이 열렸습떄 true 값으 준다
		boolean close = false;  //문이 닫혔을떄 flase값을 준다

		if (chose == open) {
			return true;
		} else {
			return false;
		}

	}

	void renFreeze() {

		System.out.println("Freezing Start");

	}

	String getModelName() {

		String modelName = "삼성냉장고";
		return modelName;

	}

	int getTemperature(int temperature) {  //냉장고에서 실제 입력값을 입력해주면 알려주는 int 형 만듬
		int row = -30;
		int middle = -60;
		int high = -100;

		if (temperature > row) {
			System.out.println("온도가 높습니다");
			return row;
		} else if (temperature > middle) {
			System.out.println("온도가 적당합니다니다");
			return middle;
		} else {
			System.out.println("온도가 낮습니다");
			return high;
		}

	}

}
