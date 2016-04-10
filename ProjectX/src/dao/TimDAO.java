package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Tim;

public class TimDAO {
	private static EntityManager em = Persistence.createEntityManagerFactory("ProjectX").createEntityManager();
	
	public static Tim napraviTim(Tim t){
		try {
			em.getTransaction().begin();
			em.persist(t);			//on ovde napravi SQL i kreira igraca					
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return t;		
	}
	public static Tim ispisiTim(int id){
		return em.find(Tim.class, id);
	}
	public static List<Tim> ispisiSveTimove(){
		Query q = em.createQuery("select t from Tim t");  
		return q.getResultList();
	}
	public static boolean izbrisiTim(Tim t){
		try {
			em.getTransaction().begin();
			Tim tim = em.merge(t);
			em.remove(tim);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		Tim tim = new Tim();
		tim.setNazivTima("JavaScript");
		
		napraviTim(tim);
		
		/*for(Tim t:ispisiSveTimove()){
			System.out.println(t.getNazivTima());
		}*/
		/*Tim t = ispisiTim(1);
		izbrisiTim(t);
		for(Tim te:ispisiSveTimove()){
		System.out.println(te.getNazivTima());*/
	}
}
