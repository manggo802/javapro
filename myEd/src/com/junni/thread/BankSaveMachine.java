package com.junni.thread;

public class BankSaveMachine {

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		synchronized (this) {
			this.money = money;

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("BankSaveMachine money value is [" + this.money + "]");

		}
	}

}
