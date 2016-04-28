package com.wait.spring.dao;

import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.wait.spring.domain.Url;

import java.util.List;

import javax.persistence.EntityManager;
@Repository
public class BaseDao {

	@PersistenceContext
	protected EntityManager em;
	
	public Url test(String name) {
		Query query = em.createNamedQuery("URL_findUrlByName");
		query.setParameter("name", name);
		query.setParameter("portalId", null);
	
		return (Url) query.getSingleResult();
	}
}
