package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap ����
		Map<String,Integer> studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�
		studentGrades.put("KH" , 95);
		studentGrades.put("park", 39);
		studentGrades.put("fdaf", 32);
	
		//Ư�� �л��� ���� �˻�
		//Map containsKey : �ʿ��� key value ���� �ִ��� Ȯ�� 
		String studentName = "bob";
		//���࿡ �л��� �߿��� bob �ִٸ� ������ ������
		if(studentGrades.containsKey(studentName)) {
			
			
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "������ " + grade);
			
		}else
			System.out.println(studentName + "������ ã���� ����");
		
		//��� �л��� ������ ���
		for(Map.Entry<String, Integer> entry :studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
					System.out.println(name + ":" + grade);
					
		}
		
		//�л� ���� ����
		String StudentUpdate = "BOb";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(newGrade + StudentUpdate);
		
		//�л� ����
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�.");
		
		//���� �л� ���� ���
		
			
		}
		
		
			
		
		

	}


