/**
 * 
 */
package com.peycash.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.RoleUserDAO;
import com.peycash.persistence.domain.Roleuser;

/**
 * @author amaro
 *
 */
@Repository
public class RoleUserDAOImpl extends BaseDAOImpl<Roleuser, Integer> implements
		RoleUserDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Roleuser> showCurrentUserRoles(int idUser)
			throws PersistenceException {
		Criteria criteria = getSessionFactory().getCurrentSession()
				.createCriteria(Roleuser.class)
				.add(Restrictions.eq("user.iduser", idUser));
		List<Roleuser> roleuser = criteria.list();
		return roleuser;
	}

}
