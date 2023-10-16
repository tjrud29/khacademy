package com.kh.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String>{
	public int compare(String num1,String num2) {
		//���̰� ������ 0��ȯ
		 if(num1.length() == num2.length()) {
			 return 0;
		 }
		//num1�� num2���� ��� ��� ��ȯ
		 else if(num1.length() > num2.length() ) {
			 return 1;
		 }
		 //num1�� num2���� ª���� ����
		 else {
			 return -1;
		 }
	}
	public static void main(String[] args) {
		// List ArrayList ���� Comparator ����
		List<String> student = new ArrayList<>();
		student.add("nana");
		student.add("seoseo");
		student.add("hehe");
		student.add("djfoasdf");
		student.add("istsalamalaiqum");
		
		Collections.sort(student, new Student());
		
		for(String st : student) {
			System.out.println(st);
		}

	}
	

}
