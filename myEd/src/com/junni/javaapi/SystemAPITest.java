package com.junni.javaapi;

public class SystemAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("myOS is [" + System.getProperty("os.name")+"]");
		System.out.println("java version is ["+System.getProperty("java.version")+"]");

		for (int i = 0; i < 1000; i++) { // õ��
			System.out.println("counter is [" + i + "]");
			if (i == 799) {// �ȹ��
				System.out.println("counter is [" + i + "] gc!");
				System.gc();
			} else if (i == 899) { // �����
				System.out.println("counter is [" + i + "] Exit!");
				System.exit(0);
			} else {

			}
		}
		

	}
}