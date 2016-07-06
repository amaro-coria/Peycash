/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Workinggroup generated by hbm2java
 */
public class Workinggroup implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idworkinggroup;
	private Domicilios domicilios;
	private Pebranch pebranch;
	private String immediateboss;
	private String nameworkinggroup;
	private Long telephone;
	private Serializable datemodified;
	private String username;
	private boolean isactivied;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Workinggroup() {
	}

	public Workinggroup(long idworkinggroup, Pebranch pebranch,
			String immediateboss, String nameworkinggroup,
			Serializable datemodified, String username, boolean isactivied) {
		this.idworkinggroup = idworkinggroup;
		this.pebranch = pebranch;
		this.immediateboss = immediateboss;
		this.nameworkinggroup = nameworkinggroup;
		this.datemodified = datemodified;
		this.username = username;
		this.isactivied = isactivied;
	}

	public Workinggroup(long idworkinggroup, Domicilios domicilios,
			Pebranch pebranch, String immediateboss, String nameworkinggroup,
			Long telephone, Serializable datemodified, String username,
			boolean isactivied, Set<Employee> employees) {
		this.idworkinggroup = idworkinggroup;
		this.domicilios = domicilios;
		this.pebranch = pebranch;
		this.immediateboss = immediateboss;
		this.nameworkinggroup = nameworkinggroup;
		this.telephone = telephone;
		this.datemodified = datemodified;
		this.username = username;
		this.isactivied = isactivied;
		this.employees = employees;
	}

	public long getIdworkinggroup() {
		return this.idworkinggroup;
	}

	public void setIdworkinggroup(long idworkinggroup) {
		this.idworkinggroup = idworkinggroup;
	}

	public Domicilios getDomicilios() {
		return this.domicilios;
	}

	public void setDomicilios(Domicilios domicilios) {
		this.domicilios = domicilios;
	}

	public Pebranch getPebranch() {
		return this.pebranch;
	}

	public void setPebranch(Pebranch pebranch) {
		this.pebranch = pebranch;
	}

	public String getImmediateboss() {
		return this.immediateboss;
	}

	public void setImmediateboss(String immediateboss) {
		this.immediateboss = immediateboss;
	}

	public String getNameworkinggroup() {
		return this.nameworkinggroup;
	}

	public void setNameworkinggroup(String nameworkinggroup) {
		this.nameworkinggroup = nameworkinggroup;
	}

	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Serializable getDatemodified() {
		return this.datemodified;
	}

	public void setDatemodified(Serializable datemodified) {
		this.datemodified = datemodified;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isIsactivied() {
		return this.isactivied;
	}

	public void setIsactivied(boolean isactivied) {
		this.isactivied = isactivied;
	}

	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
