package com.kh.hw.person.run.Run;

public class Run {	
		private String name;
		private int age;
		private double height;
		private double weight;
		
		
		public void person(String name, int age, double height, double weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
	
		public void info() {
			System.out.println("�̸� :" +name);
			System.out.println("���� :" + age);
			System.out.println("Ű :" + height);
			System.out.println("������ :" + weight);
		}

}


