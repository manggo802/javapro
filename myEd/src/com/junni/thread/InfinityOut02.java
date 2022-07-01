package com.junni.thread;

public class InfinityOut02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	try {
		
		while(true) {
			
			System.out.println("------inifinity-------");
			Thread.sleep(1);
			
		}
		
	}catch(Exception e) {
//		e.printStackTrace();
		System.out.println("-------interruptedException------");
	}
	
	System.out.println("------end ------");
	
	}
	
	

}
