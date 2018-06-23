package com.lovo.ioc.bean;

import java.util.List;
import java.util.Properties;



public class LC {
	private Properties pro;
	private String sex;
//持有猫集合
 private List<Cat> listCat;
  
   public void allCat(){
	   for(Cat c:listCat){
		   System.out.println(c.getCatName()+"年龄为"+c.getCatAge());
	   }
   }
   /**
    * 打印properties基本信息
    */
   public void printMessage(){
	   //根据key获得value
	String name=   pro.getProperty("userName");
	String age=   pro.getProperty("age");
	System.out.println(name+age);
   }
 
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public List<Cat> getListCat() {
	return listCat;
}

public void setListCat(List<Cat> listCat) {
	this.listCat = listCat;
}

public Properties getPro() {
	return pro;
}

public void setPro(Properties pro) {
	this.pro = pro;
}
 
 
}
