package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		//������
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = sc.nextInt();
		
		int result = 0;//���� ���� 0���� �ݴϴ�.
		for(int i = 0; i<num2; i++) {//for ������ ����ؼ� i������ 0���� num2�̸����� �ݺ�
			result += num1;//result������ num1������ ����
			System.out.println("��" + num1+ "ù��°" + num2 + "�ι�°" + result);
		}
		
			System.out.println(num1+ "ù��°" + num2 + "�ι�°" + result);
			//���� ����� ��� �Է¹��� �� ���ڿ� �������
			
			
			
				
				
			}
			
			
		
		
		
		
	}


