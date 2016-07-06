/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 5/06/2014 05:56:49 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Txdetails generated by hbm2java
 */
public class Txdetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idTx;
	private Transactions transactions;
	private Transactiondetail transactiondetail;
	private Date dateInserted;

	public Txdetails() {
	}

	public Txdetails(long idTx, Date dateInserted) {
		this.idTx = idTx;
		this.dateInserted = dateInserted;
	}

	public Txdetails(long idTx, Transactions transactions,
			Transactiondetail transactiondetail, Date dateInserted) {
		this.idTx = idTx;
		this.transactions = transactions;
		this.transactiondetail = transactiondetail;
		this.dateInserted = dateInserted;
	}

  
	public long getIdTx() {
		return this.idTx;
	}

	public void setIdTx(long idTx) {
		this.idTx = idTx;
	}

	public Transactions getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

	public Transactiondetail getTransactiondetail() {
		return this.transactiondetail;
	}

	public void setTransactiondetail(Transactiondetail transactiondetail) {
		this.transactiondetail = transactiondetail;
	}

	public Date getDateInserted() {
		return this.dateInserted;
	}

	public void setDateInserted(Date dateInserted) {
		this.dateInserted = dateInserted;
	}

}
