package com.lovo.ioc.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.ioc.mybatis.bean.UserBean;
import com.lovo.ioc.mybatis.dao.IUserDao;
import com.lovo.ioc.mybatis.service.IUserService;

@Service(value="userService")
public class UserServiceImpl implements IUserService {

   @Autowired
   private IUserDao userDao;
   
	public List<UserBean> getListUser() {
		
		return userDao.getListUser();
	}



}
