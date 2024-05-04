package controller;

import dao.StateDao;

public class UpdateByCM {

	public static void main(String[] args) {

		StateDao stateDao=new StateDao();
		stateDao.updateByCM(1, "pavan Kalyan");

		
	}

}
