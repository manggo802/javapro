package com.junni.classes;

// 생성자 오버라이딩

public class tvProject {
	
	String company = "";
	String yymmdd = "";
	String name = "";
	String color = "";
	
	
	public tvProject(String company, String yymmdd, String name, String color) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
		this.name = name;
		this.color = color;
	}


	public tvProject(String company, String yymmdd, String name) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
		this.name = name;
	}


	public tvProject(String company, String yymmdd) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
	}


	public tvProject(String company) {
		super();
		this.company = company;
	}


	public tvProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
