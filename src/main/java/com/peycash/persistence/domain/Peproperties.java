/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

/**
 * Peproperties generated by hbm2java
 */
public class Peproperties implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idpeproperties;
	private String peVersion;
	private Peservices peservices;
	private String title;
	private String company;
	private String author;
	private String description;
	private String owner;

	public Peproperties() {
	}

	public Peproperties(long idpeproperties, Peservices peservices, String title) {
		this.idpeproperties = idpeproperties;
		this.peservices = peservices;
		this.title = title;
	}

	public Peproperties(long idpeproperties, Peservices peservices,
			String title, String company, String author, String description,
			String owner) {
		this.idpeproperties = idpeproperties;
		this.peservices = peservices;
		this.title = title;
		this.company = company;
		this.author = author;
		this.description = description;
		this.owner = owner;
	}

	public long getIdpeproperties() {
		return this.idpeproperties;
	}

	public void setIdpeproperties(long idpeproperties) {
		this.idpeproperties = idpeproperties;
	}

	public String getPeVersion() {
		return this.peVersion;
	}

	public void setPeVersion(String peVersion) {
		this.peVersion = peVersion;
	}

	public Peservices getPeservices() {
		return this.peservices;
	}

	public void setPeservices(Peservices peservices) {
		this.peservices = peservices;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}