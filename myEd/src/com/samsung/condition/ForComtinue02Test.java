package com.samsung.condition;

import java.util.Scanner;

public class ForComtinue02Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("다시입력해주세요");
			continue;
		}
		else {
			System.out.println("숫자 "+ num + "는 짝수입니다");
			break;
		}
	}
	}

	}
