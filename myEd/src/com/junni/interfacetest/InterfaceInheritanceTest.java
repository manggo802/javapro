package com.junni.interfacetest;

public class InterfaceInheritanceTest {

	public static void main(String[] args) {
		
		InputDeviceImpl inputDeviceImpl = new InputDeviceImpl();
		
		PhysicalButton physicalButton = inputDeviceImpl;
		physicalButton.keyPressed();
		
		ScreenTouch screenTouch = inputDeviceImpl;
		screenTouch.onTouch();
		
		InputDevice inputDevice = inputDeviceImpl;
		
		inputDevice.keyPressed();
		inputDevice.onTouch();
		inputDevice.alertError();
		inputDevice.OnSound();
		
	}
}