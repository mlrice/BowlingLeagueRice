package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Team;

public class TeamHelper {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRice");
	
	
	public void addTeam(Team toAdd) {
		// TODO Auto-generated method stub
		
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
}
