package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalrcularorRun extends Calculator{

	public static void main(String[] args) {
		//��ĳ�� �̿��ؼ� �ڵ� �����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1�� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("num2�� �Է��ϼ���");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result1 = cal.add(num1,num2);
		int result2 = cal.substruct(num1,num2);
		int result3 = cal.multiply(num1,num2);
		int result4 = cal.divide(num1,num2)	;
		System.out.println("Add :"  + result1);
		System.out.println("sub :"  + result2);
		System.out.println("mul :"  + result3);
		System.out.println("div :"  + result4);
}

}
