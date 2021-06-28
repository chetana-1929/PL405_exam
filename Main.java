package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	
		
		StudentMarks s1= new StudentMarks();
		s1.setRoll_no(1929);
		s1.setSubject("Software Engineering");
		s1.setMarks(75);
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
