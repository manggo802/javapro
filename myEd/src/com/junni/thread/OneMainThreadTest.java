package com.junni.thread;

public class OneMainThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
