package com.xworkz.sewing.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.sewing.dto.SewingMachineDTO;

public class SewingMachineDAOImpl implements SewingMachineDAO {

	public void addSewingMachineDetails(SewingMachineDTO dto) {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(dto);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}
		if (sessionFactory != null) {
			sessionFactory.close();
			System.out.println("SessionFactory is Closed");

		} else {
			System.out.println("SessionFactory is not Closed");
		}

	}

	public void displaySewingMachineDetails() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			SewingMachineDTO machineDTO = session.get(SewingMachineDTO.class, 1);
			System.out.println(machineDTO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is Closed");
			} else {
				System.out.println("Session is not Closed");
			}
		}
		if (sessionFactory != null) {
			sessionFactory.close();
			System.out.println("SessionFactory is Closed");

		} else {
			System.out.println("SessionFactory is not Closed");
		}

	}

}
