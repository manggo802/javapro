package com.junni.refertype;

public class ArrayStringTest {

	public static void main(String[] args) {

		String[] names = { "����", "����", "��ȣ", "����", "����", "����" };

		System.out.println("names[0]�� " + names[0] + "�Դϴ�");
		System.out.println("names[1]�� " + names[1] + "�Դϴ�");
		System.out.println("names[2]�� " + names[2] + "�Դϴ�");
		System.out.println("names[3]�� " + names[3] + "�Դϴ�");
		System.out.println("names[4]�� " + names[4] + "�Դϴ�");
		System.out.println("names[5]�� " + names[5] + "�Դϴ�");

		System.out.println("for�� ���");

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]�� " + names[i] + "�Դϴ�");
		}

	}

}
