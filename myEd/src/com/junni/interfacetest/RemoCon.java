package com.junni.interfacetest;

public interface RemoCon {

	public static final int UID = 100; 
	public int PRODUCT_ID = 1; // static final ��������.
	
	//abtract method (�߻�)
	void setOn(); // (abtract ������)
	abstract void setOff(); // abstract �������� ����.
	
	//default method (�⺻)
	default void setInfoMenu() {
		System.out.println("show Info Menu");
	}
	
	//static method (����)
	static void alertError() {
		System.out.println("Error CODE:0001");
	}

}
