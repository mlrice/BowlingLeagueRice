package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


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
	public List<Team> viewAllTeams() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Team> allResults = em.createQuery("select li from Team li", Team.class);
		List<Team> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}
	public Team searchForItemById(Integer tempId) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Team foundTeam = em.find(Team.class, tempId);
		em.close();
		return foundTeam;
	}
	public void deleteItem(Team itemToDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Team> typedQuery = em.createQuery("select t from Team t where t.teamId = :selectedId",Team.class);
		typedQuery.setParameter("selectedId", itemToDelete.getTeamId());
		typedQuery.setMaxResults(1);
		Team result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();	
	}
}
