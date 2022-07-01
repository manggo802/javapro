package com.junni.nestedclasses;

public class NestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutClass outClass = new OutClass();
		
		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01();

		nestedClass01.nId = 1;
		nestedClass01.nestedClass01Method();
		
		
		OutClass.StaticClass01 staticClass01 = new OutClass.StaticClass01();
		
		staticClass01.sId = 21;
		staticClass01.nameId = 31;
		staticClass01.staticNestedClassMethod();
		staticClass01.staticNestedClassStaticMethod();
		
		
	}

}
