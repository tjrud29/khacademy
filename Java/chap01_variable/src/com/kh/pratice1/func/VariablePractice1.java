package com.kh.pratice1.func;

import java.util.Scanner;
public class VariablePractice1 {
	public static void main(String[] args) {
		//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println(name);
		
		
		System.out.println("성별을 입력해주세요");
		String gender = sc.next();
		System.out.println(gender);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		System.out.println(height);
		
		//키 180.5cm인 20살 남자 아무개님 반갑습니다^^를 나타내보자
		
		
		System.out.println("키" + height + "cm 인" + age +"살" + gender + name + "님 반갑습니다^^" );
		
		
		
		
		
		
	}

}
