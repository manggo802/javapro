package com.junni.classes;

public class Calculator {
	
	//메소드 응용예제
	
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
	
	String getName() {  // 리턴값이 String
		String result = "MyCalculor";
		
		return result;
	}
	
	boolean isBateryEmpty() {  //리턴값이 boolean
		return false;
	}
	
	void setFactoryInit() {  //리턴값이 없음.
		System.out.println("----------Calculator is Factory Init -----------");
	}
	

}
