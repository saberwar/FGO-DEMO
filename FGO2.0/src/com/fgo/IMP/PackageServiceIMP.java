package com.fgo.IMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgo.mapper.PackageMapper;
import com.fgo.model.Servers;
import com.fgo.model.User;
import com.fgo.service.IPackService;
@Service
public class PackageServiceIMP implements IPackService {
	@Autowired
	private PackageMapper packagemapper;
	@Override
	public List<User> findall() {
		//≤‚ ‘±£¡Ù∑Ω∑®
		return null;
	}

	@Override
	public List<Servers> findServersByUserID(User user) {
		
		return packagemapper.gerServersList(user);
	}

}
