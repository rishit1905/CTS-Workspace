package cts.model.compositions.ui;


import javax.persistence.EntityManager;

import com.util.JPAUtil;

import cts.model.compositions.Address;
import cts.model.compositions.Faculty;

public class CompositionDemoApp {

	public static void main(String[] args) {
		Faculty f=new Faculty("Vamsy", new Address("A201","Brooks","Bangalore"));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.persist(f);

		System.out.println("Saved");
		JPAUtil.shutdown();
	}

}
