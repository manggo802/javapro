package com.junni.thread;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				
				for(int i=0; i<10; i++) {
					System.out.println("¾È³çÇÏ¼¼¿©");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
		
		{
			
			
	}

	}
}
