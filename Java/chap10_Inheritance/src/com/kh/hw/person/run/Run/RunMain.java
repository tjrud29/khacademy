package com.kh.hw.person.run.Run;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		String name1 = sc.next();
		System.out.println("���� �Է�");
		int age1 = sc.nextInt();
		System.out.println("Ű �Է�");
		int height1 = sc.nextInt();
		System.out.println("������ �Է�");
		int weight1 = sc.nextInt();
		
		Student mystudent = new Student(name1, age1, height1, weight1);
		mystudent.info();
	}
}
