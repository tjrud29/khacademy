package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 9;//�׷��� ����� ���� 5�� ��Ÿ��
		Graph graph = new Graph(ver);
		
		//addEdge ���� �߰�
		graph.addEdge(1, 2);//���0���� ���1�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 3);//���0���� ���2�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 4);	
		graph.addEdge(1, 6);
		graph.addEdge(2, 3);
		graph.addEdge(2, 5);
		graph.addEdge(2 ,6);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(4, 7);
		graph.addEdge(6, 8);
		
		
		
		System.out.println("DFS Ž�� ��� :" );
		
		//DFS Ž���� ������ ����� ��ȣ�� ����
		//0���� ������
		graph.DFS(4);
		
		
		
	}

}



/*
 DFS Ž���� �����Ͽ� �� ����� ��� 
 Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
 * */
 