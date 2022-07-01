package com.junni.thread;

public class BankSaveMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSaveMachine bankSaveMachine = new BankSaveMachine();

		Custom01 custom01 = new Custom01();
		custom01.setBankSaveMachine(bankSaveMachine);
		custom01.start();
		
		//300

		Custom02 custom02 = new Custom02();
		custom02.setBankSaveMachine(bankSaveMachine);
		custom02.start();
		
		//200
		
		Custom03 custom03 = new Custom03();
		custom03.setBankSaveMachine(bankSaveMachine);
		custom03.start();
		
		// 500
		
		Custom04 custom04 = new Custom04();
		custom04.setBankSaveMachine(bankSaveMachine);
		custom04.start(); 

		//600
		
	}

}
