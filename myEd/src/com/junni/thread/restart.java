package com.junni.thread;

public class restart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InfinityOut02 infinityOut02 = new InfinityOut02();
		
		infinityOut02.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		infinityOut02.interrupt();

	}

}

