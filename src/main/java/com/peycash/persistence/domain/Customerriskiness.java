/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Customerriskiness generated by hbm2java
 */
public class Customerriskiness implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idcustomerriskiness;
	private String riskiness;
	private String description;
	private Set<Customer> customers = new HashSet<Customer>(0);

	public Customerriskiness() {
	}

	public Customerriskiness(int idcustomerriskiness, String riskiness,
			String description) {
		this.idcustomerriskiness = idcustomerriskiness;
		this.riskiness = riskiness;
		this.description = description;
	}

	public Customerriskiness(int idcustomerriskiness, String riskiness,
			String description, Set<Customer> customers) {
		this.idcustomerriskiness = idcustomerriskiness;
		this.riskiness = riskiness;
		this.description = description;
		this.customers = customers;
	}

	public int getIdcustomerriskiness() {
		return this.idcustomerriskiness;
	}

	public void setIdcustomerriskiness(int idcustomerriskiness) {
		this.idcustomerriskiness = idcustomerriskiness;
	}

	public String getRiskiness() {
		return this.riskiness;
	}

	public void setRiskiness(String riskiness) {
		this.riskiness = riskiness;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
