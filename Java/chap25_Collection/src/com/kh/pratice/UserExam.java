package com.kh.pratice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map <String, Integer> people = new HashMap<>();
		
		
		people.put("����", 89);
		people.put("����", 49);
		people.put("��ȿ", 125);
		
		String peopleName = "��ȿ";
		
		if(people.containsKey(peopleName)) {
			int numbers = people.get(peopleName);
			System.out.println(peopleName + "�� ���̴�" + numbers + "���Դϴ�.");
		}else {
			System.out.println(peopleName + "���̸� ã���� ����");
		}
		
	}

}
