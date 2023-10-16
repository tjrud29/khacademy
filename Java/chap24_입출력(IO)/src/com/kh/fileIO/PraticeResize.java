package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PraticeResize {

	public static void main(String[] args) {
		//�̹��� �ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� �����
		//���� ���������� �̹���
	
	
	}
	public void pratice1() {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "hamham.jpg";
		String outpImg = path + "reSizehamham.jpg";
		
		int width = 300;
		int height = 150;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� ���������� ���� on" + e.getMessage());
		}
	}

}
