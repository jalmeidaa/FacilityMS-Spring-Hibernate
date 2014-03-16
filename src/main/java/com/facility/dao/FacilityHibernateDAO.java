package com.facility.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.facility.model.facility.Facility;

public class FacilityHibernateDAO {

	public void addFacility(Facility fac){
		System.out.println("*************** Adding facility information in DB with ID ...  " + fac.getId());
		Session session = HibernateMYSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(fac);
		session.getTransaction().commit();
	}
	public void deleteFacility(Facility fac) {
		System.out.println("*************** Deleteing faciltiy information in DB with ID ...  " + fac.getId());
		Session session = HibernateMYSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(fac);
		session.getTransaction().commit();
	}
	}
