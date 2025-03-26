package es.gimbernat.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import es.gimbernat.dominio.Empleado;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello world!");
//		BBDD bd = new BBDD();
//        boolean okConexion = bd.init();
//
//        System.out.println(okConexion);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Atracciones");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Empleado e1 = new Empleado("11111111A", "Empleado 1", 1111);
		em.persist(e1);
		et.commit();
		em.close();

	}

}
