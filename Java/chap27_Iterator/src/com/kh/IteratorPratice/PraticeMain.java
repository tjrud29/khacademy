package com.kh.IteratorPratice;

import java.util.ArrayList;
import java.util.Iterator;

public class PraticeMain {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<>();
		food.add("����");
		food.add("��ġ�");
		food.add("���̽�ũ��");
		food.add("�ٳ���");
		
		Iterator<String> iter = food.iterator();
		
		while(iter.hasNext()) {
			String fod = iter.next();
			System.out.println(fod);
		}
		
		iter = food.iterator();
		while(iter.hasNext()) {
			String fod = iter.next();
			
		}
		//Iterator �̿��Ͽ� ��� ����
			iter = food.iterator(); //�ٽ� iterator�� �ʱ�ȭ
			while(iter.hasNext()) {
			String fod = iter.next();
		//���࿡ ������ ������ �����ϱ� ����
			if(fod.equals("����")) {
			iter.remove();
			}
				System.out.println(fod);
			}
				
			//���� �� ArrayList ���
			System.out.println("���� �� ���");
		for(String a : food) {
			System.out.println(a);
			}
		}
}