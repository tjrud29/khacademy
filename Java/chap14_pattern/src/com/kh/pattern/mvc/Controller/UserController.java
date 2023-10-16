package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.view.UsrView;

//import com.kh.pattern.mvc.Veiw.User;
public class UserController {
	/*
	 * �𵨰� �並 �����ϴ� �� ����� �Է��� ó���ϴ� ��
	 */
	private UserModel usermodel;

	private UsrView userview;

	public UserController(UserModel usermodel, UsrView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	public void setUserview(UsrView userview) {
		this.userview = userview;
	}

	public UserModel getUsermodel() {
		return usermodel;
	}

	public UsrView getUserview() {
		return userview;
	}
}