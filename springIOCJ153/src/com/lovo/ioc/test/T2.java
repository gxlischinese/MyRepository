package com.lovo.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.bean.LC;

public class T2 {
	private ClassPathXmlApplicationContext app=null;
	   //在运行任何测试方法之前就要运行我
		@Before
		public void before(){
		 app=new ClassPathXmlApplicationContext("resouce/applicationList.xml");
		}
		
   @Test
   public void listTest(){
	   LC lc= (LC)app.getBean("lc");
	   lc.allCat();
   }
   @Test
   public void propTest(){
	   LC lc= (LC)app.getBean("lc");
	   lc.printMessage();
	   System.out.println(lc.getSex());
   }	
}
