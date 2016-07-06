/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Daylitransactions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idtransactions;
	private Date dateserver;
	private Date lastupdate;
	private long celnumsend;
	private long celnumreceive;
	private BigDecimal transferamount;
	private Integer idTransferState;
	private Long idPinsecurity;

	/**
	 * @return the idtransactions
	 */
	public long getIdtransactions() {
		return idtransactions;
	}

	/**
	 * @param idtransactions
	 *            the idtransactions to set
	 */
	public void setIdtransactions(long idtransactions) {
		this.idtransactions = idtransactions;
	}

	/**
	 * @return the dateserver
	 */
	public Date getDateserver() {
		return dateserver;
	}

	/**
	 * @param dateserver
	 *            the dateserver to set
	 */
	public void setDateserver(Date dateserver) {
		this.dateserver = dateserver;
	}

	/**
	 * @return the celnumsend
	 */
	public long getCelnumsend() {
		return celnumsend;
	}

	/**
	 * @param celnumsend
	 *            the celnumsend to set
	 */
	public void setCelnumsend(long celnumsend) {
		this.celnumsend = celnumsend;
	}

	/**
	 * @return the celnumreceive
	 */
	public long getCelnumreceive() {
		return celnumreceive;
	}

	/**
	 * @param celnumreceive
	 *            the celnumreceive to set
	 */
	public void setCelnumreceive(long celnumreceive) {
		this.celnumreceive = celnumreceive;
	}

	/**
	 * @return the transferamount
	 */
	public BigDecimal getTransferamount() {
		return transferamount;
	}

	/**
	 * @param transferamount
	 *            the transferamount to set
	 */
	public void setTransferamount(BigDecimal transferamount) {
		this.transferamount = transferamount;
	}

	/**
	 * @return the idTransferState
	 */
	public Integer getIdTransferState() {
		return idTransferState;
	}

	/**
	 * @param idTransferState
	 *            the idTransferState to set
	 */
	public void setIdTransferState(Integer idTransferState) {
		this.idTransferState = idTransferState;
	}

	/**
	 * @return the idPinsecurity
	 */
	public Long getIdPinsecurity() {
		return idPinsecurity;
	}

	/**
	 * @param idPinsecurity
	 *            the idPinsecurity to set
	 */
	public void setIdPinsecurity(Long idPinsecurity) {
		this.idPinsecurity = idPinsecurity;
	}

	/**
	 * @return the lastupdate
	 */
	public Date getLastupdate() {
		return lastupdate;
	}

	/**
	 * @param lastupdate the lastupdate to set
	 */
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

}
