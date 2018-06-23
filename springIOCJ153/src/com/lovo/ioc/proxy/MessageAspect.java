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
@Aspect  //����
public class MessageAspect {
    //����һ���е�
	@Pointcut("execution(* com.lovo.ioc.proxy.*.*(..))")
	public void mypointcut(){};
	//�Զ���һ��֪ͨ����
	//@Before---�������֪ͨΪǰ��֪ͨ
	//֪ͨ����������ַ������е㡪����֪ͨ�ŵ��ĸ�����Ǹ�������
	//JoinPoint join ���ӵ���Ի�ñ�����������Ϣ
//	@Before("mypointcut()")
//	public void printMessage(JoinPoint join){
//	String className=	join.getTarget().toString();
//		System.out.println(className+"���Ѿ����뵽��ķ���");
//	}
//	@After("mypointcut()")
//	public void printMessageAfter(JoinPoint join){
//		
//	String className=	join.getTarget().toString();
//		System.out.println(className+"���ѳ�����");
//	}
	@Around("mypointcut()")
	public void roundMessage(ProceedingJoinPoint jp){
		System.out.println("ִ��֮ǰ");
		try {
			//jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ִ��֮��");
	}
}
