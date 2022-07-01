package com.junni.thread;

public class BankSaveMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSaveMachine bankSaveMachine = new BankSaveMachine();

		Custom01 custom01 = new Custom01();
		custom01.setBankSaveMachine(bankSaveMachine);
		custom01.start();

		Custom02 custom02 = new Custom02();
		custom02.setBankSaveMachine(bankSaveMachine);
		custom02.start();

	}

}
