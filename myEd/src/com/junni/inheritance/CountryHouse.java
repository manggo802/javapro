package com.junni.inheritance;

public class CountryHouse extends House {
	
	//�߱� ���� �޼ҵ� �߰�
	//rest�޼ҵ带 �������Ͽ� �긲�� �޽��� �� ���ֵ��� �ϱ�
	
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
