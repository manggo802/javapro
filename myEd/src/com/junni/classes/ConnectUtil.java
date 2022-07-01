package com.junni.classes;

public class ConnectUtil {
	
	private static ConnectUtil connectUtilInstance;
	
	static ConnectUtil getInstance() {
		if(connectUtilInstance == null) {
			connectUtilInstance = new ConnectUtil();
		}
		return connectUtilInstance;
	}
	
	public void connectStockFirm() {
			System.out.println("connectStockFirm is OK");
	}
	
	public void connectBank() {
		System.out.println("connectBank is OK");
	}

	public void releaseInstance() {
		connectUtilInstance = null;
	}

}
