package com.lovo.ioc.service.impl;

import java.util.List;

import com.lovo.ioc.dao.IUserDao;
import com.lovo.ioc.service.IUserService;

public class UserServiceImpl implements IUserService {

    //����DAO
	private IUserDao userDao;
	
	public boolean findUser(String userName) {
		boolean bl=false;
		//����û�����
	List<String> list=	userDao.findList();
	//�ж��û��Ƿ���ڣ����ڷ���������
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
