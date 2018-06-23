package com.lovo.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="dogNew")
public class DogNew {


	@Autowired
	private Dog dog;
	
	public void eat(){
		System.out.println("С���Է�");
		System.out.println(dog.getDogName()+"�Է�");
	}
}
