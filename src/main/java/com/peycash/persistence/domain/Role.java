package com.peycash.persistence.domain;

// Generated 03-sep-2014 12:17:34 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */

public class Role implements java.io.Serializable {

	private int idrole;
	private String description;
	private Set<Roleuser> roleusers = new HashSet<Roleuser>();

	public Role() {
	}

	public Role(int idrole) {
		this.idrole = idrole;
	}

	public Role(int idrole, String description, Set<Roleuser> roleusers) {
		this.idrole = idrole;
		this.description = description;
		this.roleusers = roleusers;
	}

	public int getIdrole() {
		return this.idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Roleuser> getRoleusers() {
		return this.roleusers;
	}

	public void setRoleusers(Set<Roleuser> roleusers) {
		this.roleusers = roleusers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + idrole;
		result = prime * result
				+ ((roleusers == null) ? 0 : roleusers.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idrole != other.idrole)
			return false;
		if (roleusers == null) {
			if (other.roleusers != null)
				return false;
		} else if (!roleusers.equals(other.roleusers))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [idrole=" + idrole + ", description=" + description
				+ ", roleusers=" + roleusers + "]";
	}

}
