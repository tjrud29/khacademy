package com.kh.ifsample;

public class ifExam {

	public static void main(String[] args) {
		//��ø(����) if��
		/*
		 if (���ǽ�1) {
		 	if(���ǽ�2){
				if(���ǽ�3){
					}else if(���ǽ�4){
					����� ����;
		 }else {
		 ����� ����
		 }
		 else {
		 ����� ����;
		 {
	
		 
		 * */

		//������ ���� �溸!
		int month = 1;
		int temp = -10;
		if (month == 1 || month == 2 || month ==12) {
			System.out.println("�ܿ�");
			if (temp <= -15) {
				System.out.print("���İ溸");
			} else if (temp <= -12) {
				System.out.print("�������Ǻ�");
			}
		}else if (month>=3 && month <= 5) {
			System.out.println("��");
		}else if (month>= 6 && month <=8) {
			System.out.println("����");
			if(temp >= 35) {
				System.out.println("���� ����");
			}else if (temp >= 33) {
				System.out.println("�������Ǻ�");
			}
		}else if (month >= 9 && month <=11) {
			System.out.println("����");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
