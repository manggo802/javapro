package com.junni.classes;

public class Refrigerator {

	void goOnOpen() {

		System.out.println("���� �����ϴ�");

	}

	void goOnClose() {

		System.out.println("���� �����ϴ�");

	}

	boolean isDoorOpen(boolean chose) {  //�׽�Ʈ�������� ���� ���ȴ��� �Է��ϸ� �ٷ� ����

		boolean open = true;  //���� ���Ƚ��� true ���� �ش�
		boolean close = false;  //���� �������� flase���� �ش�

		if (chose == open) {
			return true;
		} else {
			return false;
		}

	}

	void renFreeze() {

		System.out.println("Freezing Start");

	}

	String getModelName() {

		String modelName = "�Ｚ�����";
		return modelName;

	}

	int getTemperature(int temperature) {  //������� ���� �Է°��� �Է����ָ� �˷��ִ� int �� ����
		int row = -30;
		int middle = -60;
		int high = -100;

		if (temperature > row) {
			System.out.println("�µ��� �����ϴ�");
			return row;
		} else if (temperature > middle) {
			System.out.println("�µ��� �����մϴٴϴ�");
			return middle;
		} else {
			System.out.println("�µ��� �����ϴ�");
			return high;
		}

	}

}
