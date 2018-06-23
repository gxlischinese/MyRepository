package com.lovo.ioc.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.lovo.ioc.hibernate.entity.UserEntity;

/**
 * 基础DAO
 * @author Administrator
 *
 */
@Repository(value="basicDao")
public class BasicDao {

     @Autowired
	private LocalSessionFactoryBean localSessionFactoryBean;
     
     //返回hibernate工厂
	public SessionFactory getSessionFactory(){
		return	localSessionFactoryBean.getObject();
	}
	
	public void sava(UserEntity user){
		//getCurrentSession spring管理的session
		this.getSessionFactory().getCurrentSession()
		.save(user);
	}
	
}
