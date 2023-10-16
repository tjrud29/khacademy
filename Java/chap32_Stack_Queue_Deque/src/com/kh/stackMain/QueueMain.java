package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		//ť Queue ����
		Queue<String> queue = new LinkedList<>();
		
		/*	front     Rear(tail)
		 * 	  |			|
		 * 	  v			|
		 * +----+   +-----+
		 * |	|	|	  |      
		 * |1	|<- |2    | 
		 * |	| 	|	  |
		 * |____|	|_____|
		 * */
		
		//ť�� ��� �߰�
		queue.offer("Apple");
		queue.offer("banana");
		queue.offer("Cherry");
		
		//ť���� ��� ���� �� ���(FIFO ������� ��� ��)
		String removedElement = queue.poll(); //queue���� Apple �����ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll(); //banana �����ϰ� ��ȯ
		
		//ť�� front ��� Ȯ��
		String frontElement = queue.peek();//queue�� front ��� cherry��ȯ
		
		//ť�� ũ�� Ȯ��
		int size = queue.size();
		
		/*
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}*/
	}

}
