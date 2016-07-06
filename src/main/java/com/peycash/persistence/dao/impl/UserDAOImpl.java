package com.peycash.persistence.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.peycash.persistence.PersistenceException;
import com.peycash.persistence.dao.UserDAO;
import com.peycash.persistence.domain.User;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Integer> implements UserDAO {

	@Override
	public User findByUserName(String username) throws PersistenceException {
		User user = new User();
		try {
			Criteria criteria = getSessionFactory().getCurrentSession()
					.createCriteria(User.class)
					.add(Restrictions.eq("username", username));
			user = (User) criteria.uniqueResult();
		} catch (Exception e) {
			throw new PersistenceException("Error in findByUserName:"
					+ e.getMessage(), e);
		}
		return user;
	}

}
