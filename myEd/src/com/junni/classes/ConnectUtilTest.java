package com.junni.classes;

public class ConnectUtilTest {

	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm(); // ������ �޼ҵ� ȣ���� �� ���� �� �� �ֽ��ϴ�.
		ConnectUtil.getInstance().releaseInstance(); // �� ���� ����, �ڿ� ���� �Ͽ� �ݴϴ�.
		
		ConnectUtil.getInstance().connectBank(); // �ڿ� ������ �Ǿ����Ƿ� ���� �����ϰ� ȣ�� �˴ϴ�.
		ConnectUtil.getInstance().releaseInstance();
	}

}
