package com.lovo.ioc.dao;

import java.sql.SQLException;
import java.util.List;

import com.lovo.ioc.bean.UserEntity;

public interface IUserDao {
     /**
      * 
      * @return 需要的集合
      */
	public List<String> findList();
	/**
	 * 获得用户集合
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<UserEntity> findUserList() throws ClassNotFoundException, SQLException;
   /**
    * 修改
 * @throws SQLException 
 * @throws Exception 
    */
	public void updateUser() throws Exception, SQLException;
}
