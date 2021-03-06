/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Terminal generated by hbm2java
 */
public class Terminal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idterminal;
	private Partnershop partnershop;
	private short terminalid;
	private String serialnumber;
	private String ticketprinter;
	private short touch;
	private short internetconnection;
	private short barcodereader;
	private short cardreader;
	private BigDecimal miniumamount;
	private BigDecimal maximumamount;
	private Serializable datemodified;
	private String username;
	private short isactivied;

	public Terminal() {
	}

	public Terminal(int idterminal, Partnershop partnershop, short terminalid,
			String serialnumber, short touch, short internetconnection,
			short barcodereader, short cardreader, BigDecimal maximumamount,
			Serializable datemodified, String username) {
		this.idterminal = idterminal;
		this.partnershop = partnershop;
		this.terminalid = terminalid;
		this.serialnumber = serialnumber;
		this.touch = touch;
		this.internetconnection = internetconnection;
		this.barcodereader = barcodereader;
		this.cardreader = cardreader;
		this.maximumamount = maximumamount;
		this.datemodified = datemodified;
		this.username = username;
	}

	public Terminal(int idterminal, Partnershop partnershop, short terminalid,
			String serialnumber, String ticketprinter, short touch,
			short internetconnection, short barcodereader, short cardreader,
			BigDecimal miniumamount, BigDecimal maximumamount,
			Serializable datemodified, String username, short isactivied) {
		super();
		this.idterminal = idterminal;
		this.partnershop = partnershop;
		this.terminalid = terminalid;
		this.serialnumber = serialnumber;
		this.ticketprinter = ticketprinter;
		this.touch = touch;
		this.internetconnection = internetconnection;
		this.barcodereader = barcodereader;
		this.cardreader = cardreader;
		this.miniumamount = miniumamount;
		this.maximumamount = maximumamount;
		this.datemodified = datemodified;
		this.username = username;
		this.isactivied = isactivied;
	}

	public int getIdterminal() {
		return idterminal;
	}

	public void setIdterminal(int idterminal) {
		this.idterminal = idterminal;
	}

	public Partnershop getPartnershop() {
		return partnershop;
	}

	public void setPartnershop(Partnershop partnershop) {
		this.partnershop = partnershop;
	}

	public short getTerminalid() {
		return terminalid;
	}

	public void setTerminalid(short terminalid) {
		this.terminalid = terminalid;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getTicketprinter() {
		return ticketprinter;
	}

	public void setTicketprinter(String ticketprinter) {
		this.ticketprinter = ticketprinter;
	}

	public short getTouch() {
		return touch;
	}

	public void setTouch(short touch) {
		this.touch = touch;
	}

	public short getInternetconnection() {
		return internetconnection;
	}

	public void setInternetconnection(short internetconnection) {
		this.internetconnection = internetconnection;
	}

	public short getBarcodereader() {
		return barcodereader;
	}

	public void setBarcodereader(short barcodereader) {
		this.barcodereader = barcodereader;
	}

	public short getCardreader() {
		return cardreader;
	}

	public void setCardreader(short cardreader) {
		this.cardreader = cardreader;
	}

	public BigDecimal getMiniumamount() {
		return miniumamount;
	}

	public void setMiniumamount(BigDecimal miniumamount) {
		this.miniumamount = miniumamount;
	}

	public BigDecimal getMaximumamount() {
		return maximumamount;
	}

	public void setMaximumamount(BigDecimal maximumamount) {
		this.maximumamount = maximumamount;
	}

	public Serializable getDatemodified() {
		return datemodified;
	}

	public void setDatemodified(Serializable datemodified) {
		this.datemodified = datemodified;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public short getIsactivied() {
		return isactivied;
	}

	public void setIsactivied(short isactivied) {
		this.isactivied = isactivied;
	}

}