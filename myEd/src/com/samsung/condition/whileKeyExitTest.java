package com.samsung.condition;

import java.io.IOException;

public class whileKeyExitTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		boolean isRun = true;
		int keycode = 0;
		
		while (isRun) {
			keycode = System.in.read();
			
			if(keycode == 49) {
				isRun = false;
			}
			else {
				System.out.println("keyCode value is" + keycode);
			}
			
			
		}
		
		System.out.println("program is End..");
		
	}

}
