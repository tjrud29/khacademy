package com.kh.overloadingEX;

public class OverloadingExam {
	//������ ����
	public int sum(int a, int b) {
		return a+b;
	}
	//�� ���� ������ ����
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	//�� ���� �Ǽ��� ����
	public double sum(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		OverloadingExam obj = new OverloadingExam();
		
		System.out.println("�� ������ �� :" + obj.sum(10, 20));
		System.out.println("�� ������ �� :" + obj.sum(10, 20, 30));
		System.out.println("�� �Ǽ��� �� :" + obj.sum(10.5, 10.5));
	}

}
