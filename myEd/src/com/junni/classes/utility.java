package com.junni.classes;

public class utility {

	static boolean holJjak(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
			return true;

		} else {
			System.out.println("홀수입니다");
			return false;

		}
	}

	static boolean minus(int num1, int num2) {

		int result = num1 - num2;

		if (result >= 0) {
			System.out.println("두수의 차는 " + result + "이므로 양수입니다");
			return true;
		} else {
			System.out.println("두수의 차는 " + result + "이므로 음수입니다");
			return false;
		}

	}

}
