package com.fgo.mapper;

import java.util.List;

import com.fgo.model.User;

public interface UserMapper {
//获取全部用户
	public List<User> findAllUser();
//用户登陆
	public List<User> UserLogin(User user);
}
