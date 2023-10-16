package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		// Object Ŭ������ ���� 
		
		//��ü ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equal() �޼ҵ带 ����ؼ� �� ��ü ��
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj�� obj2�� ������? : " + isEqual);
		
		//hashCode() �޼ҵ带 ����Ͽ� ��ü�� �ؽ� �ڵ� ���
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ� :" + hashcode1);
		System.out.println("obj2�� �ؽ��ڵ� :" + hashcode2);
		
		//toString() �޼ҵ带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String objString = obj.toString();
		String objString2 = obj.toString();
		System.out.println("obj�� ���ڿ� ǥ�� " + objString);
		System.out.println("obj2�� ���ڿ� ǥ�� " + objString2);
		
		//getClass() �޼ҵ带 ����Ͽ� ��ü�� Ŭ���� ���� ���
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj.getClass();
		System.out.println("objŬ���� :" + classOfObj1.getName());
		System.out.println("obj2Ŭ���� :" + classOfObj2.getName());
		
		
		
		
	}

}
