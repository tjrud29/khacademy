package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.eat();
		myDog.speak();
		
		cat mycat = new cat("��߹�");
		mycat.sleep();
		
		monkey mymonkey = new monkey("������");
		mymonkey.punch();
		
		rabbit myrabbit = new rabbit("�䳢");
		myrabbit.jump();
	}

}
