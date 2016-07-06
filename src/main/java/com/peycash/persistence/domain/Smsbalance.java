/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Smsbalance generated by hbm2java
 */
public class Smsbalance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idsmsbalance;
	private Smsprovider smsprovider;
	private int smstotal;
	private int smsavaible;
	private short smserror;
	private Date rechargedate;
	private Date expirationdate;
	private String authorizationcode;

	public Smsbalance() {
	}

	public Smsbalance(int idsmsbalance, Smsprovider smsprovider, int smstotal,
			int smsavaible, short smserror, Date expirationdate,
			String authorizationcode) {
		this.idsmsbalance = idsmsbalance;
		this.smsprovider = smsprovider;
		this.smstotal = smstotal;
		this.smsavaible = smsavaible;
		this.smserror = smserror;
		this.expirationdate = expirationdate;
		this.authorizationcode = authorizationcode;
	}

	public Smsbalance(int idsmsbalance, Smsprovider smsprovider, int smstotal,
			int smsavaible, short smserror, Date rechargedate,
			Date expirationdate, String authorizationcode) {
		this.idsmsbalance = idsmsbalance;
		this.smsprovider = smsprovider;
		this.smstotal = smstotal;
		this.smsavaible = smsavaible;
		this.smserror = smserror;
		this.rechargedate = rechargedate;
		this.expirationdate = expirationdate;
		this.authorizationcode = authorizationcode;
	}

	public int getIdsmsbalance() {
		return this.idsmsbalance;
	}

	public void setIdsmsbalance(int idsmsbalance) {
		this.idsmsbalance = idsmsbalance;
	}

	public Smsprovider getSmsprovider() {
		return this.smsprovider;
	}

	public void setSmsprovider(Smsprovider smsprovider) {
		this.smsprovider = smsprovider;
	}

	public int getSmstotal() {
		return this.smstotal;
	}

	public void setSmstotal(int smstotal) {
		this.smstotal = smstotal;
	}

	public int getSmsavaible() {
		return this.smsavaible;
	}

	public void setSmsavaible(int smsavaible) {
		this.smsavaible = smsavaible;
	}

	public short isSmserror() {
		return this.smserror;
	}

	public void setSmserror(short smserror) {
		this.smserror = smserror;
	}

	public Date getRechargedate() {
		return this.rechargedate;
	}

	public void setRechargedate(Date rechargedate) {
		this.rechargedate = rechargedate;
	}

	public Date getExpirationdate() {
		return this.expirationdate;
	}

	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	}

	public String getAuthorizationcode() {
		return this.authorizationcode;
	}

	public void setAuthorizationcode(String authorizationcode) {
		this.authorizationcode = authorizationcode;
	}

}
