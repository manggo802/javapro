package com.junni.interfacetest;

public class InputDeviceImpl implements InputDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed() {
		// TODO Auto-generated method stub
		System.out.println("PhysicalButton keyPressed");

	}
	@Override
	public void onTouch() {
		// TODO Auto-generated method stub
		
		System.out.println("ScreenTouch keyPressed");
		
	}

	@Override
	public void alertError() {
		// TODO Auto-generated method stub
		
		
		System.out.println("InputDevice is Error Code: 0001");
		
	}

	@Override
	public void OnSound() {
		// TODO Auto-generated method stub
		
		System.out.println("이어폰이 연결되었습니다");		
	}

}
