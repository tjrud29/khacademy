package com.kh.api.exam1;
/*
 * 
 StringBuffer
 ���ڿ��� ȿ�������� �ٷ�� ���� Ŭ����
 �ٲ�ų� �ٲ�� �ִ� ���ڿ��� ��Ÿ����, ���ڿ��� �����̳� ������ �ʿ��� ��� ���
 
 * */
public class stringBufferMain {

	public static void main(String[] args) {
		//�� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		//���ڿ� �߰�
		sb.append("Hello,");
		sb.append("java");
		sb.append("StringBuffer");
		
		//���ڿ� ����
		sb.insert(6,"Exlipse");
		System.out.println(sb.toString());
		sb.replace(13, 17, "wow");
		System.out.println(sb.toString());
		
		//���ڿ� ����
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		//���ڿ� ������
		sb.reverse();
		System.out.println(sb.toString());
	}

}
