package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		//���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "banna", "cherry"},
				{"grapes", "Orange", "strawberry"},	
				{"kiwi","mange","pineApple"}
				
		};
		for(int i = 0;i < fruits.length; i++) {
			for(int a = 0; a< fruits[i].length; a++) {
				System.out.println(fruits[i][a] + "");
			}
			System.out.println();//���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
			
		}

		
		}
	}


