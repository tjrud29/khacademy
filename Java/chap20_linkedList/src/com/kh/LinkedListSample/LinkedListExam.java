package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//����Ʈ �������̽� ��ũ�帮��Ʈ ��ü Ȱ���ؼ� �� �ְ� ���
		//String �� �ְ� ���� ���� ���
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		System.out.println(linkedList);
		
		linkedList.remove(0);
		System.out.println(linkedList);
		
		
		//LinkedList ��ü new LinkedList ����
		//int �� �ְ� ���� ���� ���
	}

}
