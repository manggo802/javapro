package com.junni.refertype;

public class ArrayCopyTest {

	public static void main(String[] args) {

		String[] asIsMenber = {"����", "ö��", "�浿"};
		String[] toBeMenber = new String[6];
		
		for(int i=0; i<asIsMenber.length; i++) {
			toBeMenber[i] = asIsMenber[i];
		}
		
		toBeMenber[5] = "�μ�";
		
		for(int k=0; k<toBeMenber.length; k++) {
			System.out.println(toBeMenber[k]);
		}
		
	}

}
