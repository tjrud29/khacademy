package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		MakeFolderMain sc = new MakeFolderMain();
		sc.pratice2();
		//������ ������ ��� ����
		String folderPath = "C:\\Users\\user1\\Desktop//new_folder"; //���ϴ� ��� ����
		
		
		//���������
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�");
		}
		
		FileWriter w;
		try {
			w = new FileWriter("C:\\Users\\user1\\Desktop//new_folder//dd.txt");
			w.write("���� ������ ��� ���Դϴ�.");
			w.write("kh�л�");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void pratice2() {
		String folderPath = "C:\\Users\\user1\\Desktop//new_folder";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("���������Ϸ�");
		}else {
			System.out.println("���� �̹� ������");
		}
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\user1\\Desktop//new_folder//��������.txt");
			fw.write("���̷� �氡");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
