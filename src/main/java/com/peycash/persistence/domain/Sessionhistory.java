/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * Sessionhistory generated by hbm2java
 */
public class Sessionhistory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idsessionhistory;
	private long iduseraccount;
	private Serializable dateserver;
	private Serializable checkin;
	private Serializable checkout;
	private String source;

	public Sessionhistory() {
	}

	public Sessionhistory(long idsessionhistory, long iduseraccount,
			Serializable dateserver, Serializable checkin, String source) {
		this.idsessionhistory = idsessionhistory;
		this.iduseraccount = iduseraccount;
		this.dateserver = dateserver;
		this.checkin = checkin;
		this.source = source;
	}

	public Sessionhistory(long idsessionhistory, long iduseraccount,
			Serializable dateserver, Serializable checkin,
			Serializable checkout, String source) {
		this.idsessionhistory = idsessionhistory;
		this.iduseraccount = iduseraccount;
		this.dateserver = dateserver;
		this.checkin = checkin;
		this.checkout = checkout;
		this.source = source;
	}

	public long getIdsessionhistory() {
		return this.idsessionhistory;
	}

	public void setIdsessionhistory(long idsessionhistory) {
		this.idsessionhistory = idsessionhistory;
	}

	public long getIduseraccount() {
		return this.iduseraccount;
	}

	public void setIduseraccount(long iduseraccount) {
		this.iduseraccount = iduseraccount;
	}

	public Serializable getDateserver() {
		return this.dateserver;
	}

	public void setDateserver(Serializable dateserver) {
		this.dateserver = dateserver;
	}

	public Serializable getCheckin() {
		return this.checkin;
	}

	public void setCheckin(Serializable checkin) {
		this.checkin = checkin;
	}

	public Serializable getCheckout() {
		return this.checkout;
	}

	public void setCheckout(Serializable checkout) {
		this.checkout = checkout;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
