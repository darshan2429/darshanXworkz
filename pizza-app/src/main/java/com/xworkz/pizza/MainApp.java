package com.xworkz.pizza;

import com.xworkz.pizza.dto.PizzaHutDTO;
import com.xworkz.pizza.service.PizzaHutServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		// Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml");
		// SessionFactory sessionFactory = configuration.buildSessionFactory();
		// Session session = sessionFactory.openSession();
		//
		// PizzaHutDTO dto = new PizzaHutDTO("onion", "rajajinagar", 150, true,
		// "small", "Veg");
		//
		// Transaction transaction = session.beginTransaction();
		//
		// session.save(dto);
		// transaction.commit();
		// System.out.println("Successfully Added into DB");

		PizzaHutDTO pizzaHutDTO = new PizzaHutDTO("chicken", "RR Nagar", 250, true, "Medium", "nonveg");

		PizzaHutServiceImpl pizzaHutServiceImpl = new PizzaHutServiceImpl();
		pizzaHutServiceImpl.validatePizzaHutData(pizzaHutDTO);
		pizzaHutServiceImpl.validatePizzaHutDisplay();

	}

}
