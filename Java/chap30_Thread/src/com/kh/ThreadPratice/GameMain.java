package com.kh.ThreadPratice;

import java.io.IOException;
import java.util.Random;

import com.kh.ThreadMain.GameLoop;
import com.kh.ThreadMain.SimpleGame;

public class GameMain {
	public static void main(String[] args) {
		//�ܺ� Ŭ������ �ν��Ͻ��� ����		
		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoop2());
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read(); 

			GameLoop2.isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
		
	
	/*
	class Gm implements Runnable{
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);
				System.out.println("������ ���� : " + randomValue);
				
				// ���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//���� ���� ����
				//Enter Ű�� ������ ������ ����˴ϴ�.
				System.out.println("������ �����Ϸ��� Enter�� ��������.");
			}
		}
	}
	
	class GameLoop implements Runnable{

		
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);//������ ���� ����
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000); //1�� ���
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���� ����");	
			}
		}
*/

	
	
	
	