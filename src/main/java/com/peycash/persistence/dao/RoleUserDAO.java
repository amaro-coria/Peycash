/**
 * 
 */
package com.peycash.persistence.dao;

import java.util.List;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.domain.Roleuser;

/**
 * @author amaro
 *
 */
public interface RoleUserDAO extends BaseDAO<Roleuser, Integer> {

	List<Roleuser> showCurrentUserRoles(int idUser) throws PersistenceException;
}
