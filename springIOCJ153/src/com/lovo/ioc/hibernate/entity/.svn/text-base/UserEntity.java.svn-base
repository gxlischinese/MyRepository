package com.lovo.ioc.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 实体
 * 
 * @author Administrator
 *
 */
@Entity // 标注为hibernate的实体，只有加了这个注解hibernate才会来管理
@Table(name = "t_user") // 这个实体要和数据库表进行映射，表名为t_user
public class UserEntity {

	// 只要加了@Entity注解的类就必须加一个@ID
	@Id // 该属性在数据库为主键
	@Column(name = "u_id", length = 32) // colum是对数据库字段的操作
    //1,自定义一个uuid策略，2，让hibernate执行我自定义的策略
	@GenericGenerator(name="myuuid",strategy="uuid")
	@GeneratedValue(generator="myuuid")
	private String userId;
	@Column(length = 24)
	private String userName;
	@Column(insertable=false)
	private String password;
    @Column(columnDefinition="text")
	private String message;
	private int age;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
