package controller;

import dao.StateDao;
import dto.Country;
import dto.State;

public class UpdateBoth {

	public static void main(String[] args) {


		State state=new State();
		state.setStateName("GOA");
		state.setStateCM("pramod");
		state.setStateCapital("panaji");
		state.setStateDisticts(2);
		
		Country country=new Country();
		country.setCountryName("Bharath");
		country.setCountryStates(29);
		country.setCountryCapital("New delhi");
		country.setCountryPM("Narendra modi");
		country.setCountryId(1);
		
		state.setCountry(country);
		
		StateDao stateDao=new StateDao();
		stateDao.updateBoth(3, state);
	}

}
