package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Igrac;

public class IgracDAO {
	
	private static EntityManager em = Persistence.createEntityManagerFactory("ProjectX").createEntityManager();
	
	public static Igrac ispisiIgraca(int id){
		return em.find(Igrac.class, id);
		
	}
	
	public static Igrac sacuvajIgraca(Igrac i) {
		try {
			em.getTransaction().begin();
			em.persist(i);			//on ovde napravi SQL i kreira igraca					
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return i;
	}
	
	public static boolean azurirajIgraca(Igrac i) {
		try {
			em.getTransaction().begin();
			em.merge(i);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static boolean izbrisiIgraca(Igrac i) {
		try {
			em.getTransaction().begin();
			Igrac igrac = em.merge(i);
			em.remove(igrac);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public static List<Igrac> vratiSveIgrace() {
		Query q = em.createQuery("select i from Igrac i");
		return q.getResultList();
	}
}
