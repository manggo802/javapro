package com.junni.exception;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		try {
			String temp = "10";
			String temp2 = "10ABC";

			int result = Integer.parseInt(temp);
			int result2 = Integer.parseInt(temp2);

			System.out.println("result value is " + result);
			System.out.println("result value is " + result2);

		}catch(Exception e) {
			//		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("------NumberFormatException---------");

		} finally {
			System.out.println("------------------finally------------");

		}

	}

}
