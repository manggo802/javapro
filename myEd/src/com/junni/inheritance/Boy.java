package com.junni.inheritance;

public class Boy extends People {
	
	public int idNum;
	
	

	public Boy (String name) {
		super(name);
	}
	
	public Boy(String name, int idNum) {
		super(name);
		this.idNum = idNum;
	}

}
