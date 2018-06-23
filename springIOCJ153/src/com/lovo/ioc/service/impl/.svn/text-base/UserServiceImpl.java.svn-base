package com.lovo.ioc.service.impl;

import java.util.List;

import com.lovo.ioc.dao.IUserDao;
import com.lovo.ioc.service.IUserService;

public class UserServiceImpl implements IUserService {

    //持有DAO
	private IUserDao userDao;
	
	public boolean findUser(String userName) {
		boolean bl=false;
		//获得用户集合
	List<String> list=	userDao.findList();
	//判断用户是否存在，存在返回真跳出
	for(String str:list){
		if(str.equals(userName)){
			bl=true;
			break;
		}
	}
		return bl;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	
}
