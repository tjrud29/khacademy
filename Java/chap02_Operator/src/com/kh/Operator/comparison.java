package com.kh.Operator;

public class comparison {

	public static void main(String[] args) {
		// 4. 비교연산자 : 값을 비교할 때 사용
		/*
		 크기 비교, 등호 비교 등을 수행할 수 있음
		 두개의 항 중 어느것이 더큰지, 더작은지, 같은지, 다른지의 여부 판단
		 비교연산자의 결과 값은 참(true) 또는 거짓(false)
		 > 왼쪽 항이 크면 참, 아니면 거짓을 반환  ex)num>5
		 < 왼쪽 항이 작으면 참, 아니면 거짓을 반환  ex)num<5
		  >= 왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환 ex)num>=5
		  <= 왼쪽 항이 오른쪽 항보다 작거나 같으면 참, 아니면 거짓을 반환 ex)num<=5
		  == 두 항의 값이 같으면 참, 아니면 거짓을 반환 ex) num==5
		  != 두 항의 값이 다르면 참, 아니면 거짓을 반환 ex) num!=5
		 
		*/
			int p = 5;
			int q = 10;
			System.out.println("boolean을 넣지 않음 : " + (p==q));
			boolean isEqual = (p==q);
			System.out.println(isEqual);
			
			int r =5;
			System.out.println(p == r);
			
			boolean isEqual1 = p != q;
			System.out.println(p != q);
		
			boolean isEqual2 = p != r;
			System.out.println(p != r);
		
		
		
		
		
		
		
		
		
		
	}

}
