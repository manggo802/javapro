package com.junni.thread;

public class Custom02 extends Thread {
	private BankSaveMachine bankSaveMachine;

	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankSaveMachine.setMoney(200);
	}

}
