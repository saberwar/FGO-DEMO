package com.fgo.mapper;

import java.util.List;

import com.fgo.model.User;

public interface UserMapper {
//��ȡȫ���û�
	public List<User> findAllUser();
//�û���½
	public List<User> UserLogin(User user);
}
