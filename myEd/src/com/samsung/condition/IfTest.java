package com.samsung.condition;

public class IfTest {

	public static void main(String[] args) {
		int mathScore = 51;

		if (mathScore > 50) {
			System.out.println("mathScore is > 50");
		}

		if (mathScore == 51) {
			System.out.println("mathScore is 51");
		}

		if (mathScore > 80) // ���� �ڵ��� ���� ���δٰ� �̷��� {}�� �Ⱦ��� �۾� �Ͻô� �е��� �ֽ��ϴ�. ����� �̷��� �ۼ��Ͻø� �ȵ˴ϴ�.
			System.out.println("mathScore is > 80"); // {}�� ������� ������, �� ���ٱ����� if ���� ���� �� �����̴�.
		System.out.println("main method is end"); // ���� if ���� ���� ����� ����.

	}

}
