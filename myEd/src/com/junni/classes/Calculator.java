package com.junni.classes;

public class Calculator {
	
	//�޼ҵ� ���뿹��
	
	int plus(int x, int y) {
		int result = x + y;
		
		return result;
	}
	
	int minus(int x, int y) {
		int result = 0;
		result = x - y;
		return result;
	}
	
	int multi(int x, int y) {
		int result = 0;
		result = x * y;
		return result;
	}
	
	int divid(int x, int y) {
		int result = 0;
		result = x / y;
		return result;
	}
	
	String getName() {  // ���ϰ��� String
		String result = "MyCalculor";
		
		return result;
	}
	
	boolean isBateryEmpty() {  //���ϰ��� boolean
		return false;
	}
	
	void setFactoryInit() {  //���ϰ��� ����.
		System.out.println("----------Calculator is Factory Init -----------");
	}
	

}
