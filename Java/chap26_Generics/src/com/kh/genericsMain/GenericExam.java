package com.kh.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
			//������ �����͸� �����ϴ� book �ν��Ͻ� ����
		Book<Integer> intBook =new Book<>();
		intBook.put(42);
		intBook.put(23);
		int intvalue = intBook.get(); //����ȯ �ʿ� ����
		
		//���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("�ȳ�ȳ�~~");
		strBook.put("������ʹ�!!");
		String strValue = strBook.get();
		
		//���׸� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ� ��� ����
		System.out.println("int value : " + intvalue);
		System.out.println("String value : " + strValue);
		
		
	}

}
