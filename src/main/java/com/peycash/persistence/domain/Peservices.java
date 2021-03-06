/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Peservices generated by hbm2java
 */
public class Peservices implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idpeservices;
	private String name;
	private String description;
	private boolean isactive;
	private Set<Peproperties> pepropertieses = new HashSet<Peproperties>(0);
	private Set<Peconfig> peconfigs = new HashSet<Peconfig>(0);
	private Set<Pechangehistory> pechangehistories = new HashSet<Pechangehistory>(
			0);

	public Peservices() {
	}

	public Peservices(long idpeservices, String name, boolean isactive) {
		this.idpeservices = idpeservices;
		this.name = name;
		this.isactive = isactive;
	}

	public Peservices(long idpeservices, String name, String description,
			boolean isactive, Set<Peproperties> pepropertieses,
			Set<Peconfig> peconfigs, Set<Pechangehistory> pechangehistories) {
		this.idpeservices = idpeservices;
		this.name = name;
		this.description = description;
		this.isactive = isactive;
		this.pepropertieses = pepropertieses;
		this.peconfigs = peconfigs;
		this.pechangehistories = pechangehistories;
	}

	public long getIdpeservices() {
		return this.idpeservices;
	}

	public void setIdpeservices(long idpeservices) {
		this.idpeservices = idpeservices;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isIsactive() {
		return this.isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public Set<Peproperties> getPepropertieses() {
		return this.pepropertieses;
	}

	public void setPepropertieses(Set<Peproperties> pepropertieses) {
		this.pepropertieses = pepropertieses;
	}

	public Set<Peconfig> getPeconfigs() {
		return this.peconfigs;
	}

	public void setPeconfigs(Set<Peconfig> peconfigs) {
		this.peconfigs = peconfigs;
	}

	public Set<Pechangehistory> getPechangehistories() {
		return this.pechangehistories;
	}

	public void setPechangehistories(Set<Pechangehistory> pechangehistories) {
		this.pechangehistories = pechangehistories;
	}

}
