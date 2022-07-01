package com.junni.thread;

public class AnnoyImpleThread02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0; i<10; i++) {
					System.out.println("하이 방가방가 나이스트미튜");
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
				
			}
		});thread.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int k=0; k<10; k++) {
					System.out.println("안녕하세여");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
		});
		thread2.start();
		
		Runnable runnable = new ThirdTask();
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("하이욤");
			try {
				Thread.sleep(300);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	
}
