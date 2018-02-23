package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlayerHelper {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueRice");
}