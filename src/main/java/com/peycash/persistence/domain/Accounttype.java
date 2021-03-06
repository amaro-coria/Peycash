/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Accounttype generated by hbm2java
 */
public class Accounttype implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idaccounttype;
	private String account;
	private String description;
	private Set<Processingcode> processingcodesForIdaccounttypefrom = new HashSet<Processingcode>(
			0);
	private Set<Processingcode> processingcodesForIdaccounttypeto = new HashSet<Processingcode>(
			0);

	public Accounttype() {
	}

	public Accounttype(long idaccounttype, String account) {
		this.idaccounttype = idaccounttype;
		this.account = account;
	}

	public Accounttype(long idaccounttype, String account, String description,
			Set<Processingcode> processingcodesForIdaccounttypefrom,
			Set<Processingcode> processingcodesForIdaccounttypeto) {
		this.idaccounttype = idaccounttype;
		this.account = account;
		this.description = description;
		this.processingcodesForIdaccounttypefrom = processingcodesForIdaccounttypefrom;
		this.processingcodesForIdaccounttypeto = processingcodesForIdaccounttypeto;
	}

	public long getIdaccounttype() {
		return this.idaccounttype;
	}

	public void setIdaccounttype(long idaccounttype) {
		this.idaccounttype = idaccounttype;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Processingcode> getProcessingcodesForIdaccounttypefrom() {
		return this.processingcodesForIdaccounttypefrom;
	}

	public void setProcessingcodesForIdaccounttypefrom(
			Set<Processingcode> processingcodesForIdaccounttypefrom) {
		this.processingcodesForIdaccounttypefrom = processingcodesForIdaccounttypefrom;
	}

	public Set<Processingcode> getProcessingcodesForIdaccounttypeto() {
		return this.processingcodesForIdaccounttypeto;
	}

	public void setProcessingcodesForIdaccounttypeto(
			Set<Processingcode> processingcodesForIdaccounttypeto) {
		this.processingcodesForIdaccounttypeto = processingcodesForIdaccounttypeto;
	}

}
