package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain sc = new ReplaceMain();
		sc.replace2();
		sc.replace3();
		sc.replace4();
		sc.replace5();
		sc.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-","");
		System.out.println(input2);
		
	}
	
	public void replace2() {
		String input = "Hello World";
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3(){
		String originName = "Hello world";
		//o�� ���� �ִ� ���ڿ��� x�� ġȯ�ϱ�
		String reoriginName = originName.replace("o", "x");
		System.out.println("reoriginName : " + reoriginName);
		
		
	}
	public void replace4() {
		String originString = "The quick brown fox jups over the lazy dog";
		//fox�� cat�� �ٲٱ�
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
	}
	public void replace5() {
		//��� ���� ����
		String originString = "The quick brown fox jups over the lazy dog";
		String reoriginString = originString.replace(" ", "");
		System.out.println("�������� :" + reoriginString);
	}	
	public void replaceAll() {
		String originString = "Hello World";
		//replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���� ���� ���ڿ� ġȯ�ϱ�
		String reAllStr = originString.replaceAll("(?i)world", "hi" );
		System.out.println(reAllStr);
	}
}
