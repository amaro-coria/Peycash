/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * Messagefactory generated by hbm2java
 */
public class Messagefactory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idmessagefactory;
	private Processingcode processingcode;
	private Messagestructure messagestructureByIdmessagestructurerevres;
	private Messagestructure messagestructureByIdmessagestructurerev;
	private Messagestructure messagestructureByIdmessagestructurereqres;
	private Messagestructure messagestructureByIdmessagestructurereq;

	public Messagefactory() {
	}

	public Messagefactory(long idmessagefactory, Processingcode processingcode,
			Messagestructure messagestructureByIdmessagestructurerevres,
			Messagestructure messagestructureByIdmessagestructurerev,
			Messagestructure messagestructureByIdmessagestructurereqres,
			Messagestructure messagestructureByIdmessagestructurereq) {
		this.idmessagefactory = idmessagefactory;
		this.processingcode = processingcode;
		this.messagestructureByIdmessagestructurerevres = messagestructureByIdmessagestructurerevres;
		this.messagestructureByIdmessagestructurerev = messagestructureByIdmessagestructurerev;
		this.messagestructureByIdmessagestructurereqres = messagestructureByIdmessagestructurereqres;
		this.messagestructureByIdmessagestructurereq = messagestructureByIdmessagestructurereq;
	}

	public long getIdmessagefactory() {
		return this.idmessagefactory;
	}

	public void setIdmessagefactory(long idmessagefactory) {
		this.idmessagefactory = idmessagefactory;
	}

	public Processingcode getProcessingcode() {
		return this.processingcode;
	}

	public void setProcessingcode(Processingcode processingcode) {
		this.processingcode = processingcode;
	}

	public Messagestructure getMessagestructureByIdmessagestructurerevres() {
		return this.messagestructureByIdmessagestructurerevres;
	}

	public void setMessagestructureByIdmessagestructurerevres(
			Messagestructure messagestructureByIdmessagestructurerevres) {
		this.messagestructureByIdmessagestructurerevres = messagestructureByIdmessagestructurerevres;
	}

	public Messagestructure getMessagestructureByIdmessagestructurerev() {
		return this.messagestructureByIdmessagestructurerev;
	}

	public void setMessagestructureByIdmessagestructurerev(
			Messagestructure messagestructureByIdmessagestructurerev) {
		this.messagestructureByIdmessagestructurerev = messagestructureByIdmessagestructurerev;
	}

	public Messagestructure getMessagestructureByIdmessagestructurereqres() {
		return this.messagestructureByIdmessagestructurereqres;
	}

	public void setMessagestructureByIdmessagestructurereqres(
			Messagestructure messagestructureByIdmessagestructurereqres) {
		this.messagestructureByIdmessagestructurereqres = messagestructureByIdmessagestructurereqres;
	}

	public Messagestructure getMessagestructureByIdmessagestructurereq() {
		return this.messagestructureByIdmessagestructurereq;
	}

	public void setMessagestructureByIdmessagestructurereq(
			Messagestructure messagestructureByIdmessagestructurereq) {
		this.messagestructureByIdmessagestructurereq = messagestructureByIdmessagestructurereq;
	}

}
