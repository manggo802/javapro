package com.junni.refertype;

public class ArrayStringTest {

	public static void main(String[] args) {

		String[] names = { "준혁", "건희", "선호", "찬혁", "정훈", "윤태" };

		System.out.println("names[0]은 " + names[0] + "입니다");
		System.out.println("names[1]은 " + names[1] + "입니다");
		System.out.println("names[2]은 " + names[2] + "입니다");
		System.out.println("names[3]은 " + names[3] + "입니다");
		System.out.println("names[4]은 " + names[4] + "입니다");
		System.out.println("names[5]은 " + names[5] + "입니다");

		System.out.println("for문 사용");

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]는 " + names[i] + "입니다");
		}

	}

}
