package com.lovo.ioc.mybatis.util;

import java.util.UUID;

public class UUIDStr {

	public static String createUUID(){
		//随机生成一个UUID
	String uuid=	UUID.randomUUID().toString();
	//替换掉-
	uuid=uuid.replaceAll("-","");
		return uuid;
	}
	public static void main(String[] args) {
		System.out.println(UUIDStr.createUUID());
	}
}
