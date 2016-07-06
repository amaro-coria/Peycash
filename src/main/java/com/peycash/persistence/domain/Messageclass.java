/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Messageclass generated by hbm2java
 */
public class Messageclass implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idmessageclass;
	private String class_;
	private String description;
	private Set<Messagetype> messagetypes = new HashSet<Messagetype>(0);

	public Messageclass() {
	}

	public Messageclass(long idmessageclass) {
		this.idmessageclass = idmessageclass;
	}

	public Messageclass(long idmessageclass, String class_, String description,
			Set<Messagetype> messagetypes) {
		this.idmessageclass = idmessageclass;
		this.class_ = class_;
		this.description = description;
		this.messagetypes = messagetypes;
	}

	public long getIdmessageclass() {
		return this.idmessageclass;
	}

	public void setIdmessageclass(long idmessageclass) {
		this.idmessageclass = idmessageclass;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Messagetype> getMessagetypes() {
		return this.messagetypes;
	}

	public void setMessagetypes(Set<Messagetype> messagetypes) {
		this.messagetypes = messagetypes;
	}

}