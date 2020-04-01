package centripio.ecommerce;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import centripio.ecommerce.entity.Customer;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce-jpa");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Customer customer1 = new Customer();
		//customer1.setId(1);
		customer1.setFirtname("Oscar");
		customer1.setLastname("Blancarte");
		customer1.setBirthday(LocalDate.now());
		em.persist(customer1);
		
		Customer customer2 = new Customer();
		//customer1.setId(1);
		customer2.setFirtname("Juan");
		customer2.setLastname("Perez");
		customer2.setBirthday(LocalDate.now());
		em.persist(customer2);

		em.getTransaction().commit();
		
		
	}
}