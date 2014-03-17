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
	public Facility retrieveFacility(String Id) {
		try {
		System.out.println("*************** Searcing for customer information with ID ...  " + Id);
		Session session = HibernateMYSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		System.out.println("*************** Hibernate session is created ..................\n" + session.toString());
		
		//Query getFacQuery = session.createQuery("From FacilityImp ");
		Query getFacQuery = session.createQuery("From FacilityImp where Id=:Id");		
		getFacQuery.setString("Id", Id);
		
		System.out.println("*************** Retrieve Query is ....>>\n" + getFacQuery.toString()); 
		
		List facilitys= getFacQuery.list();
		System.out.println("Getting Facility Details using HQL. \n" + facilitys);

		session.getTransaction().commit();
		return (Facility)facilitys.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	}
