package com.lovo.ioc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lovo.ioc.bean.UserEntity;
import com.lovo.ioc.dao.IUserDao;
import com.lovo.ioc.db.DBBean;
import com.lovo.ioc.db.UserDB;

public class UserDaoImpl implements IUserDao {
     /**
      * 持有UserDB ，让spring给我们注入
      */
	private UserDB userdb;
	
	private DBBean dbBean;
	public List<String> findList() {
		
		return userdb.findList();
	}
	public UserDB getUserdb() {
		return userdb;
	}
	public void setUserdb(UserDB userdb) {
		this.userdb = userdb;
	}
	
	public List<UserEntity> findUserList() throws ClassNotFoundException, SQLException {
	     //创建一个容器
		List<UserEntity> list=new ArrayList<UserEntity>();
		//获得连接
		Connection conn=	dbBean.getConnection();
		String sql="select * from user";
		PreparedStatement pre=	conn.prepareStatement(sql);
	     ResultSet rs=	pre.executeQuery();
	     while(rs.next()){
	    	 //创建对象
	    	 UserEntity u=new UserEntity();
	    	 u.setuId(rs.getString("u_id"));
	    	 u.setuName(rs.getString("uName"));
	    	 //把对象放入到集合
	    	 list.add(u);
	     }
		return list;
	}
	public DBBean getDbBean() {
		return dbBean;
	}
	public void setDbBean(DBBean dbBean) {
		this.dbBean = dbBean;
	}
	@Override
	public void updateUser() throws Exception, SQLException {
		//获得连接
		
				Connection conn=	dbBean.getConnection();
				conn.setAutoCommit(false);//关闭自动提交事务
		String sql="update user set uname='xx'";
		PreparedStatement pre=	conn.prepareStatement(sql);
		int i=pre.executeUpdate();
		System.out.println(i);
		conn.commit();
		conn.close();
	}

	
}
