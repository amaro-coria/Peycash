/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * Posentrymode generated by hbm2java
 */
public class Posentrymode implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idposentrymode;
	private Panentrymode panentrymode;
	private Pinentrycapability pinentrycapability;

	public Posentrymode() {
	}

	public Posentrymode(long idposentrymode, Panentrymode panentrymode,
			Pinentrycapability pinentrycapability) {
		this.idposentrymode = idposentrymode;
		this.panentrymode = panentrymode;
		this.pinentrycapability = pinentrycapability;
	}

	public long getIdposentrymode() {
		return this.idposentrymode;
	}

	public void setIdposentrymode(long idposentrymode) {
		this.idposentrymode = idposentrymode;
	}

	public Panentrymode getPanentrymode() {
		return this.panentrymode;
	}

	public void setPanentrymode(Panentrymode panentrymode) {
		this.panentrymode = panentrymode;
	}

	public Pinentrycapability getPinentrycapability() {
		return this.pinentrycapability;
	}

	public void setPinentrycapability(Pinentrycapability pinentrycapability) {
		this.pinentrycapability = pinentrycapability;
	}

}
