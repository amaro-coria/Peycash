/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Transactiondetail generated by hbm2java
 */
public class Transactiondetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idtransactiondetail;
	private Processingcode processingcode;
	private Messagetype messagetype;
	private BigDecimal amounttrx;
	private int auditnumber;
	private short posentrymode;
	private String referencenumber;
	private long uniqueidtransaction;
	private short reversedtransaction;
	private short responsereverse;
	private String terminalid;
	private int storeid;
	private int companyid;
	private String authorizationresponse;
	private String responsecode;
	private String currencycode;
	private String pindata;
	private String structuresdata;
	private Set<Txdetails> txdetailses = new HashSet<Txdetails>(0);
	private Date serverdate;
	private Date lastupdate;

	public Transactiondetail() {
	}

	public Transactiondetail(long idtransactiondetail,
			Processingcode processingcode, Messagetype messagetype,
			BigDecimal amounttrx, int auditnumber, short posentrymode,
			long uniqueidtransaction, short reversedtransaction,
			short responsereverse, String terminalid, int storeid,
			int companyid, String responsecode, String currencycode,
			String structuresdata) {
		this.idtransactiondetail = idtransactiondetail;
		this.processingcode = processingcode;
		this.messagetype = messagetype;
		this.amounttrx = amounttrx;
		this.auditnumber = auditnumber;
		this.posentrymode = posentrymode;
		this.uniqueidtransaction = uniqueidtransaction;
		this.reversedtransaction = reversedtransaction;
		this.responsereverse = responsereverse;
		this.terminalid = terminalid;
		this.storeid = storeid;
		this.companyid = companyid;
		this.responsecode = responsecode;
		this.currencycode = currencycode;
		this.structuresdata = structuresdata;
	}

	public Transactiondetail(long idtransactiondetail,
			Processingcode processingcode, Messagetype messagetype,
			BigDecimal amounttrx, int auditnumber, short posentrymode,
			String referencenumber, long uniqueidtransaction,
			short reversedtransaction, short responsereverse,
			String terminalid, int storeid, int companyid,
			String authorizationresponse, String responsecode,
			String currencycode, String pindata, String structuresdata) {
		this.idtransactiondetail = idtransactiondetail;
		this.processingcode = processingcode;
		this.messagetype = messagetype;
		this.amounttrx = amounttrx;
		this.auditnumber = auditnumber;
		this.posentrymode = posentrymode;
		this.referencenumber = referencenumber;
		this.uniqueidtransaction = uniqueidtransaction;
		this.reversedtransaction = reversedtransaction;
		this.responsereverse = responsereverse;
		this.terminalid = terminalid;
		this.storeid = storeid;
		this.companyid = companyid;
		this.authorizationresponse = authorizationresponse;
		this.responsecode = responsecode;
		this.currencycode = currencycode;
		this.pindata = pindata;
		this.structuresdata = structuresdata;
	}

	public long getIdtransactiondetail() {
		return this.idtransactiondetail;
	}

	public void setIdtransactiondetail(long idtransactiondetail) {
		this.idtransactiondetail = idtransactiondetail;
	}

	public Processingcode getProcessingcode() {
		return this.processingcode;
	}

	public void setProcessingcode(Processingcode processingcode) {
		this.processingcode = processingcode;
	}

	public Messagetype getMessagetype() {
		return this.messagetype;
	}

	public void setMessagetype(Messagetype messagetype) {
		this.messagetype = messagetype;
	}

	public BigDecimal getAmounttrx() {
		return this.amounttrx;
	}

	public void setAmounttrx(BigDecimal amounttrx) {
		this.amounttrx = amounttrx;
	}

	public int getAuditnumber() {
		return this.auditnumber;
	}

	public void setAuditnumber(int auditnumber) {
		this.auditnumber = auditnumber;
	}

	public short getPosentrymode() {
		return this.posentrymode;
	}

	public void setPosentrymode(short posentrymode) {
		this.posentrymode = posentrymode;
	}

	public String getReferencenumber() {
		return this.referencenumber;
	}

	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}

	public long getUniqueidtransaction() {
		return this.uniqueidtransaction;
	}

	public void setUniqueidtransaction(long uniqueidtransaction) {
		this.uniqueidtransaction = uniqueidtransaction;
	}

	public short isReversedtransaction() {
		return this.reversedtransaction;
	}

	public void setReversedtransaction(short reversedtransaction) {
		this.reversedtransaction = reversedtransaction;
	}

	public short getResponsereverse() {
		return this.responsereverse;
	}

	public void setResponsereverse(short responsereverse) {
		this.responsereverse = responsereverse;
	}

	public String getTerminalid() {
		return this.terminalid;
	}

	public void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}

	public int getStoreid() {
		return this.storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public int getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getAuthorizationresponse() {
		return this.authorizationresponse;
	}

	public void setAuthorizationresponse(String authorizationresponse) {
		this.authorizationresponse = authorizationresponse;
	}

	public String getResponsecode() {
		return this.responsecode;
	}

	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}

	public String getCurrencycode() {
		return this.currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getPindata() {
		return this.pindata;
	}

	public void setPindata(String pindata) {
		this.pindata = pindata;
	}

	public String getStructuresdata() {
		return this.structuresdata;
	}

	public void setStructuresdata(String structuresdata) {
		this.structuresdata = structuresdata;
	}

	/**
	 * @return the txdetailses
	 */
	public Set<Txdetails> getTxdetailses() {
		return txdetailses;
	}

	/**
	 * @param txdetailses
	 *            the txdetailses to set
	 */
	public void setTxdetailses(Set<Txdetails> txdetailses) {
		this.txdetailses = txdetailses;
	}

	/**
	 * @return the reversedtransaction
	 */
	public short getReversedtransaction() {
		return reversedtransaction;
	}

	/**
	 * @return the serverdate
	 */
	public Date getServerdate() {
		return serverdate;
	}

	/**
	 * @param serverdate
	 *            the serverdate to set
	 */
	public void setServerdate(Date serverdate) {
		this.serverdate = serverdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transactiondetail [idtransactiondetail=" + idtransactiondetail
				+ ", amounttrx=" + amounttrx + ", auditnumber=" + auditnumber
				+ ", posentrymode=" + posentrymode + ", referencenumber="
				+ referencenumber + ", uniqueidtransaction="
				+ uniqueidtransaction + ", reversedtransaction="
				+ reversedtransaction + ", responsereverse=" + responsereverse
				+ ", terminalid=" + terminalid + ", storeid=" + storeid
				+ ", companyid=" + companyid + ", authorizationresponse="
				+ authorizationresponse + ", responsecode=" + responsecode
				+ ", currencycode=" + currencycode + ", pindata=" + pindata
				+ ", structuresdata=" + structuresdata + ", serverdate="
				+ serverdate + "]";
	}

	/**
	 * @return the lastupdate
	 */
	public Date getLastupdate() {
		return lastupdate;
	}

	/**
	 * @param lastupdate
	 *            the lastupdate to set
	 */
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

}