package com.junni.interfacetest;

public class Television implements RemoCon {

	@Override
	public void setOn() {
		// TODO Auto-generated method stub

		System.out.println("�Ｚ OLED TV�� �������ϴ�");

	}

	@Override
	public void setOff() {
		// TODO Auto-generated method stub

		System.out.println("�Ｚ OLED TV�� �������ϴ�");

	}

	@Override
	public void setInfoMenu() {
		// TODO Auto-generated method stub
		RemoCon.super.setInfoMenu();
	}

}
