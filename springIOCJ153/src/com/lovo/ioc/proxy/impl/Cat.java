package com.lovo.ioc.proxy.impl;

import org.springframework.stereotype.Component;

import com.lovo.ioc.proxy.ICat;
@Component
public class Cat implements ICat{


	public void play() {
		System.out.println("��ë����");
		
	}

	@Override
	public void eat() {
		System.out.println("è����");
		
	}

}
