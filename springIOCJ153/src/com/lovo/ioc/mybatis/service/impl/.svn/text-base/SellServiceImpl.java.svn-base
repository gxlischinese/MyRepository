package com.lovo.ioc.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.ioc.mybatis.bean.SellBean;
import com.lovo.ioc.mybatis.dao.IRepertoryDao;
import com.lovo.ioc.mybatis.dao.ISellDao;
import com.lovo.ioc.mybatis.service.ISellService;
@Service("sellService")
public class SellServiceImpl implements ISellService{

	@Autowired
	ISellDao sellDao;
	@Autowired
	IRepertoryDao repertoryDao ;
	
	public void sell(SellBean sell) {
		//销售
		sellDao.sell(sell);
		//更新库存
		repertoryDao.updateRepertory(sell.getSellNum());
	}

}
