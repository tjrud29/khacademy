package com.kh.classCircle;

public class CircleRun {

	public static void main(String[] args) {
		// �⺻������ ��ü ����!
		Circle circle = new Circle();
		
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���!
		System.out.println("�ʱ� ���� ������ �˰� �ʹ�");
		//inRadius
		circle.AreaCircle();
		//AreaCircle
		circle.SizeOfCircle();
		//SizeOfCircle
		
		//�������� 1�� ������Ų��.
		circle.inRadius();
		//���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ����ϱ� 
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeOfCircle();
	}

}
