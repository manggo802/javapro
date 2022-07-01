package com.junni.inheritance;

public class CountryHouse extends House {
	
	//야구 가능 메소드 추가
	//rest메소드를 재정의하여 산림욕 휴식을 할 수있도록 하기
	
	void baseball(){
		
		System.out.println("CountryHouse is play baseball");
		
	}
	
	void rest() {
		
		System.out.println("CountryHouse is a forest bath break");
		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("CountrySleep is Sweet");

		super.sleep();
	}

}
