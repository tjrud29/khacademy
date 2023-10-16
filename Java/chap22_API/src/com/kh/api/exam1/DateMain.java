package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
  			java1.1���� ���� X
  				java.time ��Ű�� LocalDate LocalTime LocalDateTime
 * */
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ :" + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		//���� ��¥ �� �ð�
		LocalDateTime cldt = LocalDateTime.now();
		System.out.println(cldt);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		
		//��¥ �߰�
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate );
		
		LocalDate minusDate = today.minusDays(6);
		System.out.println("6�� �� ��¥" + minusDate);
		
		LocalDate minusYear1 = today.minusYears(5);
		System.out.println("5�� �� ����" + minusYear1);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		if(date1.isBefore(date2)) {	
			System.out.println("date1�� ����");
		}else if (date1.isAfter(date2)) {
			System.out.println("date1�� ����");
		}else {
			System.out.println("��¥ ����");
		}
		
	}
}










