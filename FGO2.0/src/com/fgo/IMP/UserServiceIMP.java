package com.fgo.IMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgo.mapper.UserMapper;
import com.fgo.model.User;
import com.fgo.service.IUserService;
/**
 * 业务逻辑层实现子类
 * @author Administrator
 *
 */
@Service
public class UserServiceIMP implements IUserService {
	@Autowired
	private UserMapper usermapper;
	//查询所有用户
	@Override
	public List<User> findAll() {
	 
		return usermapper.findAllUser();
	}
	@Override
	public List<User> UserLogin(User user) {
		// 用户登录
		return usermapper.UserLogin(user);
	}

}
