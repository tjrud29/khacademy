package com.kh.inheritance.calculator;

public class Calculator {
	int num1,num2; //��ü���� �ƴ�!!!!!
	
	//���� /���ϱ�,����,���ϱ�,������
	//1.���ϱ�
	public int add(int num1, int num2) {//�Ķ���� = �Ű����� ����2�� �־��ֱ�
		return num1 + num2;
	}
	//2.����
	public int substruct(int num1, int num2) {
		return num1 - num2;
	}
	//3.���ϱ�
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	//4.������
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
}
