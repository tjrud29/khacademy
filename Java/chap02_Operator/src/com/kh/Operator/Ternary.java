package com.kh.Operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. ���׿�����
		/*
		 * 
		 ���� = ���� ? ���� : ����
		 ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�մϴ�.
		 ���� ? ��1 : ��2 ���·� ���
		 �� 1�� ������ ���� �� ���
		 �� 2�� ������ ������ �� ���
		 * */
		//ex) ���̰� 20. �����ΰ� �̼������ΰ�?
		int age = 20;
		//����
		String status  = (age >=20) ? "����" : "�̼�����";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
			System.out.println(result);
			
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign :" + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println(weather);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		int number1 = 7;
		String ZZac = (number1 % 2 ==0 ) ? "¦��" : "Ȧ��";
		System.out.println(ZZac);
		
		int number2 =-5;
		//false�̸� �ٸ� ������ �Ѿ
		String sign2 = (number2 > 0)? "���" : (number < 0) ? "����" : "0";
		System.out.println(sign2);
		
		
		
		
		
		
		
		
	}

}
