package com.junni.interfacetest;

public interface InputDevice extends EarPhoneSocket, PhysicalButton, ScreenTouch {
	abstract void alertError();
}
