package com.kh.example.pratice2.Run;

import com.kh.example.pratice2.model.vo.product;

public class productRun {

	public static void main(String[] args) {
		//product ���� 3�� �ϰ� ���� ��ǰ�� ���� �귣��� ����ϱ�
		
		 product product1 = new product("������",20,"��������");
		 product product2 = new product("�Һ��继",10,"��������");
		 product product3 = new product("����",26,"����������");
		
		 
		 	
		 product1.information();
		 product2.information();
		 product3.information();
			 
		 
	}

}
