package com.samsung.condition;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		int jungSuAge = 4;

		if (jungSuAge > 5) {
			System.out.println("jungSuAge is > 5");
		} else if (jungSuAge == 4) {
			System.out.println("jungSuAge is 4");
		} else { // ���ǵ� ������ ������ ��� ��츦 ó�� �մϴ�.
			System.out.println("jungSuAge is <= 5");
		}
	}

}
