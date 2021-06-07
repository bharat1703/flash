package com.prasad.Entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
	Configuration config=new Configuration().configure();
	SessionFactory sf=config.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=null;
	try{
		tx=session.beginTransaction();
		//business logic started
		Set<course> setcourse = new HashSet<course>();
	 	setcourse.add(new course("banks"));
		setcourse.add(new course("railways"));
		Student s1=new Student("vinay",setcourse);
		session.save(s1);
		//business logic ended
		tx.commit();
	}catch(HibernateException he) {
		he.printStackTrace();
		if(tx.getStatus()!=null) {
			tx.rollback();
		}
	}
	finally {
		session.close();
	}	
		
		
	}

}
