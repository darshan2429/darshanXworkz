package com.xworkz.facebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.facebook.dto.FacebookDTO;

public class FacebookDAOImpl implements FacebookDAO {

	@Override
	public void addDetails(FacebookDTO dto) {
		Session session = null;
		SessionFactory sessionFactory = null;
		sessionFactory= new Configuration().configure().buildSessionFactory();
		
		
		
	}

	@Override
	public void displayFacebookDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMobileNoUsingFacebookId(int id, String mobileNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFacebookDetailsUsingFacebookId(int id) {
		// TODO Auto-generated method stub
		
	}

}
