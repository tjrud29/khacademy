package com.kh.gettersetter.goodExam;

public class GoodPlayer {
private String name;   		//ĳ�����̸�
	
	public void setName(String name) { //�̸��� ����Ǹ� ����� set
		this.name = name;
	}

	public void ValidName() {	//ĳ�����̸��� ������ ������ ����!
		if(this.name =="") {
			System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	
	public String getName() {	//ĳ�����̸��� ��ȯ
		return name;
	}
	
	private int  health; 		//ü��

	public void setHealth(int health) { //�Ű������� ����� ü�� �����ϴ� ��
		this.health = health;
	}
	
	public void VaildHealth() {
		// ���࿡ ü���� 0�̶�� 0���� ǥ��
		if(health <= 0 ) { // ü���� 0 ������ ���
			this.health = 0;
		} 
	}
	
	public int getHealth() { 
		return health;
	}
	
	private int attackPower; //�����Ŀ�
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void VaildAttackPower() { //���Ἲ�ǰ� ����
		//���࿡ �Ŀ��� 0���� ���� ���
		if(attackPower  <= 0) {
			this.attackPower = 0;
		} 	
	}
	public int getAttackPower() {
		return attackPower;
	}
}