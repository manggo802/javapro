package com.junni.refertype;

public class ArrayMultiTest {

	public static void main(String[] args) {

		String[][] custList = { { "Ã¶¼ö", "±è¹Î¼ö", "Á¦°¥°ø¸í" }, { "¿µÈñ", "ÀÌ´ÙÈñ", "µ¶°í¼öÁø", "ÇÑÀÌ»Û»õ·Ò" } };

		System.out.println(custList[0][0]);
		System.out.println(custList[0][1]);
		System.out.println(custList[0][2]);
		System.out.println(custList[1][0]);
		System.out.println(custList[1][1]);
		System.out.println(custList[1][2]);
		System.out.println(custList[1][3]);

		for (int i = 0; i < custList.length; i++) {
			for (int k = 0; k < custList[i].length; k++) {

				System.out.println("for custList[" + i + "][" + k + "]value is " + custList[i][k]);
				System.out.println("for custList[" + i + "][" + k + "]value is " + custList[i][k].length());

			}
		}
	}
}
