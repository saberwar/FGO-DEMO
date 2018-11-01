package com.fgo.service;

import java.util.List;

import com.fgo.model.User;

public interface IUserService {
	/**
	 * 查询用户全部信息
	 * @return
	 */
	public List<User> findAll();
	/**
	 * 用户登录
	 * @return
	 */
	public List<User> UserLogin(User user);
	
}
