package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ���
 						�־��� ������(�⺻:����)�� ������� ���ڿ��� ��ū���� �и�
 * */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.STExam();
		//stm.stExam2();
		//stm.stExam5();
		stm.StringtoMath();
	}
	public void STExam1() {

		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam3() {
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
}
	public void stExam4() {

		
	}
	public void stExam5() {
		String text = "this is a test, but not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text, ".");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	

	public void StringtoMath() {
		String text = "the price is $.15.88";
		StringTokenizer tokenizer = new StringTokenizer(text, "$.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)  ?")){
				System.out.println("Number :" + token);
			}
		}
	}
}