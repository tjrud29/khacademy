package com.kh.practice.array.ArrayPractice1;

import java.util.Scanner;

public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		//����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		//1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		
		int num = sc.nextInt(); //��ĳ�� num �Է�
		
		int[] arr = new int[num];//0,1,2,3,4
		
		for(int i = 0; i<arr.length; i++){	
			//arr[0] = 1;
				arr[i] = 1 + i;
				System.out.println(arr[i]);
				     
				
				
		}
		
		
		
		
		

	}

}
