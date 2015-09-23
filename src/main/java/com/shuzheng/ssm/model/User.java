package com.shuzheng.ssm.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * 用户
 * 
 * @author shuzheng
 * 
 */
public class User {

	private Integer id;
	@NotEmpty(message = "帐号不能为空")
	@Size(min = 6, max = 20, message = "帐号必须在6~20位之间")
	private String username;
	@NotEmpty(message = "密码不能为空")
	@Size(min = 6, max = 20, message = "密码必须在6~20位之间")
	private String password;
	@NotEmpty(message = "昵称不能为空")
	@Size(min = 6, max = 20, message = "昵称必须在6~20位之间")
	private String nickname;
	private Integer sex;
	private Long ctime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Long getCtime() {
		return ctime;
	}

	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}
	
	public Date getCtime_date() {
		return new Date(ctime);
	}

}