package com.kh.fileIO;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "img.jpg";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� ������");
		}else {
			System.out.println("������ ���� �ȵ�");
		}
	}
 
}
