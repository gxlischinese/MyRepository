package com.lovo.ioc.mybatis.dao;

import com.lovo.ioc.mybatis.bean.SellBean;

/**
 * 销售Dao
 * @author Administrator
 *
 */
public interface ISellDao {
   /**
    * 销售
    * @param num 销售的数量
    * @return
    */
	public void sell(SellBean sell);
}
