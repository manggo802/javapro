package com.junni.classes;

public class utility {

	static boolean holJjak(int num) {
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�");
			return true;

		} else {
			System.out.println("Ȧ���Դϴ�");
			return false;

		}
	}

	static boolean minus(int num1, int num2) {

		int result = num1 - num2;

		if (result >= 0) {
			System.out.println("�μ��� ���� " + result + "�̹Ƿ� ����Դϴ�");
			return true;
		} else {
			System.out.println("�μ��� ���� " + result + "�̹Ƿ� �����Դϴ�");
			return false;
		}

	}

}
