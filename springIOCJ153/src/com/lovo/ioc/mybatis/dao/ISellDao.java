package com.lovo.ioc.mybatis.dao;

import com.lovo.ioc.mybatis.bean.SellBean;

/**
 * ����Dao
 * @author Administrator
 *
 */
public interface ISellDao {
   /**
    * ����
    * @param num ���۵�����
    * @return
    */
	public void sell(SellBean sell);
}
