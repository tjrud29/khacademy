package com.kh.pratice3.userScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5�� ���� �Է�");
		int[] numbers = new int[5];
		//�迭�� 5���� ������ �Է��ϴ� ����
		for(int i = 0; i <5; i++) {
		numbers[i] = sc.nextInt();
		System.out.println(numbers[i]);
		}
		int sum = 0;
		for(int number1 : numbers) {
			sum += number1;
			System.out.println(sum);
		}
	}

}
                              