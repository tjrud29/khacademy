package com.kh.GraphMain;

import java.util.LinkedList;
/*
 Graph class = ��������Ʈ�� ����ؼ� ���� ������ ���� 
 * */
public class Graph {
	private int V; // �׷����� ��� ��
	private LinkedList<Integer>[] adjList;//��������Ʈ �迭
	
	//�׷��� ������
	//�׷��� ũ��(��� ��)�� �޾ƿͼ� �׷����� �ʱ�ȭ
	//adjList �迭�� �� ���Ҹ� �� LinkdeList�� �ʱ�ȭ
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		
		for(int i = 0;i < ver; i ++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	//addEdge : �׷����� ���ο� ������ �߰�
	public void addEdge(int source, int des) {
		//source���� des�� ���� ������ �߰��ϸ� adjList�迭���� 
				//source�� �ش��ϴ� LinkedList�� des�� �߰�
		//des : ������
		adjList[source].add(des);
	}	
	
	//�׷��� Ž��(���� �켱 Ž��)
	//���� �켱 Ž���� �����ϰ�, ���� ��带 �Ű������� ����
	public void DFS(int startNode) {
		boolean[] visited = new boolean[V];
		DFSUtil(startNode,visited);
	}
	
	//���� ���� �켱 Ž�� ����
	private void DFSUtil(int currentNode, boolean[] visited) {
		//���� ��带 �湮�� ������ ǥ��
		visited[currentNode] = true;
		System.out.println(currentNode + " ");
		//���� ���� ����� ���� ��带 Ȯ���ϰ�, �湮���� ���� ������带 ��������� �湮
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtil(neighbor,visited);
			}
		}
	}
}
