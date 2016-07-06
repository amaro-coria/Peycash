/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * Smsconfig generated by hbm2java
 */
public class Smsconfig implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idsmsconfig;
	private Smsprovider smsprovider;
	private Smsconnectiontype smsconnectiontype;
	private String url;
	private String ip;
	private String port;
	private boolean logactivated;
	private String logpath;
	private boolean eventactivated;
	private String eventpath;

	public Smsconfig() {
	}

	public Smsconfig(long idsmsconfig, Smsprovider smsprovider,
			Smsconnectiontype smsconnectiontype, String url, String ip,
			String port, boolean logactivated, boolean eventactivated) {
		this.idsmsconfig = idsmsconfig;
		this.smsprovider = smsprovider;
		this.smsconnectiontype = smsconnectiontype;
		this.url = url;
		this.ip = ip;
		this.port = port;
		this.logactivated = logactivated;
		this.eventactivated = eventactivated;
	}

	public Smsconfig(long idsmsconfig, Smsprovider smsprovider,
			Smsconnectiontype smsconnectiontype, String url, String ip,
			String port, boolean logactivated, String logpath,
			boolean eventactivated, String eventpath) {
		this.idsmsconfig = idsmsconfig;
		this.smsprovider = smsprovider;
		this.smsconnectiontype = smsconnectiontype;
		this.url = url;
		this.ip = ip;
		this.port = port;
		this.logactivated = logactivated;
		this.logpath = logpath;
		this.eventactivated = eventactivated;
		this.eventpath = eventpath;
	}

	public long getIdsmsconfig() {
		return this.idsmsconfig;
	}

	public void setIdsmsconfig(long idsmsconfig) {
		this.idsmsconfig = idsmsconfig;
	}

	public Smsprovider getSmsprovider() {
		return this.smsprovider;
	}

	public void setSmsprovider(Smsprovider smsprovider) {
		this.smsprovider = smsprovider;
	}

	public Smsconnectiontype getSmsconnectiontype() {
		return this.smsconnectiontype;
	}

	public void setSmsconnectiontype(Smsconnectiontype smsconnectiontype) {
		this.smsconnectiontype = smsconnectiontype;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public boolean isLogactivated() {
		return this.logactivated;
	}

	public void setLogactivated(boolean logactivated) {
		this.logactivated = logactivated;
	}

	public String getLogpath() {
		return this.logpath;
	}

	public void setLogpath(String logpath) {
		this.logpath = logpath;
	}

	public boolean isEventactivated() {
		return this.eventactivated;
	}

	public void setEventactivated(boolean eventactivated) {
		this.eventactivated = eventactivated;
	}

	public String getEventpath() {
		return this.eventpath;
	}

	public void setEventpath(String eventpath) {
		this.eventpath = eventpath;
	}

}