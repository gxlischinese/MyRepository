package com.lovo.ioc.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 把此类作为切面
 * @author Administrator
 *
 */
public class MessageAspectXML {
   
	public void printMessage(JoinPoint join){
	String className=	join.getTarget().toString();
		System.out.println(className+"我已经切入到你的方法");
	}

	public void printMessage2(JoinPoint join){
	String className=	join.getTarget().toString();
		System.out.println(className+"我已经切入到你的方法2");
	}
	
}
