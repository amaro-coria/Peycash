/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * Pechangehistory generated by hbm2java
 */
public class Pechangehistory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idchangehistory;
	private String peVersion;
	private Peservices peservices;
	private Boolean changeuser;
	private String authorizationuser;
	private String changereason;
	private String pecomment;
	private Serializable datemodified;
	private boolean isactive;

	public Pechangehistory() {
	}

	public Pechangehistory(long idchangehistory, Peservices peservices,
			boolean isactive) {
		this.idchangehistory = idchangehistory;
		this.peservices = peservices;
		this.isactive = isactive;
	}

	public Pechangehistory(long idchangehistory, Peservices peservices,
			Boolean changeuser, String authorizationuser, String changereason,
			String pecomment, Serializable datemodified, boolean isactive) {
		this.idchangehistory = idchangehistory;
		this.peservices = peservices;
		this.changeuser = changeuser;
		this.authorizationuser = authorizationuser;
		this.changereason = changereason;
		this.pecomment = pecomment;
		this.datemodified = datemodified;
		this.isactive = isactive;
	}

	public long getIdchangehistory() {
		return this.idchangehistory;
	}

	public void setIdchangehistory(long idchangehistory) {
		this.idchangehistory = idchangehistory;
	}

	public String getPeVersion() {
		return this.peVersion;
	}

	public void setPeVersion(String peVersion) {
		this.peVersion = peVersion;
	}

	public Peservices getPeservices() {
		return this.peservices;
	}

	public void setPeservices(Peservices peservices) {
		this.peservices = peservices;
	}

	public Boolean getChangeuser() {
		return this.changeuser;
	}

	public void setChangeuser(Boolean changeuser) {
		this.changeuser = changeuser;
	}

	public String getAuthorizationuser() {
		return this.authorizationuser;
	}

	public void setAuthorizationuser(String authorizationuser) {
		this.authorizationuser = authorizationuser;
	}

	public String getChangereason() {
		return this.changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public String getPecomment() {
		return this.pecomment;
	}

	public void setPecomment(String pecomment) {
		this.pecomment = pecomment;
	}

	public Serializable getDatemodified() {
		return this.datemodified;
	}

	public void setDatemodified(Serializable datemodified) {
		this.datemodified = datemodified;
	}

	public boolean isIsactive() {
		return this.isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

}
