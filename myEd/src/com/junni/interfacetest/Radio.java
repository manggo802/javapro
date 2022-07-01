package com.junni.interfacetest;

public class Radio implements RemoCon {

	@Override
	public void setOn() {
		// TODO Auto-generated method stub
		
		System.out.println("Radio 가 켜졌습니다");
		
	}

	@Override
	public void setOff() {
		// TODO Auto-generated method stub
		
		System.out.println("Radio가 꺼졌습니다");
		
	}

	
	
	
}
