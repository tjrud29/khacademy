package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		//HashMap ���� UserAge
		Map <String, Integer> player = new HashMap<>();
		
		
		//������ �̸��� ����
		player.put("����",332);
		player.put("����123",32);
		player.put("������123321",32);
		player.put("�ȳ�ȳ�",23);
		//Ư�� ���� �˻�
		String playerName = "�ȳ�ȳ�";
		
		//��� �л��� ���� ���
		if(player.containsKey(playerName)) {
			int playerID = player.get(playerName);
			System.out.println(playerName + "�� �������̵��" + playerID + "�Դϴ�.");
		}else {
			System.out.println("������ ã���� �����ϴ�.");
		}
		//���� ���� ����
		String playerIDUpdate = "��������";
		int newPlayerID = 2910;
		player.put(playerIDUpdate,newPlayerID);
		System.out.println(newPlayerID +playerIDUpdate);
		//���� Ż��
		String removePlayer = "����123";
		player.remove(removePlayer);
		System.out.println(removePlayer + "�÷��̾ ������");
		//���� ���� �̸� ���� ���
		
	}

}
