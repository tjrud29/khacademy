		package com.kh.ArrayExam;

import java.util.Scanner;

public class ArrayExam {
	public void pratice1 () {


		int value =16;
		int [][] arr = new int [4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
		}
		
	}
	public void pratice2 () {
		int value = 16;
		int [][] arr = new int [4][4];
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				//System.out.printf("%2d " + arr[i][j]);
			}
		}
	}
	public void pratice3 () {

		int row = 0;//��
		int col = 0;//��
		char value = 'a';
		char[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ũ�� :");
		row = sc.nextInt();
		
		arr = new char[row][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "���� ũ��");
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				
			}
			
		}
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; i++) {
				System.out.println(arr[i][j] + "");
			}
			System.out.println();
		}
	}
	


}
	
