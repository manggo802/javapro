package com.junni.inheritance;

public class ProtectedB {
public String name;
	
	public void protectedMethod() {
		protectedpackA protectedA = new protectedpackA();
		protectedA.name = "Pro"; // 접근 가능
		protectedA.protectedMethod(); // 접근 가능.
	}

}
