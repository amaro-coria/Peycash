package com.peycash.persistence.domain;

// Generated 03-sep-2014 12:17:34 by Hibernate Tools 3.6.0


/**
 * Roleuser generated by hbm2java
 */

public class Roleuser implements java.io.Serializable {

	private int idroleuser;
	private User user;
	private Role role;

	public Roleuser() {
	}

	public Roleuser(int idroleuser, User user, Role role) {
		this.idroleuser = idroleuser;
		this.user = user;
		this.role = role;
	}

	public int getIdroleuser() {
		return this.idroleuser;
	}

	public void setIdroleuser(int idroleuser) {
		this.idroleuser = idroleuser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
