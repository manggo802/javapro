package com.junni.inheritance;

public class OfficeTel extends House {

	public String name;

	void work() {
		System.out.println("working");
	}

	void eat() {
		super.rest(); // �θ� Method�� ȣ�� �մϴ�.
		System.out.println("eating");
	}
}
