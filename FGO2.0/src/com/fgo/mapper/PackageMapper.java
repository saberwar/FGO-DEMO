package com.fgo.mapper;

import java.util.List;

import com.fgo.model.Servers;
import com.fgo.model.User;

//�������ݿ��б����߼�
public interface PackageMapper {

	//�����û�id��ȡ���� 
	public List<Servers> gerServersList(User user);
}
