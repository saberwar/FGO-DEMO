package com.fgo.IMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgo.mapper.UserMapper;
import com.fgo.model.User;
import com.fgo.service.IUserService;
/**
 * ҵ���߼���ʵ������
 * @author Administrator
 *
 */
@Service
public class UserServiceIMP implements IUserService {
	@Autowired
	private UserMapper usermapper;
	//��ѯ�����û�
	@Override
	public List<User> findAll() {
	 
		return usermapper.findAllUser();
	}
	@Override
	public List<User> UserLogin(User user) {
		// �û���¼
		return usermapper.UserLogin(user);
	}

}
