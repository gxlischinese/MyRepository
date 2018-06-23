package com.lovo.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.bean.Persion;
import com.lovo.ioc.proxy.ICat;

public class T5 {
	private ClassPathXmlApplicationContext app=null;
	   //在运行任何测试方法之前就要运行我
		@Before
		public void before(){
			
		 app=new ClassPathXmlApplicationContext("resouce/proxy.xml");
		}
		@Test
		public void test(){
			ICat p=	(ICat)app.getBean("cat");
		p.play();
		}
}
