package com.lovo.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="persion")
public class Persion {
	
    @Autowired
	private DogNew dogNew;
    
    public void play(){
    	dogNew.eat();
    }
}
