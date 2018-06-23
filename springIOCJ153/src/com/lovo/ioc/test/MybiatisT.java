package com.lovo.ioc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.lovo.ioc.mybatis.bean.SellBean;
import com.lovo.ioc.mybatis.bean.UserBean;
import com.lovo.ioc.mybatis.dao.IUserDao;
import com.lovo.ioc.mybatis.service.ISellService;
import com.lovo.ioc.mybatis.service.IUserService;
import com.lovo.ioc.mybatis.util.UUIDStr;


public class MybiatisT {
	private ClassPathXmlApplicationContext app=null;
	   //在运行任何测试方法之前就要运行我
		@Before
		public void before(){
			app=new ClassPathXmlApplicationContext("resouce/mybaits/mybaits.xml");
		}
		
		@Test
		public void datSouce(){
			DriverManagerDataSource dds=(DriverManagerDataSource)app.getBean("dataSource");
			try {
				Connection conn=		dds.getConnection();
				System.out.println(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Test
		public void factoryBean(){
			DefaultSqlSessionFactory sfb=(DefaultSqlSessionFactory)app.getBean("sqlSessionFactory");
		    System.out.println(sfb);
		}
		@Test
		public void findUserList(){
			IUserService users=	(IUserService)app.getBean("userService");
			
			List<UserBean> list=	users.getListUser();
			System.out.println(list.size());
			
		}
		@Test
		public void sell(){
			SellBean s=new SellBean();
			s.setSellId(UUIDStr.createUUID());
			s.setBuyName("笔记本");
			s.setSellNum(50);
			ISellService sell=	(ISellService)app.getBean("sellService");
			sell.sell(s);
			
		}
}
