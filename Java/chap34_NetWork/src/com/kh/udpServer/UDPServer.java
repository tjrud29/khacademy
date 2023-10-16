package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 
	 ��Ʈ��ũ ����� ���� �߿��� Ŭ����
	 UDP(User datagram Protocol) ����ؼ� �����͸� �ۼ��� �ϴµ� ���
 
 DatagramSocket
 	UDP ����� ���� ���� Ŭ����
	 TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ�
	 ������ ��Ŷ�� �׳� ������ �޴� ����
DatagramPacket
	UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
	�������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ���� �� ����� ������ ����
	Packet�̶�? ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ �� ���
				�����͸� �ְ� ���� �� ���س��� ��Ģ
				pack + bucket�� �ռ���
 * */
public class UDPServer {
	//start() UDP ������ �����ϴ� �޼��� \. ���ܸ� ������ �����Ƿ� ���� ó���� �ʿ�
	public void start() throws Exception {
		//12345�� ��Ʈ�� ����ϴ� ������ ����. ������ ���ؼ� UDP ����� �̷����
	DatagramSocket socket = new DatagramSocket(12345);
	//inpacket : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���
	//outpacket : Ŭ���̾�Ʈ���� �����͸� ������ �� ���
	DatagramPacket inPacket, outPacket;
	
	byte[] inMsg = new byte[10];
	byte[] outMsg;
	//while ������ ����ؼ� ������ ����ؼ� ����
	// �� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
	
	while(true) {
		//�����͸� �����ϱ� ���� ��Ŷ�� ����
		//inpacket�� ���� Ŭ���̾�Ʈ�� IP�ּҿ� port��ȣ ���
		inPacket = new DatagramPacket(inMsg, inMsg.length);
		//��Ŷ�� ���� Ŭ���̾�Ʈ�κ��� �����͸� ����
		socket.receive(inPacket);
		
		//������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & port
		InetAddress address = inPacket.getAddress();
		int port = inPacket.getPort();
		
		//������ ���� �ð��� �ú��� ���·� ��ȯ
		//���� ���� �ð��� hh:mm:ss ������ ���ڿ��� ��ȯ
		SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
		String time = simpleDate.format(new Date());
		outMsg = time.getBytes();
		
		//��Ŷ�� �����ؼ� Ŭ�󸮾�Ʈ���� ����
		outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);
		
	}
}
	//main �޼��� : UDPServer Ŭ������ �ν��Ͻ��� �����ϰ�
	//start() �޼��带 ȣ���Ͽ� UDP���� ����
	//���� �߻��ϸ� ���� ó��
	public static void main(String[] args) {
		try {
			new UDPServer().start();//udp ���� ����
					//new UDPServer.start(); �� ���� error
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	


}



