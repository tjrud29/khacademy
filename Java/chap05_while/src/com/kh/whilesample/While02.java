package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	boolean ischoice = false;
	
	while (!ischoice) {//����ǥ�� ����Ͽ� ischoice�� true�� ����
		System.out.println("������ �������ּ���");
		
		int month = sc.nextInt();
	
	switch (month) {
	case 12 : case 1: case 2:
		ischoice = true;//case 3�� �� �ϳ��� ���̸� ���//case3���� �������� break �ϳ��� �� ����
		System.out.println("�ܿ�");
		break;
		
	case 3 : case 4 : case 5 :
		ischoice = true;//�� ����ǥ�� ���� ��쿡�� ���� �������� ����ǰ� ������ ������ ����Ǳ⶧���� true�� �ۼ����־� false�� �������ش�
		System.out.println("��");
		break;
	case 6 : case 7 : case 8 :
		ischoice = true;
		System.out.println("����");
		break;
	case 9 : case 10 : case 11 :
		ischoice = true;
		System.out.println("����");
		break; //break�� case������ �����ϰ��� �ϴ°� ����� �Ŀ� �����
		default :
			System.out.println("�ٽ� ����");
	}
	}
	//���̸� �Է¹޾� ���� û�ҳ� ��̷� �з��ϰ� ����ϱ�
	//while switch case�̿�
	//����(19~20)
	//û�ҳ�(14~17)
	//���(10~13)
	//�̿� ���̴� �ٽ� �Է�
	//���̰����� �����ϴµ��� 9�� �̻� ���� ����
	
	boolean isFalse = false;
	
	while(!isFalse) {//�ݺ����� true�� false�� �����ϸ� ������ ������ �ʰ� ��� ����Ǳ� ������ ������ �̿��ؼ� 
		//���� �� ����� �ִ�.
		//while���� ����ϴ� ������ ���࿡ �߸��� ���� �Է��ϸ� �ٽ� �Է��� �� �ֱ� ����
		System.out.println("���̸� �Է��ϼ���");
		
		int iage = sc.nextInt();
		
		switch (iage) {
			case 10: case 11 : case 12: case 13:
				System.out.println("���");
				isFalse = true;
				break;
			case 14 :case 15 : case 16: case 17:
				isFalse = true;
				System.out.println("û�ҳ�");
				break;
			case 19: case 20 : 
				isFalse = true;
				System.out.println("����");
				break;
				
			default :
				System.out.println("�ٽ��Է����ּ���");
				
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	}

}
