package cts.ui;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.internal.StaticFilterAliasGenerator;

import com.model.aggregations.Trainee;
import com.mysql.cj.Query;
import com.util.JPAUtil;

public class JPQL {

	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Trainee tr=em.find(Trainee.class, 201);
		
		if(tr!=null) {
			System.out.println(tr);
		}
		
		String qryStr="SELECT t FROM Trainee t";
		javax.persistence.Query qry=em.createQuery(qryStr);
		
		display(qry.getResultList());
		display(em.createQuery("SELECT t FROM Trainee t WHERE t.admNo>203").getResultList());
		
		List<String> names=em.createQuery("SELECT t.sName FROM Trainee t").getResultList();
		
		for(String n:names) {
			System.out.println(n);
		}
		
		em.close();
		JPAUtil.shutdown();	
	}
	
	static void display(List<Trainee> data) {
		System.out.println("--------------------------------");
		for(Trainee t:data) {
			System.out.println(t);
		}
		System.out.println("--------------------------------");
	}

}
