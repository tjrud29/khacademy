package com.kh.ThreadMain;

public class StudentThread extends Thread{
	private String studentName;
	
	StudentThread(String name) {
		this.studentName = name;
	}
	
	@Override
	public void run() {
		System.out.println(studentName + "��(��) ���θ� �����մϴ�.");
		try {
			Thread.sleep(2000);//�����尡 2�ʵ��� ���ڱ� ���·� �ֵ��� �մϴ�.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(studentName + "��(��) ���θ� ��Ĩ�ϴ�");
	}
	

}
