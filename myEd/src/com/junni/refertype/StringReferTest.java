package com.junni.refertype;

public class StringReferTest {

	public static void main(String[] args) {

		String sampleA = new String("Lee"); // new keyword�� �������̼� �޸𸮿� ������ �ø��ٴ� �ǹ� �Դϴ�.
		String sampleB = new String("Lee"); // �׷��Ƿ� sampleA, sampleB�� ���� �ٸ� ��ü �Դϴ�.

		
		//==================== �ΰ��� ���� �ٸ� ��ü�� �ٸ� �ּҿ� �ö� �ִ� ==============================
		
		if(sampleA == sampleB) {
			System.out.println("sampleA == sampleB");
		}
		else {
			System.out.println("sampleA != sampleB");
		}
		
		//================= ���� ���ڸ��� �񱳸����� equals�� ��� ==========================
		
		if(sampleA.equals(sampleB)) {
			System.out.println("sampleA == sampleB");
		}
		else {
			System.out.println("sampleA != sampleB");
		}
		
	}

}
