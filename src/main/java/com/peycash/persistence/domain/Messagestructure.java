/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Messagestructure generated by hbm2java
 */
public class Messagestructure implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idmessagestructures;
	private Messagetype messagetype;
	private String conditions;
	private String dsc;
	private Set<Messagefactory> messagefactoriesForIdmessagestructurerevres = new HashSet<Messagefactory>(
			0);
	private Set<Messagefactory> messagefactoriesForIdmessagestructurereq = new HashSet<Messagefactory>(
			0);
	private Set<Messagefactory> messagefactoriesForIdmessagestructurereqres = new HashSet<Messagefactory>(
			0);
	private Set<Messagefactory> messagefactoriesForIdmessagestructurerev = new HashSet<Messagefactory>(
			0);
	private Set<Messagefields> messagefieldses = new HashSet<Messagefields>(0);

	public Messagestructure() {
	}

	public Messagestructure(int idmessagestructures, Messagetype messagetype) {
		this.idmessagestructures = idmessagestructures;
		this.messagetype = messagetype;
	}

	public Messagestructure(int idmessagestructures, Messagetype messagetype,
			String conditions,
			Set<Messagefactory> messagefactoriesForIdmessagestructurerevres,
			Set<Messagefactory> messagefactoriesForIdmessagestructurereq,
			Set<Messagefactory> messagefactoriesForIdmessagestructurereqres,
			Set<Messagefactory> messagefactoriesForIdmessagestructurerev) {
		this.idmessagestructures = idmessagestructures;
		this.messagetype = messagetype;
		this.conditions = conditions;
		this.messagefactoriesForIdmessagestructurerevres = messagefactoriesForIdmessagestructurerevres;
		this.messagefactoriesForIdmessagestructurereq = messagefactoriesForIdmessagestructurereq;
		this.messagefactoriesForIdmessagestructurereqres = messagefactoriesForIdmessagestructurereqres;
		this.messagefactoriesForIdmessagestructurerev = messagefactoriesForIdmessagestructurerev;
	}

	public int getIdmessagestructures() {
		return this.idmessagestructures;
	}

	public void setIdmessagestructures(int idmessagestructures) {
		this.idmessagestructures = idmessagestructures;
	}

	public Messagetype getMessagetype() {
		return this.messagetype;
	}

	public void setMessagetype(Messagetype messagetype) {
		this.messagetype = messagetype;
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Set<Messagefactory> getMessagefactoriesForIdmessagestructurerevres() {
		return this.messagefactoriesForIdmessagestructurerevres;
	}

	public void setMessagefactoriesForIdmessagestructurerevres(
			Set<Messagefactory> messagefactoriesForIdmessagestructurerevres) {
		this.messagefactoriesForIdmessagestructurerevres = messagefactoriesForIdmessagestructurerevres;
	}

	public Set<Messagefactory> getMessagefactoriesForIdmessagestructurereq() {
		return this.messagefactoriesForIdmessagestructurereq;
	}

	public void setMessagefactoriesForIdmessagestructurereq(
			Set<Messagefactory> messagefactoriesForIdmessagestructurereq) {
		this.messagefactoriesForIdmessagestructurereq = messagefactoriesForIdmessagestructurereq;
	}

	public Set<Messagefactory> getMessagefactoriesForIdmessagestructurereqres() {
		return this.messagefactoriesForIdmessagestructurereqres;
	}

	public void setMessagefactoriesForIdmessagestructurereqres(
			Set<Messagefactory> messagefactoriesForIdmessagestructurereqres) {
		this.messagefactoriesForIdmessagestructurereqres = messagefactoriesForIdmessagestructurereqres;
	}

	public Set<Messagefactory> getMessagefactoriesForIdmessagestructurerev() {
		return this.messagefactoriesForIdmessagestructurerev;
	}

	public void setMessagefactoriesForIdmessagestructurerev(
			Set<Messagefactory> messagefactoriesForIdmessagestructurerev) {
		this.messagefactoriesForIdmessagestructurerev = messagefactoriesForIdmessagestructurerev;
	}

	/**
	 * @return the messagefieldses
	 */
	public Set<Messagefields> getMessagefieldses() {
		return messagefieldses;
	}

	/**
	 * @param messagefieldses
	 *            the messagefieldses to set
	 */
	public void setMessagefieldses(Set<Messagefields> messagefieldses) {
		this.messagefieldses = messagefieldses;
	}

	/**
	 * @return the dsc
	 */
	public String getDsc() {
		return dsc;
	}

	/**
	 * @param dsc
	 *            the dsc to set
	 */
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

}
