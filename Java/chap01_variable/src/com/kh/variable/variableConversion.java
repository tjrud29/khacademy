package com.kh.variable;

public class variableConversion {
	public static void main(String[] args) {
	//1. �ڵ�����ȯ(�Ͻ�������ȯ,����������ȯ)
	int intNum = 100;
	System.out.println(intNum);//intNum : ���� 100�� �ǹ�
	long longNum = intNum;//int�� long�� �ڵ� ����ȯ
	System.out.println(longNum);
	
	float floatNum = 3.14f;
	double doublenum = floatNum;//float�� double�� �ڵ� ����ȯ
	System.out.println(doublenum);

	
	//int > long �����ϴ� ����ȯ 2���� �����
	int intNum2 = 10;
	long shortNum2 = intNum2;
	System.out.println(shortNum2);
	int itit = 20;
	long lglg = itit;
	System.out.println(lglg);
	
	//short > int �����ϴ� ����ȯ 1���� �����
	short sht = 20;
	int int3 = sht;
	System.out.println(int3);
	
	//float > double �����ϴ� ����ȯ 1���� �����
	float ft = 12.123f;
	double db = ft;
	System.out.println(db);
	
	//2.���� ����ȯ(����� ����ȯ)
	//long > int
	long largeLong = 12345L;
	System.out.println(largeLong);
	int largeInt = (int) largeLong; //(int)�� �߰��ϸ� ������ ����ȯ ����                                                                     
	System.out.println(largeInt); // long�� int�� ���� ����ȯ �� ��� ���� ���� �ȿ� ���� ������ �Ϻε����� �սǵȴ�
	
	double largeDouble1 = 12345.6789;
	int intpart = (int)largeDouble1;
	System.out.println(intpart);//�Ǽ��� ������ ���� ����ȯ �� ��쿡�� ���� �κи� ����
	
	
	//���ڴ� char charbalue = 'Z'; > int�� ���� 2�� ���
	char charbalue = 'Z';
	int it1 = charbalue;
	System.out.println(it1);
	char charbalue1 = 'A';
	int intbalue = charbalue1;
	System.out.println(intbalue);
	
	//double > int�� ����ȯ ��� 1��
	double aa = 22.1;
	int ii = (int)aa;
	System.out.println(ii);
	
	//int�� short�� ����ȯ 1��
	int in1 = 21;
	short sh1 = (short)in1;
	System.out.println(sh1);
	
	
	
	
	
	
	
	}
	}

