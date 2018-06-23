package com.lovo.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.ioc.bean.Cat;
import com.lovo.ioc.bean.QianJiang;
import com.lovo.ioc.service.IUserService;
import com.lovo.ioc.service.impl.UserServiceImpl;

public class T {
	private ClassPathXmlApplicationContext app=null;
   //在运行任何测试方法之前就要运行我
	@Before
	public void before(){
		app=new ClassPathXmlApplicationContext("resouce/applicationJ153.xml");
	}
	@Test
	public void qianjiangPlay(){
		//实例化一只小花猫
		Cat c=new Cat();
		c.setCatAge(5);
		c.setCatName("小花");
		//实例化钱江
		QianJiang qj=new QianJiang();
		qj.setName("钱江");
		qj.setCat(c);
		qj.play("鱼");
	}

	@Test
	public void qianjiangPlaySpring(){

		//根据ID获取spring给我们创建好的对象
	Cat cat=	(Cat)app.getBean("cat");
	//Cat cat=new Cat();
	cat.setCatName("小王");
		cat.eat("鱼");
	}
	/**
	 * 对象之间的关联
	 */
	@Test
	public void objcetDI(){
		
				//根据ID获取spring给我们创建好的对象
			QianJiang qj=	(QianJiang)app.getBean("qianjiang");
			qj.play("鱼");
	}
	
	@Test
	public void user(){
		
		IUserService s=(IUserService)app.getBean("userService");
	System.out.println(s.findUser("z"));
	}
}
