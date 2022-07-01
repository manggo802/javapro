package com.junni.classes;

public class Radio {
	
	String color = ""; // 필드
	static String name = "SONY ICF-P26"; //정적필드
	
	void onRadio() {  //메소드
		System.out.println("radio is turn on");
	}
	
	static void onQuickRadio() {
		System.out.println("Radio is turn onQuick");
	}

}
