package com.junni.classes;

public class tvProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tvProject tvproject = new tvProject();
		tvProject tvproject1 = new tvProject("�Ｚ");
		tvProject tvproject2 = new tvProject("�Ｚ", "2020.02.01");
		tvProject tvproject3 = new tvProject("�Ｚ", "2020.02.01", "������21");
		tvProject tvproject4 = new tvProject("�Ｚ", "2020.02.01", "������21", "����");
		

		System.out.println("this"+tvproject.company);
		System.out.println("this"+tvproject.yymmdd);
		System.out.println("this"+tvproject.name);
		System.out.println("this"+tvproject.color);
		
		System.out.println("this"+tvproject1.company);
		System.out.println("this"+tvproject1.yymmdd);
		System.out.println("this"+tvproject1.name);
		System.out.println("this"+tvproject1.color);
		
		System.out.println("this"+tvproject2.company);
		System.out.println("this"+tvproject2.yymmdd);
		System.out.println("this"+tvproject2.name);
		System.out.println("this"+tvproject2.color);
		
		System.out.println("this"+tvproject3.company);
		System.out.println("this"+tvproject3.yymmdd);
		System.out.println("this"+tvproject3.name);
		System.out.println("this"+tvproject3.color);
		
		System.out.println("this"+tvproject4.company);
		System.out.println("this"+tvproject4.yymmdd);
		System.out.println("this"+tvproject4.name);
		System.out.println("this"+tvproject4.color);
		
		
		
		
	}

}
