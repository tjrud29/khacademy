package com.kh.api.exam1;

public class PraticeMain2 {

	public static void main(String[] args) {
		PraticeMain2 zz = new PraticeMain2();
		zz.pratice1();
		zz.pratice2();
		zz.pratice3();
		zz.pratice4();
		zz.pratice5();
		
		
	}
	public void pratice1() {
		StringBuffer sb = new StringBuffer();
		sb.append("����");// + ���� ������
		sb.insert(1, "���� ������");
		System.out.println(sb.toString());
		
	}
	public void pratice2() {
		//���ڿ� ������
		StringBuffer sb = new StringBuffer();
		sb.append("�������ṹ����");
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void pratice3() {
		//���ڿ� ���� insert ���� �ֱ�
		  String str = "���� ������ ������";
		  StringBuffer sb = new StringBuffer(str);
		  sb.insert(8, "?����");
		  System.out.println(sb.toString());
	}
	
	public void pratice4() {
		//���ڿ� ��ü replace(, ,)
		String str = "���� ������ ������";
		 StringBuffer sb = new StringBuffer(str);
		 sb.replace(0, 20, ",");
		 System.out.println(sb.toString());
	}
	
	public void pratice5() {
		//���ڿ� ����
		String str = "���� ������ ������";
		 StringBuffer sb = new StringBuffer(str);
		 sb.delete(1, 20);
		 System.out.println(sb.toString());
		 
	}
}
