package com.lymin.operator;

public class StringCompareOperatorTest {

	public static void main(String[] args) {
		String name01 = "ȫ�浿";
		String name02 = "ȫ�浿";
		String name03 = new String("ȫ�浿"); // �ٸ� �ּ� ������ ����. // �������̼� �� ��ü.

		System.out.println(name01 == name02);
		System.out.println(name01 == name03);
		System.out.println(name02 == name03);
		
		System.out.println("-----------------------------");
		
		System.out.println(name01.equals(name02));
		System.out.println(name01.equals(name03));
		System.out.println(name02.equals(name03));

	}

}
