package com.kh.instance.tv;

public class Tv {
	//Tv ����
	//tv �Ӽ�(�ʵ�)
	String color;//tv ����
	boolean power;//���� ����
	int channel;//ä��
	
	//tv ���(�޼���)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
