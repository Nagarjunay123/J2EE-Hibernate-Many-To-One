package controller;

import dao.StateDao;
import dto.Country;
import dto.State;

public class SaveBoth {

	public static void main(String[] args) {


		Country country=new Country();
		country.setCountryName("India");
		country.setCountryCapital("delhi");
		country.setCountryPM("MS Modi");
		country.setCountryStates(29);
		
		State state1=new State();
		state1.setStateName("Telangana");
		state1.setStateCapital("hyd");
		state1.setStateCM("revanth");
		state1.setStateDisticts(33);
		state1.setCountry(country);
		
		State state2=new State();
		state2.setStateName("ap");
		state2.setStateCapital("amv");
		state2.setStateCM("jagan");
		state2.setStateDisticts(26);
		state2.setCountry(country);
		
		State state3=new State();
		state3.setStateName("karnataka");
		state3.setStateCapital("blr");
		state3.setStateCM("sid");
		state3.setStateDisticts(31);
		state3.setCountry(country);
		
		StateDao stateDao=new StateDao();
		stateDao.saveBoth(state1);
		stateDao.saveBoth(state2);
		stateDao.saveBoth(state3);
	}

}
