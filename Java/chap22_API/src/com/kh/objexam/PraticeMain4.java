package com.kh.objexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PraticeMain4 {

	public static void main(String[] args) {
		PraticeMain4 ss = new PraticeMain4();
		ss.pratice2();
		ss.pratice3();
		ss.pratice4();
		
	}
	public void pratice2() {
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���� ��¥ : %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	public void pratice3() {
		int num1= 123;
		int num2 = 7;
		
		String number = String.format("���� 1 : %05d, ����2 : %d",num1, num2);
				System.out.println(number);
		//String ������ =String.format("���� 1:   , ����2 : " ,   ,  );
		//system.out.println(������);
	}
	public void pratice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� ���� 
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� ���ڿ��� 10���� ª�ٸ� �������� ����
		//'����ǥ�� �ѷ� �׾ƾ���
		String formatpr = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(formatpr);
	}
}
