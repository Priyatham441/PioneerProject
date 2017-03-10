package com.shoppingcart.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoppingcart.dao.LoginDao;

public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean getLoginDetails(String name, String password) {

		boolean userFound = false;

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			tx.begin();
			Query query = session.createQuery("FROM Customers WHERE username=? and password=?");
			query.setParameter(1, name);
			query.setParameter(2, password);

			@SuppressWarnings("rawtypes")
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound = true;
			}

		} catch (Exception e) {
			tx.rollback();
		} finally {

			if (session != null) {
				session.close();
			}
		}

		return userFound;
	}

}
