package com.kh.practice2.func;

public class CastingPracrice2 {
	public static void main(String[] args) {
		//�Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		//�� �� ������ ����� ���������� ó���ϼ���.
		
		double korean = 90.0;
		double english = 90.0;
		double math = 90.0;
		System.out.println("���� : " + korean + "���� :" + english + "���� : " + math);
		int ikorean = (int) korean;
		int ienglish = (int) english;
		int imath = (int) math;
		
		
		
		
		System.out.println(ikorean + ienglish + imath);
		System.out.println((ikorean + ienglish + imath )/3);
	
	}
	

}
