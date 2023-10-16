package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		//String Integer T ����Ͽ� ���
		PracticeMain PM = new PracticeMain();
		PM.pratice1();
		PM.praticeGeneric();
		
		
	}
		public void pratice1() {
			ArrayList <Integer> intList = new ArrayList<>();
			intList.add(1);
			intList.add(2);
			intList.add(3);
			
			
			
			printList(intList);
		}
		
		public static <T> void printList(ArrayList<T> list ) {
			for(T item : list) {
				System.out.println(item);
			}
		}
		
		public class Snack<T> {
			T content;
			
			public void put(T item) {
				this.content = item;
				
			}
			
			public T get() {
				return content;
			}
		}

		public void praticeGeneric() {
			
			//������,������ �����͸� �����ϴ� �ڽ� �ν��Ͻ� ����
			//���� for�� �̿��ؼ� ���
			Snack<Integer> intSnack = new Snack<>();
			intSnack.put(33);
			intSnack.put(334);
			int intvalue = intSnack.get();
			
			Snack<String> strSnack = new Snack<>();
			strSnack.put("���ִ�");
			strSnack.put("������");
			String strvalue = strSnack.get();
			
			System.out.println("intsnack :" + intvalue);
			System.out.println("strSnack : " + strvalue);
			
			
			
			
			
			
		}
		
}
