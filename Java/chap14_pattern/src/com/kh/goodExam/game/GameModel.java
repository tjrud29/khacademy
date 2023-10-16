package com.kh.goodExam.game;
//���� ���ڸ��߱� ���� ��
public class GameModel {
	//���� ���߱�
	private int secretNumber;//������ ��ȣ
	private int attempts;//�õ� �� ��?
	
	public GameModel() {
		//1~100 ������ ������ ���� �����ϱ�
		secretNumber = (int)(Math.random() * 100) + 1;
		attempts = 0;
	}
	public int getStcretNumber() {
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectGuess(int Guess) {
		incrementApttempts();
		return Guess == secretNumber;
	}
}
