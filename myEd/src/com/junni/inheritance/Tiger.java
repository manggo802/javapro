package com.junni.inheritance;

public class Tiger extends Animal {
	
	String name = "Leo";

	void attack() {
		System.out.println("[Child] Tiger is attack");
	}
	
	void slowWalk() {
		System.out.println("------- Tiger Slow walk start-------");
		walk();
		System.out.println("------- Tiger Slow walk  end -------");
	}
	
}
