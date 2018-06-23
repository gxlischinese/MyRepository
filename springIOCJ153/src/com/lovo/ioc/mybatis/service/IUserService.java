package com.lovo.ioc.mybatis.service;

import java.util.List;

import com.lovo.ioc.mybatis.bean.UserBean;

public interface IUserService {

	public List<UserBean> getListUser();
}
