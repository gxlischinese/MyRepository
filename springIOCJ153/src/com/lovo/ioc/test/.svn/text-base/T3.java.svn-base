package com.lovo.ioc.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.bean.UserEntity;
import com.lovo.ioc.dao.IUserDao;

public class T3 {
	private ClassPathXmlApplicationContext app=null;
	   //在运行任何测试方法之前就要运行我
		@Before
		public void before(){
		 app=new ClassPathXmlApplicationContext("resouce/jdbc.xml");
		}
		@Test
		public void testuser(){
		IUserDao ud=	(IUserDao)app.getBean("userDao");
		System.out.println(ud);
		IUserDao ud2=	(IUserDao)app.getBean("userDao");
		System.out.println(ud2);
//		try {
//			 List<UserEntity> list=	ud.findUserList();
//			 for(UserEntity u:list){
//				 System.out.println(u.getuName()+u.getuId());
//			 }
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
		
		@Test
		public void updateUser(){
			IUserDao dao=	(IUserDao)app.getBean("userDao");
			try {
				dao.updateUser();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
