/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 3/06/2014 04:35:18 PM by Hibernate Tools 3.2.1.GA

/**
 * Tickettext generated by hbm2java
 */
public class Tickettext implements java.io.Serializable {

	private int idTtext;
	private String ttext;
	private Short tactive;

	public Tickettext() {
	}


	public Tickettext(int idTtext) {
		this.idTtext = idTtext;
	}

	public Tickettext(int idTtext, String ttext, Short tactive) {
		this.idTtext = idTtext;
		this.ttext = ttext;
		this.tactive = tactive;
	}

	public int getIdTtext() {
		return this.idTtext;
	}

	public void setIdTtext(int idTtext) {
		this.idTtext = idTtext;
	}

	public String getTtext() {
		return this.ttext;
	}

	public void setTtext(String ttext) {
		this.ttext = ttext;
	}

	public Short getTactive() {
		return this.tactive;
	}

	public void setTactive(Short tactive) {
		this.tactive = tactive;
	}

}
