package com.lymin.operator;

public class OperatorPriorityTest {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int result = x + y * z; // ���ϱ� ������ ���� �մϴ�.
		System.out.println("result value is "+ result);
		
		int result2 = (x + y) * z; // ���ϱ⸦ ���� �ϰ� ������ ��ȣ()�� ����մϴ�.
		System.out.println("result2 value is "+ result2);

	}

}
