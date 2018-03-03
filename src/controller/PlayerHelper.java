package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Player;

public class PlayerHelper {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRice");

	public void addPlayer(Player toAdd) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	public List<Player> viewAllPlayers() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Player> allResults = em.createQuery("select li from Player li", Player.class);
		List<Player> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}
	public Player searchForItemById(Integer tempId) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Player foundPlayer = em.find(Player.class, tempId);
		em.close();
		return foundPlayer;
	}
	public void deleteItem(Player itemToDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Player> typedQuery = em.createQuery("select p from Player p where p.playerId = :selectedId", Player.class);
		typedQuery.setParameter("selectedId", itemToDelete.getPlayerId());
		typedQuery.setMaxResults(1);
		Player result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();	
		
	}
}