package com.junni.thread;

public class AnnoyExtendsThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("�ȳ��ϼ���");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// TODO Auto-generated method stub

			}

		};
		thread.start();
		
		Runnable runnable = new ThirdTask();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		Thread thread3 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0; i<10; i++) {
					System.out.println("�������Դϴ�");
					try {
						Thread.sleep(400);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
			
			
		};
		thread3.start();
	}

}
