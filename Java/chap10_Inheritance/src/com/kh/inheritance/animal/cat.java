package com.kh.inheritance.animal;

public class cat extends Animal{

		public  cat(String name) {
		super(name);
	
		}
		@Override 
		// animal�� �����ִ� eat�� ����� �ȿ����� �ٽ� ���ǳ�����
		public void sleep() {
			System.out.println(getName() +"�ܴ�");
		}
	}


