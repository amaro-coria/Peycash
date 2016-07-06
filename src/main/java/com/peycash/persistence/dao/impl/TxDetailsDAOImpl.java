/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.dao.TxDetailsDAO;
import com.peycash.persistence.domain.Txdetails;

/**
 * Implementation of the interface to access the persistence entity Txdetails
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class TxDetailsDAOImpl extends BaseDAOImpl<Txdetails, Long> implements
		TxDetailsDAO {

}
