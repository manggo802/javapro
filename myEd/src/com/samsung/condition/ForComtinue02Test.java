package com.samsung.condition;

import java.util.Scanner;

public class ForComtinue02Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("�ٽ��Է����ּ���");
			continue;
		}
		else {
			System.out.println("���� "+ num + "�� ¦���Դϴ�");
			break;
		}
	}
	}

	}
