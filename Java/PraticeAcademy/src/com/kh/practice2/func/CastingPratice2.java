package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPratice2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������� :");
			double kor = sc.nextDouble();
			
			System.out.println("�������� :");
			double eng = sc.nextDouble();
			
			System.out.println("�������� :");
			double mat = sc.nextDouble();
			
			int	averageScore = (int)(kor + eng + mat);
			int totalScore = (averageScore / 3);
			System.out.print("��������" + kor + "��������" + eng + "��������" + mat + "���� =" + averageScore + "�������" + totalScore    );
			
			

	}

}
