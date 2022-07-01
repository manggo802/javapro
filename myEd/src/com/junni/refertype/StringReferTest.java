package com.junni.refertype;

public class StringReferTest {

	public static void main(String[] args) {

		String sampleA = new String("Lee"); // new keyword는 델리게이션 메모리에 새로이 올린다는 의미 입니다.
		String sampleB = new String("Lee"); // 그러므로 sampleA, sampleB는 각기 다른 객체 입니다.

		
		//==================== 두개가 서로 다른 객체로 다른 주소에 올라가 있다 ==============================
		
		if(sampleA == sampleB) {
			System.out.println("sampleA == sampleB");
		}
		else {
			System.out.println("sampleA != sampleB");
		}
		
		//================= 오직 글자만의 비교를위한 equals문 사용 ==========================
		
		if(sampleA.equals(sampleB)) {
			System.out.println("sampleA == sampleB");
		}
		else {
			System.out.println("sampleA != sampleB");
		}
		
	}

}
