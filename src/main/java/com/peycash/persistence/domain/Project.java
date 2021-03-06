/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Project generated by hbm2java
 */
public class Project implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idproject;
	private Employee employee;
	private String name;
	private String description;
	private String pecomment;
	private boolean isactivied;
	private Set<Workerrole> workerroles = new HashSet<Workerrole>(0);

	public Project() {
	}

	public Project(long idproject, Employee employee, String name,
			boolean isactivied) {
		this.idproject = idproject;
		this.employee = employee;
		this.name = name;
		this.isactivied = isactivied;
	}

	public Project(long idproject, Employee employee, String name,
			String description, String pecomment, boolean isactivied,
			Set<Workerrole> workerroles) {
		this.idproject = idproject;
		this.employee = employee;
		this.name = name;
		this.description = description;
		this.pecomment = pecomment;
		this.isactivied = isactivied;
		this.workerroles = workerroles;
	}

	public long getIdproject() {
		return this.idproject;
	}

	public void setIdproject(long idproject) {
		this.idproject = idproject;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	public String getPecomment() {
		return this.pecomment;
	}

	public void setPecomment(String pecomment) {
		this.pecomment = pecomment;
	}

	public boolean isIsactivied() {
		return this.isactivied;
	}

	public void setIsactivied(boolean isactivied) {
		this.isactivied = isactivied;
	}

	public Set<Workerrole> getWorkerroles() {
		return this.workerroles;
	}

	public void setWorkerroles(Set<Workerrole> workerroles) {
		this.workerroles = workerroles;
	}

}
