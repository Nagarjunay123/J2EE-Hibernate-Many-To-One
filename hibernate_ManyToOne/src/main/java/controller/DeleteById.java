package controller;

import dao.StateDao;

public class DeleteById {

	public static void main(String[] args) {

		StateDao stateDao=new StateDao();
		stateDao.deleteById(4);
	}

}
