package com.kh.Operator;

public class incrementDecrement {

	public static void main(String[] args) {
		// 3. ����������(Increment & Decrement)
		/* ���������ڴ� ������ ���� 1�� ������Ű�ų� ���ҽ�ų �� ���
		 ���� ���� ������(++x, --x) ���� ���� ������(x++, x--)
		 ���� ���� ������
		 val = ++num; //num�� ���� 1 ������ �� val ������ ����
		 val = --num;//num�� ���� 1 ������ �� val ������ ����
		  
		  */
		//���� ����������
		int val;
		int num1 = 10;
		val = ++num1; //num�� ���� 1 ������ �� val������ ������ �ϱ� ������ 11�� ��
		System.out.println(val);
		
		//���� ���� ������ : ++���� ���� 1�� ���Ѵ�
		int val3, val4;
		int num2 = 10;
		System.out.println(num2);
		val3 = num2++;//val3������ ���� num3 ���� ������ �� num �� 1����
		//1�� val3 = num2 �� �߰�����
		//2�� num2 ++1 �߰����� = num2 = 11
		System.out.println(val3);
		System.out.println(num2);
		
		val4 = num2--;
		System.out.println("val4: " + val4);
		System.out.println("num2�� �� : " + num2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
