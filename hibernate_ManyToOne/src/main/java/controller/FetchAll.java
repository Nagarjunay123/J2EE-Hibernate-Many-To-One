package controller;

import dao.StateDao;

public class FetchAll {

	public static void main(String[] args) {


		StateDao stateDao=new StateDao();
		stateDao.FetchAll();
	}

}
