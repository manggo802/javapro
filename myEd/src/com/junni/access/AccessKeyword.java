package com.junni.access;

public class AccessKeyword {
	//field
	public int sample01;
	int sample02;
	private int sample03;
	
	
	//constructor
	public AccessKeyword() {
		sample01 = 1;
		sample02 = 2;
		sample03 = 3;
	}
	
	//method
	public void run01() {
		System.out.println("run01 start (public)");
	}
	
	void run02() {
		System.out.println("run02 start (default)");
	}
	
	private void run03() {
		System.out.println("run03 start (private)");
	}

}
