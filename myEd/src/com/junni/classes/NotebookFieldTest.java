package com.junni.classes;

import java.util.Scanner;

public class NotebookFieldTest {

	public static void main(String[] args) {

		Notebook notebook = new Notebook();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ʈ�� �̸��� �Է����ּ���");
		notebook.name = sc.nextLine();
		
		
		if(notebook.name == "LG�׷�") {
		
		
		System.out.println("���� ��Ʈ�� ���λ��׿� ���Ͽ� �˾ƺ��ڽ��ϴ�.");
		System.out.println("�̸� : " + notebook.name);
		System.out.println("�𵨹�ȣ : " + notebook.modelNum);
		System.out.println("���� : " + notebook.weight + "kg");
		System.out.println("���� : " + notebook.color);
		System.out.println("���糯¥ : " + notebook.bornDate);
		System.out.println("���� : " + notebook.price + "����");
		}
		
	}

}
