package com.kh.pratice4.func;

import java.util.Scanner;

public class HardPratice1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);//�Է� �ޱ� ���� ����ϴ� �޼ҵ�
			System.out.println("���ڸ� �Է����ּ���");//��� �޼ҵ�
			int num = sc.nextInt();//ī�����̽��� nextInt��������
			
			int count = 1; //count�� 1�� �ʱ�ȭ �Ҽ��� �ƴ� ���� ������ ��Ÿ��
			
			if (num <= 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}else {
				boolean checkNum = true;//�Ҽ� ���θ� �Ǵ��ϱ� ���� boolean���� checkNum�ʱ�ȭ ó������ �Ҽ��� ����
				for(int i = 2; i <=num; i++) {//2���� �Է¹��� ���� num������ �Ҽ��� �Ǵ��ϱ� ���� �ݺ���
					for(int a = 2; a*a <= i; a++) {
						//�Է¹��� ���ڰ� �ƴ� ���� ���� i�� �Ҽ����� �Ǵ��ϱ� ���� �ݺ���
						
						if ( i % a ==0) {//���࿡ �Ҽ��� �ƴ� ���
							
							checkNum = false;
							count++;
							break;
						}
						if(checkNum) {
							//�Ҽ� �� �� ���� ���
							System.out.println(i); //��� �޼ҵ� �ۼ�	
						}
						checkNum = true;
					}
					System.out.println("�Ҽ��� �� ���� :" + (num - count));//��� ���� �˻簡 ���� ��,
					//�Ҽ��� �� ������ ���
				}
				
			}
			
			
	}

}
