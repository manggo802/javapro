package com.junni.thread;

public class Custom04 extends Thread {
	
	private BankSaveMachine bankSaveMachine;

	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		bankSaveMachine.setMoney(600);
	}
	
	

}
