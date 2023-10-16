package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDateFormat {
/*
 SimpleDateFormat
   ��¥�� �ð��� ���ϴ� �������� ������ �ϰų�
   ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
 * */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		
		//������ �� ���ڿ��� ��ȯ
		String forDate = sdf.format(currentDate);
		
		//������
		System.out.println("������ �� ��¥ �� �ð� : " + forDate );
	}
}
