package com.kh.pratice1.func;

import java.util.Scanner;

public class VariablePratice2 {
	public static void main(String[] args) {
		//정수 두 개를 입력받아, 두 수의 합, 차 , 곱, 나누기 한 몫과 나머지 출력
		Scanner sc = new Scanner(System.in);
		
		int inum1, inum2;
		System.out.println("정수를 입력하세요");
		inum1 = sc.nextInt();
		System.out.println("또 다른 정수를 입력하세요");
		inum2 = sc.nextInt();
		System.out.println(inum1 + inum2);
		System.out.println(inum1 - inum2);
		System.out.println(inum1 * inum2);
		System.out.println(inum1 / inum2);
		
	}

}
