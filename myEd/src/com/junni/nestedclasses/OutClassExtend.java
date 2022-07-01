package com.junni.nestedclasses;

public class OutClassExtend {

	public OutClassExtend() {
		// TODO Auto-generated constructor stub
		System.out.println("OutClassExtend is Constructor");

	}

	void OutClassExtendMethod() {
		// 로컬 클래스

		class LocalClass {
			int lid = 0;

			void localMethod() {
				System.out.println("LocalClass lid value is" + this.lid);
				System.out.println("localMethod is Ok");
			}
		}

		LocalClass localClass = new LocalClass();
		localClass.lid = 10;
		localClass.localMethod();

	}

}
