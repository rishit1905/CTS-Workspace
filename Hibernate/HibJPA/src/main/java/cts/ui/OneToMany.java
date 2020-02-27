package cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.model.aggregations.Course;
import com.model.aggregations.Trainee;
import com.util.JPAUtil;

public class OneToMany {

	public static void main(String[] args) {
		Course mca=new Course(101,"MCA", new TreeSet<Trainee>());
		Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(201,"Vamsy",mca));
		mca.getTrainees().add(new Trainee(202,"Susila",mca));
		mca.getTrainees().add(new Trainee(203,"Indika",mca));
		
		mba.getTrainees().add(new Trainee(204,"Srinu",mba));
		mba.getTrainees().add(new Trainee(205,"Deepa",mba));
		mba.getTrainees().add(new Trainee(206,"Raghu",mba));

		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		
		System.out.println("saved");
		JPAUtil.shutdown();
	}

}
