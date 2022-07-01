package com.junni.classes;

public class Tv {
	
	String company = "";
	String madeyear = "";
	String name = "";
	String color = "";
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("TV default constructor is call");
		
	}
	public Tv(String company) {
		super();
		this.company = company;
		System.out.println("TV default param1constructor is call");

	}
	public Tv(String company, String madeyear) {
		super();
		this.company = company;
		this.madeyear = madeyear;
	}
	public Tv(String company, String madeyear, String name) {
		super();
		this.company = company;
		this.madeyear = madeyear;
		this.name = name;
	}
	public Tv(String company, String madeyear, String name, String color) {
		super();
		this.company = company;
		this.madeyear = madeyear;
		this.name = name;
		this.color = color;
	}

}
