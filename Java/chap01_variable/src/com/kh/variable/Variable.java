package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1.������ �̸��� ������,����,������ھ�(_),�޷�($)�� ��������
		
		// 2.������ �̸��� ���ڷ� ������ �� ����.
		
		// 3.���� �̸� ���̿��� ���� �Ұ�
			//����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ����.
		
		// 4.�ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�.
		// ex) int int =1; ���� ��
		
		
		//1.�Ǽ��� (float, double) 
		float pie1 = 3.1415513552233f; //float�� f�� F�� �ۼ����ش�
		double pie2 = 3.1415513552233;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double :");
		System.out.println(pie2);		
		
		
		//2.������(byte,short,int,long)
		//byte : �̴� -128~127���� ��� ����
		//byte bt = -129; ���� �ȵ�. int�� �����ϰų� ���� byte + byte�� �־���� �Ѵ�
		byte bt = 127;
		System.out.println(bt);// -129�� 128 �̻���� ��� �Ұ���
		//short = -32,768 ~ 32,767 ��밡��
		//short shrt = -32769; ���� �ȵ�. -32,769�� 32,768 �̻���� ��� �Ұ���
		short shrt = -32767;
		System.out.println(shrt);
		//int �� -2,147,483,648 ~ 2,147,483,647 ���� ��� ����
		//long �� -9,223,372,036,854,775,828~
		long lng = 2000l; //long�� �ڿ� l�̳� L�� �ٿ��ش�
		
		
		
		//3.������(String,char)
		//String�� �⺻���� �ڷ����� ������ ������ �⺻������ ����
		//�⺻���� �ڷ����� ���� �ʱ� ������ String���� ǥ����
		//String�� ""�� ''�ȿ� ���ڸ� �ۼ� �� ��
		String name = "�ȳ��ϼ���";
		//char : ������ ���ڸ� �ѹ��ڸ� ���� ����
		//char : ''�ȿ� ���ڸ� �ۼ� �� ��
		char chr1 = 'a';
		System.out.println(chr1);
		
		
		//4.����
		//boolean �� true�� false �� ǥ���Ѵ�
		//����� : boolean bln = true; false;
		boolean bln1 = true;
		System.out.println(bln1);
		boolean bln2 = false;
		System.out.println(bln2);
		
		
		System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		String name1 = "ȫ�浿";
		System.out.println("�ȳ��ϼ���.����" + name1 + "�Դϴ�.");
		//�� �� Ÿ���� ������ ������ �缱���� ���� �ʰ�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              �Ǳ״�� ��� ����
		//�� �� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �Ұ�
		//������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ���� �Ұ�
		name1 = "��ö��";
		System.out.println("�ȳ��ϼ���. ����" + name1 + "�Դϴ�.");
		int age = 23;
		String soccer = "�౸�Դϴ�.";
		System.out.println("�ȳ��ϼ���. ����" + name1 + "�Դϴ�." );
		System.out.println("���� ���̴�" + age + "�̰�," );
		System.out.println("���� ��̴�" + soccer);
		
		char score = 'a';
		System.out.println("���� ������" + score + "�Դϴ�.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
