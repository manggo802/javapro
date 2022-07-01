package com.junni.refertype;

public class ArraysTest {

	public static void main(String[] args) {

		String[] oneGrade = { "80점", "90점", "94점" };
		String[] twoGrade = new String[3];

		for (int i = 0; i < oneGrade.length; i++) {

			if (oneGrade.length == twoGrade.length) {

				twoGrade[i] = oneGrade[i];
				continue;

			}

			else {
				System.out.println("복사되지않았습니다");
				System.out.println("oneGrade.length [" + oneGrade.length + "]");
				System.out.println("twoGrade.length [" + twoGrade.length + "]");

				break;
			}

		}

		for (int k = 0; k < twoGrade.length; k++) {
			System.out.println(twoGrade[k]);

		}

	}

}
