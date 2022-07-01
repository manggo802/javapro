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
		
		// runnable �� runnable2�� �и� �����̿��� �۵��̵�����
//		main�ȿ��ִ� for���� �ڱ��ڽŲ��� �ű�ȿ��� ���������� �Ʒ��� ����ȴ�
		

	}

}
