package com.kh.collection.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PraticeCollection {

	public static void main(String[] args) {
		PraticeCollection pc = new PraticeCollection();
		
		pc.praticeList();
		pc.praticeSet();
		pc.praticeMap();
		
	}
	public void praticeList() {
		List<String> pList = new ArrayList<>();//String add�� ���� ���
		pList.add("�ȳ�");
		pList.add("�����");
		pList.add("�����");
		for(String ss : pList) {
			System.out.println(pList);
		}
		
		
	}
	public void praticeSet() {
		Set<Integer> sList = new HashSet<>();
		sList.add(4);
		sList.add(5);
		sList.add(2);
		sList.add(5);
		
		for(Integer aa : sList) {
			System.out.println(sList);
		}
		
	}
	
	public void praticeMap() {
		Map<Integer,String> mySnacks = new HashMap<>();
		mySnacks.put(3,"����Ĩ");
		mySnacks.put(2,"����");
		mySnacks.put(38, "�Ҵ�");
		
		for(Integer people : mySnacks.keySet()) {
			String code = mySnacks.get(people);
			System.out.println(people + ":" +  code);
		}
		
	}
}
