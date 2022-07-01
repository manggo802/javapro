package com.junni.nestedclasses;

public class NestedInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button button = new Button();
		button.setClickListner(new MessageListener());
		
		MessageListener messageListener = new MessageListener();
		
		messageListener.onClick();
		
		button.setClickListener(new PushListener());

	}

}
