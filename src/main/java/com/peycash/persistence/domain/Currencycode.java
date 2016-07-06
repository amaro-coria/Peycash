/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * Currencycode generated by hbm2java
 */
public class Currencycode implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idcurrencycode;
	private Domicilios domicilios;
	private String currency;
	private String description;

	public Currencycode() {
	}

	public Currencycode(long idcurrencycode, String currency) {
		this.idcurrencycode = idcurrencycode;
		this.currency = currency;
	}

	public Currencycode(long idcurrencycode, Domicilios domicilios,
			String currency, String description) {
		this.idcurrencycode = idcurrencycode;
		this.domicilios = domicilios;
		this.currency = currency;
		this.description = description;
	}

	public long getIdcurrencycode() {
		return this.idcurrencycode;
	}

	public void setIdcurrencycode(long idcurrencycode) {
		this.idcurrencycode = idcurrencycode;
	}

	public Domicilios getDomicilios() {
		return this.domicilios;
	}

	public void setDomicilios(Domicilios domicilios) {
		this.domicilios = domicilios;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
