package com.lovo.ioc.db;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户数据类
 * @author Administrator
 *
 */
public class UserDB {

	private List<String> list;
	//构造方法初始化集合
	public UserDB(){
		list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
	}
	/**
	 * 
	 * @return 返回创建好的集合
	 */
	public List<String> findList(){
		return list;
	}
	
}
