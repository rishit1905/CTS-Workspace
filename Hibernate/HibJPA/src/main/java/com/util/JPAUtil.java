package com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

		private static final String PERSISTENT_UNIT_NAME="JHPA";
		private static EntityManagerFactory factory;
		
		public static EntityManagerFactory getEntityManagerFactory() {
			
			if(factory==null) {
				factory=Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME);
			}
			return factory;
		}
		
		public static void shutdown() {
			if(factory!=null) {
				factory.close();
			}
		}
}
