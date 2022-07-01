package com.junni.inheritance;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apart apart = new Apart();
		apart.musicPlay();
		
		apart.rest();
		
		CountryHouse ch = new CountryHouse();
		ch.baseball();
		ch.rest();
		ch.sleep();
		
		House house = new House();
		house.rest();
		house.sleep();

	}

}
