package com.kh.pratice4.func;

import java.util.Scanner;

public class pratice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�");
		int num = sc.nextInt();//num�� �� ��
		int result = 0;//�����
		
		if (num>9) {
			System.out.println("1~9������ ���ڸ� �Է��ϼ���.");
		}else {
			for(int k =num; k<=9; k++) {//�ܼ� 4���̶�� ������ ��
				System.out.println(k+"��");
				for(int i = 1; i <10; i++ ) {
					result = k * i;
					
					System.out.println(k + "*" +i + "="+result);
					
					
				
				}
			}
		}
				
			
			
		}

	}


