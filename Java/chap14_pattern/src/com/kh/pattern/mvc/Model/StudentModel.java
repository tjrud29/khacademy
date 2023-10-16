package com.kh.pattern.mvc.Model;

public class StudentModel {
	/* 
	 * 1. ���� ���� ǥ��
	 * private �̸� ����
	 * getter setter �����
	 */
	private String name; //�л� �̸�
	
	private int age; //�л� ����
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	


	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}