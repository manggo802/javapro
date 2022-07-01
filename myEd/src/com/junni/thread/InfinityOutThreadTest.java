package com.junni.thread;

public class InfinityOutThreadTest {
	public static void main(String[] args) {
		
		InfinityOut infinityOut = new InfinityOut();
		infinityOut.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		infinityOut.setStop(true);
		
	}

}
