package com.kh.Pratice;

import com.kh.BFS.Graph;

public class PraticeGraph {
	
	
	public static void main(String[] args) {
		PraticeGraph ph = new PraticeGraph();
		ph.DFSPraticeMain();

	}
	public void DFSPraticeMain() {
		BFSGraph g = new BFSGraph(12);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,5);
		g.addEdge(4,6);
		g.addEdge(5,7);
		g.addEdge(4,8);
		g.addEdge(5,10);
		g.addEdge(4,9);
		g.addEdge(5,11);
		System.out.println("BFS Ž�� ��� :");
		//BFS�� ���� ���0���� ȣ���ؼ� ����
		g.BFS(1);
		
	}
}
