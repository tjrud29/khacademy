package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class PraticeMain2 {

	public static void main(String[] args) {
		PraticeMain2 pm2 = new PraticeMain2();
		
		pm2.PraticeQueue();
	}
	
	
	
	public void PraticeQueue() {
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("dangdangi");
		queue.offer("mongmongi");
		queue.offer("sarangi");
		
		queue.poll();
		System.out.println(queue);//��ȯ �� ����
		
		while(!queue.isEmpty()) {
			queue.poll();
			System.out.println(queue);
		}
		
	}
}
