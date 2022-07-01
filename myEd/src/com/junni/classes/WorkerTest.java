package com.junni.classes;

public class WorkerTest {

	public static void main(String[] args) {

		System.out.println("----------Object New-----Start--------");
		Worker worker = new Worker();
		
		Worker workerTwo = new Worker();
		System.out.println("worker 와 workerTwo는 서로 각기 다른 개체 입니다.");
		System.out.println("----------------Object New----- end------------");


		
	}

}
