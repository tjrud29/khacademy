package com.kh.ArrayListSample;

import java.util.ArrayList;

public class todosample {

	public static void main(String[] args) {
			//�� �� 3�� ����� ���� 2�� �ϰ� 1�� ����� ��Ŭ�����ϱ�
		
		ArrayList<String> todolist = new ArrayList<>();
		
		todolist.add("û��");
		todolist.add("����");
		todolist.add("����");
		
		System.out.println("�ؾ� �� �� �� : " + todolist);
		
		todolist.set(1,"�");
		System.out.println("�ٲ� �� �� : " + todolist);
		todolist.remove(1);
		System.out.println("�Ϻΰ� ������ �� �� : " + todolist);
		
		for(String aaaaa : todolist)
			System.out.println("�� �� ��� : " + aaaaa);
		
		todolist.clear();
		System.out.println("���� ������ �� �� : " + todolist);
		
		
	}

}
