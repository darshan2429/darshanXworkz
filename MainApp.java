package com.xworkz.pizza;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class MainApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		PizzaHutDTO dto = new PizzaHutDTO("Corn", "basavana gudi", 150, true, "small", "Veg");

		Transaction transaction = session.beginTransaction();

		session.save(dto);
		transaction.commit();
		System.out.println("Successfully Added into  DB");
	}

}
