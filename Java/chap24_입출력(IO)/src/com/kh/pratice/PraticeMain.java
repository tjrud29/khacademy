package com.kh.pratice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PraticeMain {

	public static void main(String[] args) {
		PraticeMain pm = new PraticeMain();
		pm.pratice1();
	}
	public void pratice1() {
		//��� �����ؼ� ���� �����
		FileWriter writer;
		try {
			writer = new FileWriter("C:\\Users\\user1\\Desktop//����.txt");
			//���� ����
			writer.write("�ȳ�");
			//���� �ݱ�
			writer.close();
			
			//��� ������ ��ΰ� Ȯ���� ���(������)
			FileReader reader = new FileReader("C:\\\\Users\\\\user1\\\\Desktop//����.txt");
			BufferedReader bufferd = new BufferedReader(reader);
			
			String line;
			while((line = bufferd.readLine())!=null) {
				System.out.println(line);
			}
			bufferd.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
