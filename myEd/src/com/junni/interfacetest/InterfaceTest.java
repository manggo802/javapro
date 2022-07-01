package com.junni.interfacetest;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoCon remoCon;
		remoCon = new Radio();
		
		remoCon.setOn();
		remoCon.setOff();
		
		System.out.println("RemoCon.UID value is [" + RemoCon.UID + "]"); // static final(상수) 필드 확인.
		System.out.println("RemoCon.PRODUCT_ID value is [" + RemoCon.PRODUCT_ID + "]"); // static final(상수) 필드 확인.

		RemoCon.alertError(); // static method의 호출.
		remoCon.setInfoMenu();
		RemoCon.alertError();
		
		RemoCon remocon = new Television();
		
		remocon.setOn();
		remocon.setOff();
		
		System.out.println("RemoCon.UID value is [" + RemoCon.UID + "]"); // static final(상수) 필드 확인.
		System.out.println("RemoCon.PRODUCT_ID value is [" + RemoCon.PRODUCT_ID + "]"); // static final(상수) 필드 확인.

		RemoCon.alertError(); // static method의 호출.
		remoCon.setInfoMenu();
		RemoCon.alertError();
	}

}
