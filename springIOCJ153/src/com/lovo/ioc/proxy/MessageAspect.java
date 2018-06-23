package com.lovo.ioc.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect  //切面
public class MessageAspect {
    //定义一个切点
	@Pointcut("execution(* com.lovo.ioc.proxy.*.*(..))")
	public void mypointcut(){};
	//自定义一个通知方法
	//@Before---表名这个通知为前置通知
	//通知括号里面的字符串是切点——把通知放到哪个类的那个方法里
	//JoinPoint join 连接点可以获得被代理对象的信息
//	@Before("mypointcut()")
//	public void printMessage(JoinPoint join){
//	String className=	join.getTarget().toString();
//		System.out.println(className+"我已经切入到你的方法");
//	}
//	@After("mypointcut()")
//	public void printMessageAfter(JoinPoint join){
//		
//	String className=	join.getTarget().toString();
//		System.out.println(className+"我已出方法");
//	}
	@Around("mypointcut()")
	public void roundMessage(ProceedingJoinPoint jp){
		System.out.println("执行之前");
		try {
			//jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("执行之后");
	}
}
