package com.lovo.ioc.hibernate.service;

import com.lovo.ioc.hibernate.entity.UserEntity;

public interface IUserService {
   /**
    * �����û�
    * @param user
    */
	public void save(UserEntity user);
}
