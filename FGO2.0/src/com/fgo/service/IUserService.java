package com.fgo.service;

import java.util.List;

import com.fgo.model.User;

public interface IUserService {
	/**
	 * ��ѯ�û�ȫ����Ϣ
	 * @return
	 */
	public List<User> findAll();
	/**
	 * �û���¼
	 * @return
	 */
	public List<User> UserLogin(User user);
	
}
