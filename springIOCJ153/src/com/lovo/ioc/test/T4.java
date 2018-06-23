package com.lovo.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.bean.Persion;

public class T4 {
	private ClassPathXmlApplicationContext app=null;
	   //在运行任何测试方法之前就要运行我
		@Before
		public void before(){
		 app=new ClassPathXmlApplicationContext("resouce/dog.xml");
		}
		@Test
		public void test(){
		Persion p=	(Persion)app.getBean("persion");
		p.play();
		}
}
