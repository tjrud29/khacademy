package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressName {
	public static void main(String[] args) {
		InetAddressName inetMain = new InetAddressName();
		inetMain.InetSample();
		
		
		
		
		
	} 
	public void InetExam() {
			
			
		try {
			InetAddress	address = InetAddress.getByName("www.naver.com");
			System.out.println("host name :" + address.getHostName());
			System.out.println("Ip Adress : " + address.getHostAddress());
			
			//���� ȣ��Ʈ(�� ��ǻ��)�� InetAddress ��ü ����
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local Ip Address : " + localHost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void InetSample() {
		//ȣ��Ʈ�� �̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP�ּҸ� byte �迭�� ���
			//InetAddress ��ü���� IP�ּҸ� ����Ʈ �迭�� ����
			//IP �ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP�ּҸ� �ٷ�� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes�� ����");
			for(byte ip : ipAddress) {
				System.out.println(ip + ".");
				
				//������ �� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ���
				InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
				System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
				for(InetAddress addr : alladdress) {
					System.out.println(addr.getHostAddress());
				}
			}
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("HOST Name :" +hostName);
			
			//���� ȣ��Ʈ�� IP�ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local HOST address " + localHost.getHostAddress());
			
			//��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽĳ��Ʈ �ּ� �Է°� : " + isMultiCast);
			
			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����
			InetAddress name = InetAddress.getByName("www.daum.net");
			System.out.println("IP�ּ� �̸� : " + name.getHostAddress());
			
			//ȣ��Ʈ�� ������ �̸� ��������(��ü ������ �̸�)
			//ȣ��Ʈ�� ����ȭ �� (FQDN) �������� �̸��� ����
			//FQDN : FULL Qualified Domain Name
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Ǯ���� : " + hostFullName);
			
			
			
			//LookPack �ּ� ���� Ȯ��
			boolean isLookPack = address.isLoopbackAddress();
			System.out.println("�����ΰ��� :" + isLookPack);
			
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	}

