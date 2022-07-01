package com.junni.thread;

public class AnnoyImpleThreadTest {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Annoy First Task");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		thread.start();

		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i = 0; i<10; i++) {
					System.out.println("Four Test");
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
				
			}
		});
		thread2.start();
		
		Runnable runnalbe = new ThirdTask();
		Thread thread3 = new Thread(runnalbe);
		thread3.start();
		
		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}