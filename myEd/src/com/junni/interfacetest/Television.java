package com.junni.interfacetest;

public class Television implements RemoCon {

	@Override
	public void setOn() {
		// TODO Auto-generated method stub

		System.out.println("»ï¼º OLED TV°¡ ÄÑÁ³½À´Ï´Ù");

	}

	@Override
	public void setOff() {
		// TODO Auto-generated method stub

		System.out.println("»ï¼º OLED TV°¡ ²¨Á³½À´Ï´Ù");

	}

	@Override
	public void setInfoMenu() {
		// TODO Auto-generated method stub
		RemoCon.super.setInfoMenu();
	}

}
