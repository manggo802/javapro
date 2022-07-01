package com.junni.classes;

import java.util.Scanner;

public class NotebookFieldTest {

	public static void main(String[] args) {

		Notebook notebook = new Notebook();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("노트북 이름을 입력해주세요");
		notebook.name = sc.nextLine();
		
		
		if(notebook.name == "LG그램") {
		
		
		System.out.println("나의 노트북 세부사항에 대하여 알아보겠습니다.");
		System.out.println("이름 : " + notebook.name);
		System.out.println("모델번호 : " + notebook.modelNum);
		System.out.println("무게 : " + notebook.weight + "kg");
		System.out.println("색상 : " + notebook.color);
		System.out.println("만든날짜 : " + notebook.bornDate);
		System.out.println("가격 : " + notebook.price + "만원");
		}
		
	}

}
