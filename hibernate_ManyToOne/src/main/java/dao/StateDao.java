package dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Country;
import dto.State;

public class StateDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nag");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveBoth(State state) {
//		Country country=state.getCountry();
		entityTransaction.begin();
		
//		entityManager.persist(country);
		entityManager.persist(state);
		
		entityTransaction.commit();
	}
	public void FetchAll() {
		Query query=entityManager.createQuery("select s from State s");
		List list=query.getResultList();
		System.out.println(list);
	}
	
	public void deleteById(int stateId) {
		State state=entityManager.find(State.class, stateId);
		entityTransaction.begin();
		entityManager.remove(state);
		entityTransaction.commit();
	}
	
	public void updateByCM(int id,String cm) {
		State state=entityManager.find(State.class, id);
		state.setStateCM(cm);
		
		entityTransaction.begin();
		entityManager.merge(state);
		entityTransaction.commit();
	}
	public void deleteBoth(int stateId1, int stateId2) {
		State state1=entityManager.find(State.class, stateId1);
		State state2=entityManager.find(State.class, stateId2);
//		Country country=state2.getCountry();
		
		entityTransaction.begin();
		entityManager.remove(state1);
		entityManager.remove(state2);
//		entityManager.remove(country);
		
		entityTransaction.commit();
		
	}
	public void updateBoth(int oldStateId,State state) {
		state.setStateId(oldStateId);
//		Country country=state.getCountry();
		entityTransaction.begin();
		entityManager.merge(state);
//		entityManager.merge(country);
		entityTransaction.commit();
	}
	
	public void insertOnlyOne(int oldCountryId,State newstate) {
		Country country=entityManager.find(Country.class, oldCountryId);
		newstate.setCountry(country);
		entityTransaction.begin();
		entityManager.persist(newstate);
		entityTransaction.commit();
		
	}
}
