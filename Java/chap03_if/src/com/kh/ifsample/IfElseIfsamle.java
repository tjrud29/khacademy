package com.kh.ifsample;

public class IfElseIfsamle {
	public static void main(String[] args) {
		//if -else if esle
		/* 
		 �������� ������ ���������� ��
		 
		  �� �� ù��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		  ���� if�� else if�� ������ ���� �ƴ϶�� ������ else ��� ����
		  
		  if(����1){
		  //���� 1�� ���� �� ����Ǵ� �ڵ�
		  } else{
		  //���� 2�� ���� �� ����Ǵ� �ڵ�
	      } else{
	      //���� ��� ������ ������ �� ����Ǵ� �ڵ�
	      }
		  
		 * */
		
		int age = 20;
		if (age>=20) {
			System.out.println("���� �ؿܿ����� ���ž�!");
		} else if (age >= 20) {
			System.out.println("���迩���� ���ž�!");//else if�� ������ �ɼ� �ִ�

		}else {
			System.out.println("���� ���� ������");//else�� ������ ����
		}
		
		//int score = 85;
		/*
		 ���࿡
		 90���̸� B+
		 90���� ������ A
		 90�� �̸��̸� B
		 * */
		
		
		int score = 100;
		if (score >90 ) {
			System.out.println("����� ������ A�Դϴ�.");
		} else if(score == 90) {
			System.out.println("����� ����� B+�Դϴ�.");
		} else {
			System.out.println("����� ����� B�Դϴ�.");
		}
		
	
		int hour = 12;
		if (hour < 16) {
			System.out.println("���� ��ħ�Դϴ�.");
		}else if (hour < 18) {
			System.out.println("������ �ڵ��մϴ�.");
		}else {//18�� ����
			System.out.println("�����ϼ̽��ϴ�.");
		}
		
		//����üũ
		int temp = 28;
		if (temp > 30) {
			System.out.println("���� �����Դϴ�.");
		}else if (temp>20) {
			System.out.println("������ �����Դϴ�.");
		}else {
			System.out.println("�ҽ��� �����Դϴ�.");
		}
	
		int num = -5;//0���� Ŭ �� �� (true)
		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num < 0) {//0���� ���� �� �� (true)
			System.out.println("�����Դϴ�");
		} else {//0�� �� �� (true)
			System.out.println("0�Դϴ�.");
		}
		
		/*
		 int age = 15�� �� 
		 û�ҳ����� ������� ���������� ����Ͻÿ�
		 * */
		int age1 = 15;
		if (age1 >= 20) {
			System.out.println("�����Դϴ�.");
		}else if (age1 > 10) {
			System.out.println("û�ҳ��Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}
		
		//���� ����ϱ�
		
		int month = 6;
		if (month == 1 || month ==2 || month == 12) {//1,2,12��
			System.out.println("�ܿ�");
		}else if (month >= 3 && month <= 5) {//3,4,5��
			System.out.println("��");
		}else if (month >= 6 && month <=8); {//6,7,8��
			System.out.print("����");
		} 
		
		
		
		
		
		
	}
	

}
