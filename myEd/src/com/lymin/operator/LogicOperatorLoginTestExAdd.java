package com.lymin.operator;

public class LogicOperatorLoginTestExAdd {

	public static void main(String[] args) {
		String serverID = "lymin";
		String serverPW = "1111";


		String userInputID = "lymin";
		String userInputPW = "1111";

		boolean isConfirmID = true;
		boolean isConfirmPW = true;

		if (serverID == userInputID) {
			isConfirmID = true;
		} else {
			isConfirmID = false;
		}

		if (serverPW == userInputPW) {
			isConfirmPW = true;
		} else {
			isConfirmPW = false;
		}
		
		if (isConfirmID && isConfirmPW) {
			System.out.println("AND(&&) is true..isOnTv isOnRadio");
			System.out.println("LogIn 성공했습니다. 환영합니다.");
			System.out.println("isConfirmID value is " + isConfirmID);
			System.out.println("isConfirmPW value is " + isConfirmPW);
		} else {
			System.out.println("AND(&&) the others case...");
			System.out.println("ID 또는 PW가 잘 못 되었습니다.");
			System.out.println("isConfirmID value is " + isConfirmID);
			System.out.println("isConfirmPW value is " + isConfirmPW);

			if (isConfirmID == false && isConfirmPW == false) {
				System.out.println("ID와 PW 모두 잘 못 되었습니다.");
			} else if (isConfirmID == false) {
				System.out.println("ID를 확인하여 주세요.");
			} else if (isConfirmPW == false) {
				System.out.println("PW를 확인하여 주세요.");
			} else {
				System.out.println("The others Unknown case");
				System.out.println("isConfirmID value is " + isConfirmID);
				System.out.println("isConfirmPW value is " + isConfirmPW);
			}
		}
	}
}
