package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		
		
		player1.setName("KH");
		//������ : 0-10 = -10
		player1.setHealth(-10);
		player1.setAttackPower(-20);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("������");
		player2.setHealth(80);
		player2.setAttackPower(10);
		
		player2.displayInfo();
		
		System.out.println("attack!!!! ��");
		
		
	}

}	