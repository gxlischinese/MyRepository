package com.lovo.ioc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.hibernate.BasicDao;
import com.lovo.ioc.hibernate.entity.UserEntity;
import com.lovo.ioc.hibernate.service.IUserService;

public class HibernateT {
	private ClassPathXmlApplicationContext app = null;

	// 在运行任何测试方法之前就要运行我
	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("resouce/hibernate/hibernate-spring.xml");
	}

	@Test
	public void factory() {
		BasicDao dao = (BasicDao) app.getBean("basicDao");
		System.out.println(dao.getSessionFactory());
	}

	@Test
	public void savaUser() {
		BasicDao dao = (BasicDao) app.getBean("basicDao");
		SessionFactory sf = dao.getSessionFactory();// 获得工厂
		Session s = sf.openSession();// 获得session
		Transaction tx = s.getTransaction();
		tx.begin();
		UserEntity u = new UserEntity();
		u.setAge(20);
		s.save(u);
		tx.commit();
		s.close();
	}

	@Test
	public void savaUser2() {
		IUserService s = (IUserService) app.getBean("userService");

		UserEntity u = new UserEntity();
		u.setAge(202);
		s.save(u);
	}
}
