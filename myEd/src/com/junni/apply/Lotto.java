package com.junni.apply;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Random = Math.random();

		Scanner sc = new Scanner(System.in);

		System.out.println("��� �ζǸ� ����Ͻ� �ǰ���?");
		int num = sc.nextInt(); // ����ڿ��� ������ �������� �Է¹ޱ�
		int[] lotto = new int[5]; // �ζ� 5�ڸ��� sort ArraysȰ���� ���� �迭 ����

		for (int i = 0; i < num; i++) { // ������� �̱����� for��

			for (int k = 0; k < 5; k++) { // �ζ� 5�ڸ��� random���� ������� for��)

			}

			for (int j = 0; j < 5; j++) {
				System.out.println(lotto[j]);
			}
		}

	}

}
