package com.binding.dao.em;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerInstance {
private static final EntityManagerFactory emfactory;
	
	static{
		try {
			emfactory = Persistence.createEntityManagerFactory("bindingPersistenceUnit");
		} catch (Throwable e) {
			System.err.println(e.toString());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static EntityManager getMyEntityManager(){
		return emfactory.createEntityManager();
	}
}
