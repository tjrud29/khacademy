package com.kh.finalSample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		int port =3333;
		ServerSocket server;
		server = new ServerSocket(port);
		System.out.println("������ ��Ʈ" + port + "���� ���� ���Դϴ�.");
		while(true) {
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����:" + client.getInetAddress());
			client.close();
		}
	}
	
}	