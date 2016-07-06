/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.domain;

// Generated 28/03/2014 11:10:54 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Fields generated by hbm2java
 */
public class Fields implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idfields;
	private int field;
	private String description;
	String typeData;
	int length;
	String format;
	String fixed;
	private byte required;
	private Set<Messagefields> messagefieldses = new HashSet<Messagefields>(0);

	public Fields() {
	}

	public Fields(long idfields, int field) {
		this.idfields = idfields;
		this.field = field;
	}

	public Fields(long idfields, int field, String description) {
		this.idfields = idfields;
		this.field = field;
		this.description = description;
	}

	public long getIdfields() {
		return this.idfields;
	}

	public void setIdfields(long idfields) {
		this.idfields = idfields;
	}

	public int getField() {
		return this.field;
	}

	public void setField(int field) {
		this.field = field;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the typeData
	 */
	public String getTypeData() {
		return typeData;
	}

	/**
	 * @param typeData
	 *            the typeData to set
	 */
	public void setTypeData(String typeData) {
		this.typeData = typeData;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the fixed
	 */
	public String getFixed() {
		return fixed;
	}

	/**
	 * @param fixed
	 *            the fixed to set
	 */
	public void setFixed(String fixed) {
		this.fixed = fixed;
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
	 * @return the required
	 */
	public byte getRequired() {
		return required;
	}

	/**
	 * @param required
	 *            the required to set
	 */
	public void setRequired(byte required) {
		this.required = required;
	}

}