package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.UserController;
import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.view.UsrView;

public class UserClient {

	public static void main(String[] args) {
	/*
	 * MVC ������ ����ؼ� �л������� �ٷ�� ��
	 * */
		//�� ��ü ����
		UserModel user = new UserModel("ȫ�浿",20);
		
		//�� ��ü ����
		UsrView view = new UsrView();
		
		//��Ʈ�ѷ� ��ü ���� �� �� �� ����
		UserController controller = new UserController(user, view);
		
		
	}

}