/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.dao.PinSecurityDAO;
import com.peycash.persistence.domain.Pinsecurity;

/**
 * Implementation of the interface to access the persistence entity Pinsecurity
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class PinSecurityDAOImpl extends BaseDAOImpl<Pinsecurity, Long>
		implements PinSecurityDAO {

}
