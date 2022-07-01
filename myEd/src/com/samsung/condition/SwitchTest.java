package com.samsung.condition;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double randNum = Math.random();
		System.out.println("randNum value is " + randNum);

		int divedicdNumber = (int) (randNum * 10 + 1);

		switch (divedicdNumber) {
		case 1:
			System.out.println("divediceNumber is 1");
			break;
		case 2:
			System.out.println("divediceNumber is 2");
			break;
		case 3:
			System.out.println("divediceNumber is 3");
			break;
		case 4:
			System.out.println("divediceNumber is 4");
			break;
		case 5:
			System.out.println("divediceNumber is 5");
			break;
		case 6:
			System.out.println("divediceNumber is 6");
			break;

		default:
			System.out.println("divediceNumber is 6~10");
			break;
		}

	}

}
