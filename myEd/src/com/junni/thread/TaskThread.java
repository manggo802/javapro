package com.junni.thread;

public class TaskThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("이제 그만하죠^^");
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
