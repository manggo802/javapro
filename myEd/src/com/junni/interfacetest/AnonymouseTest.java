package com.junni.interfacetest;

public class AnonymouseTest {

	public static void main(String[] args) {
		
		RemoCon remoCon = new RemoCon() { // �������̽� ���� = new �������̽�
			@Override
			public void setOn() { // �������̽��� ���ǵ� �߻� �޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("--------SetOn Anonymouse-------");
			}
			
			@Override
			public void setOff() { // �������̽��� ���ǵ� �߻� �޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("--------SetOff Anonymouse-------");
			}
		}; // ; �� ������ ����!
		remoCon.setOn(); 
		remoCon.setOff(); 
	}

}
