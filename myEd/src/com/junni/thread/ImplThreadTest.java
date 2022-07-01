package com.junni.thread;

public class ImplThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		// runnable 과 runnable2는 분리 동맥이여서 작동이되지만
//		main안에있는 for문은 자기자신꺼라서 거기안에서 끝나야지만 아래가 실행된다
		

	}

}
