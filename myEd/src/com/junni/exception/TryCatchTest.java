package com.junni.exception;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class class1 = Class.forName("java.lang.StringTwo");
		
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Class not exsist");
		}
		
		

	}

}
