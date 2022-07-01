package com.junni.thread;

public class InfinityOut extends Thread {

	private boolean isStop = false;
	
	public boolean isStop() {
		return isStop;
	}

	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(!isStop) {
			
			System.out.println("------infi------");
			
		}
		System.out.println("-----end------");
		
	}
	
	
	
}
