package cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.model.aggregations.BankAccount;
import com.model.aggregations.Customer;
import com.util.JPAUtil;

public class Aggregations {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("8885559879","Sundar",ba);
		ba.setAccno("765438");
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();

	}

}
