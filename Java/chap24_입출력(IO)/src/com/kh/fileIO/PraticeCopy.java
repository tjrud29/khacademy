package com.kh.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PraticeCopy {

	public static void main(String[] args) {
		//�̹��� ���� jpg �Ǵ� png ���� ����ȭ�鿡 ���� ��
		//����ȭ�鿡 ���� �����ϰ� ���� �ȿ� ������ �̹��� �����ϱ�
		PraticeCopy pc = new PraticeCopy();
		pc.pratice1();
	
		
		
	}
	public void pratice1() {
		
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String outputFolder = "C:\\Users\\user1\\Desktop\\img.jpg";
		
		File ss = new File(inputFile);
		
boolean success = ss.mkdir();
		
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFolder)){
			byte [] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer))!= -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("������ ����Ǿ����ϴ�");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			
		
		
		}
		
		
		
		
	}


