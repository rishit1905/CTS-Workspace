package cts.ui;

import javax.persistence.EntityManager;

import com.util.JPAUtil;

import cts.model1.ContractEmp;
import cts.model1.Employee;
import cts.model1.Manager;

public class Emp {

	public static void main(String[] args) {
		
		Employee e=new Employee(101,"Vamsy",25000);
		Manager m=new Manager(102, "Ramu", 36000, 9500);
		ContractEmp ce=new ContractEmp(103,"Kittu",45200,11);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("EMPLOYEES saved..");
		JPAUtil.shutdown();
	}

}
