package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		
	String[] inturnArray = {"��泭", "�踻��" , "ȫ�浿", "��ö��", "������"	};
		
		inturnArray[3] = "���ѳ�";
		System.out.println("��ö�� ��� " + inturnArray[3]);
		
		String[] fruits = {"���", "����", "Ű��", "�޷�" ,"��"};
		
		fruits[0] = "�ٳ���";
		fruits[1] = "����";
		fruits[2] = "����";
		fruits[3] = "��";
		fruits[4] = "������";
				
		for(int i = 0;i< fruits.length;i++  ) {
				System.out.println(fruits[i]);
		}
}
}