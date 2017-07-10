package com.binding.dao;

import javax.persistence.EntityManager;
import org.example.entities.timestamp.TimestampRequestType;
import com.binding.converter.TimestampSdoToJpo;
import com.binding.dao.em.EntityManagerInstance;

public class TimestampCrud implements TimestampDao{

	private static EntityManager myEntityManager;

	static {
		myEntityManager = EntityManagerInstance.getMyEntityManager();
	}
	
	@Override
	public String createTimestampp(TimestampRequestType timestamp) {
		TimestampSdoToJpo timestampConverter = new TimestampSdoToJpo();
		String message = null;
		try {
			myEntityManager.getTransaction().begin();
			myEntityManager.persist(timestampConverter.convert(timestamp));
			myEntityManager.getTransaction().commit();
			message = "Succesfully Inserted";
		} catch (Exception e) {
			e.printStackTrace();
			message = "Exception occured";
		}
		return message;
	}

}
