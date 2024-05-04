package controller;

import dao.StateDao;

public class DeleteBoth {

	public static void main(String[] args) {


		StateDao stateDao=new StateDao();
		stateDao.deleteBoth(1,2);
	}

}
