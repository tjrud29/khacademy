package com.kh.pratice4.func;

import java.util.Scanner;
		
public class pratice2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		        int num1 = sc.nextInt();
		        
		        
		        boolean isTrue = false;
		        
		        while(!isTrue) {
		 
				if(num1 <1) {
					System.out.println("1 �̻��� ���ڸ� �Է��Ͻÿ�.");
					} else {
						for(int i = 1; i<=num1; i++)
							System.out.println(i);
					}
		
					isTrue = true;
					//while�� ���ǹ��� false�� �ٲ�

						        }
		
		
		
		
		
		
		
		
		

	}

}
