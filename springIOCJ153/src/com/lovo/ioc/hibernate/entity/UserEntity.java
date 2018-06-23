package com.lovo.ioc.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * ʵ��
 * 
 * @author Administrator
 *
 */
@Entity // ��עΪhibernate��ʵ�壬ֻ�м������ע��hibernate�Ż�������
@Table(name = "t_user") // ���ʵ��Ҫ�����ݿ�����ӳ�䣬����Ϊt_user
public class UserEntity {

	// ֻҪ����@Entityע�����ͱ����һ��@ID
	@Id // �����������ݿ�Ϊ����
	@Column(name = "u_id", length = 32) // colum�Ƕ����ݿ��ֶεĲ���
    //1,�Զ���һ��uuid���ԣ�2����hibernateִ�����Զ���Ĳ���
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
