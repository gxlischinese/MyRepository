package com.lovo.ioc.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.ioc.hibernate.BasicDao;
import com.lovo.ioc.hibernate.entity.UserEntity;
import com.lovo.ioc.hibernate.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private BasicDao basicDao;
	public void save(UserEntity user) {
		basicDao.sava(user);
		
	}

}
