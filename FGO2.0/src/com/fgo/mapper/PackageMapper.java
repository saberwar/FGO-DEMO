package com.fgo.mapper;

import java.util.List;

import com.fgo.model.Servers;
import com.fgo.model.User;

//处理数据库中背包逻辑
public interface PackageMapper {

	//根据用户id获取从者 
	public List<Servers> gerServersList(User user);
}
