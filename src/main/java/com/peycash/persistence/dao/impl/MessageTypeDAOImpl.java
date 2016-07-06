/*
 * Peycash 2014 - All rights reserved
 */
package com.peycash.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.peycash.persistence.dao.MessageTypeDAO;
import com.peycash.persistence.domain.Messagetype;

/**
 * Implementation of the interface to access the persistence entity Messagetype
 * 
 * @author Jorge Amaro
 * @author Aline Ordo&ntilde;ez
 * @version 1.1
 * @since 1.0
 *
 */
@Repository
public class MessageTypeDAOImpl extends BaseDAOImpl<Messagetype, Long>
		implements MessageTypeDAO {

}
