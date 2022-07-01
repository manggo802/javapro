package com.junni.nestedclasses;

public class Button {
	
	OnClickListener clickListener;
	
	public void setClickListener(OnClickListener clickListener) {
		System.out.println("setClickListner is OK");
		this.clickListener = clickListener;
	}

	public void setClickListner(OnClickListener clickListener) {}
	
	
	
	interface OnClickListener{
		
		void onClick();
		
	}

}
