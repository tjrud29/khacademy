package com.kh.testSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(3,4);
		assertEquals(7,result);//���󰪰� ���� ����� ��
		
	}
	@Test
	public void testSubtration() {
		Calculator cal = new Calculator();
		int result = cal.subtract(10, 5);
		assertEquals(5, result);
	}

}
