package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Institute;
@Repository
public class InstituteDaoImpl implements InstituteDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int createInstitute(Institute institute) {
		entityManager.getTransaction().begin();
		entityManager.persist(institute);
		entityManager.getTransaction().commit();
		return 1;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	@Override
	public void rollBackTransaction() {
		entityManager.getTransaction().rollback();
	}
}
