package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class ArrayPratice2 {

	public static void main(String[] args) {
		//������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		//������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6������ ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		String[] arr = new String[7];// 0123456
		arr[0] = ("��");// String[] arr = {"��", "ȭ", "��", "��"...}���ε� ����
		arr[1] = ("ȭ");
		arr[2] = ("��");
		arr[3] = ("��");
		arr[4] = ("��");
		arr[5] = ("��");
		arr[6] = ("��");
		
		if(num <0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else if (num >6) {
				
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					
		}else {
			System.out.println(arr[num]);
			
		}
		
		
		
		
		
	}

}
