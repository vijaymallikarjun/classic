package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DTO.entitycell;

public class dbcell {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void send(entitycell etc)
	{
		et.begin();
		em.persist(etc);
		et.commit();
	}

	public entitycell find(String q1) {
		return em.find(entitycell.class, q1);
	}

	public void UPDATE(String d1, String d2) {
		entitycell eg=em.find(entitycell.class, d1);
		eg.setName(d2);
		et.begin();
		em.merge(eg);
		et.commit();
		
	}

	public void remove(String f1) {
		entitycell eu=em.find(entitycell.class, f1);
		et.begin();
		em.remove(eu);
		et.commit();
		
	}

	public List<entitycell> fetchAll() {
		et.begin();
		Query query=em.createQuery("select data from entitycell data");
		List<entitycell> list=query.getResultList();
		return list;
	}

}
