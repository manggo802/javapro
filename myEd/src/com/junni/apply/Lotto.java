package com.junni.apply;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Random = Math.random();

		Scanner sc = new Scanner(System.in);

		System.out.println("몇개의 로또를 출력하실 건가요?");
		int num = sc.nextInt(); // 사용자에게 몇장을 받을건지 입력받기
		int[] lotto = new int[5]; // 로또 5자리를 sort Arrays활용을 위해 배열 생성

		for (int i = 0; i < num; i++) { // 몇장까지 뽑기위한 for문

			for (int k = 0; k < 5; k++) { // 로또 5자리를 random으로 얻기위한 for문)

			}

			for (int j = 0; j < 5; j++) {
				System.out.println(lotto[j]);
			}
		}

	}

}
