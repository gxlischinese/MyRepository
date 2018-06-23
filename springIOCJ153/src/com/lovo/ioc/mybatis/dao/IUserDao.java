package com.lovo.ioc.mybatis.dao;

import java.util.List;

import com.lovo.ioc.mybatis.bean.UserBean;

public interface IUserDao {
    
	public List<UserBean> getListUser();
}
