package com.kh.fileIO;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.pratice1();
		pm.pratice2();
		pm.pratice3();
	}
	public void pratice1() {
		//���� �������� 2�� �����  
		//���� �������� 3�� �����   
		//���� �������� 5�� �����    
		
		String dirPath = "C:\\Users\\user1\\Desktop\\dog\\maltiz";
				
		File dir = new File(dirPath);
		
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	}
	public void pratice2() {
		String dirPath = "C:\\Users\\user1\\Java_workspace\\chap25_";
		
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
		
	}
	
	public void pratice3() {
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Koraen\\kPop\\Group";
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	}
}
















