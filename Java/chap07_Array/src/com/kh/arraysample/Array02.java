package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		//1. 배열의 길이를 선언
		 int[] num = new int[10];//길이가 3인 배열 선언
		//1~10 까지의 반복문을 이용해서
		 for(int i =0; i<num.length;i++) {
			 num[i] = i + 1;
			 //System.out.println(num[i]);
			 
			 
		 }
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력
		for(int i =0; i <= num.length; i ++) {
			//System.out.println(i);
		}
		 
		//길이가 10인 배열을 선언 1~10까지의 값을 반복문을 이용해서
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력
		//출력값 : 10 9 8 7 6 5 4 3 2 1 
		 
		 
		 int[] num2 = new int[10];
		 int value = num2.length;
		 
		 for(int i = 0; i<num2.length; i++) {
			 
			 num2[i] = value--;			
			 System.out.println("num2 : " + num2[i]);
			 
		 
		 }
		 
		
		 // 2.길이가 5인 String 배열 선언
		 //"사과", "귤", "포도", "복숭아" , "참외"로 초기화 한 후
		 //배열 인덱스를 활용해서 귤을 출력하기
		 
		 
		 int[] num3 =  new int[5];
		 String[] fruit = {"사과","귤","포도","복숭아","참외"};
		 System.out.println(fruit[1]);
		 
		 
		
		 
		 
		 
		 
		 System.out.println(fruit[1]);
		 
		 
		 
		 
		 
		 
		 
	}
}
		
		 
		

	


