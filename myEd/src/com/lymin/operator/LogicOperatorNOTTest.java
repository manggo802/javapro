package com.lymin.operator;

public class LogicOperatorNOTTest {

	public static void main(String[] args) {
		boolean isOnNotebook = true;

		if (!isOnNotebook) { // 노트북이 isOn이 아니라면.. 꺼져 있다면.. code의 리딩시 ! 많이 사용됩니다.
			System.out.println("Notebook is Off");
		} else {
			System.out.println("Notebook is ON");
		}

	}

}
