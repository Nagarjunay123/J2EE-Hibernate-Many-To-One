package controller;

import dao.StateDao;
import dto.Country;
import dto.State;

public class InsertOnlyOne {

	public static void main(String[] args) {


		State state=new State();
		state.setStateName("tamilnadu");
		state.setStateDisticts(25);
		state.setStateCapital("chennai");
		state.setStateCM("stalin");

		StateDao stateDao=new StateDao();
		stateDao.insertOnlyOne(1,state);
	}

}
