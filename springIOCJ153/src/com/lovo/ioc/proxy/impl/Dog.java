package com.lovo.ioc.proxy.impl;

import org.springframework.stereotype.Component;

import com.lovo.ioc.proxy.IDog;
@Component
public class Dog implements IDog{

	public void eat(){
		
		System.out.println("¿Ð¹ÇÍ·");
	}
}
