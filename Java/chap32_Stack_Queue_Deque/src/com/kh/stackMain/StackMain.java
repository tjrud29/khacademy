package com.kh.stackMain;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack �� �߰� push	
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		
		/*
		 * |        |
		 * |	    |
		 * |	4   |	
		 * |	3   |	
		 * |	2   |
		 * |____1___|
		 * */
		//���� �� ���� �� ��ȯ pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//stack ��ü �� ����(�ʱ�ȭ)
		stack.clear();
		
		//stack ���� ����� ��(���� �ֱ��� ��)
		stack.peek();
		
		//stack �� ũ�� ���
		stack.size();
		
		//stack empty :���ÿ� ����ִ��� Ȯ��
		//����ִٸ� true, �ϳ��� ����ִٸ� false
		stack.empty();
		
		//stack�� 1�� �ִ��� Ȯ�� 1�� ����ִٸ� true
		stack.contains(1);
				
	}
}
