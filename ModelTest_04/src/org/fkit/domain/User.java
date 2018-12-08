package org.fkit.domain;

public class User {

	private String username;
	private String loginname;
	
	private String password;
	
	
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String toString() {
		return "username:"+username+"   loginname:"+loginname+"  password:" +password;
	}
	
}
