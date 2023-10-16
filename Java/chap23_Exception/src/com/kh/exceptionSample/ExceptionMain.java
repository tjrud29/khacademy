package com.kh.exceptionSample;

public class ExceptionMain {
	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
		exmain.ExceptionF();
		exmain.ExceptionExam();
		
		
	}
	public void ExceptionA() {
		try {
			int result = 10/0; 
			System.out.println(result);
		}catch (ArithmeticException e) {
			/*
			 ArithmeticException : �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e�� �츮�� ���� ������
			 e�� ������ ������ �޼����� getMessage()�� ���� ����
			 * */
			
			System.out.println("��� �������� ���� �߻��� ����!" + e.getMessage());
		 }
	}
	public void ExceptionF() {
		try {
		String juminNumber = "�ȿ���904";
		int number = Integer.parseInt(juminNumber);
		System.out.println("���� : " + number);
	} catch (NumberFormatException N) {
		System.out.println("���ڸ� �־��ּ���");
		System.out.println(N.getMessage());
	}
	
		
		
		
		
	}	
	public void ExceptionExam() {
		try {
		int[] numbers = {1,2,3,4,5};
		int index = 7;
		int result = numbers[index];
		System.out.println(result);
		}catch (ArrayIndexOutOfBoundsException array) {
			System.out.println("�迭 �ε��� ���� ���");
		}catch (Exception e) {
			System.out.println("�迭 �ε��� ������ ������ʰ� �Ϲ����� �ٸ� ���� �߻�");
		}finally {
			//�׻� ����Ǵ� ���
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}

}
