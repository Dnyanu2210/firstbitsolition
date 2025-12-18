package TestClass;

import Controller.EmployeeController;
import View.EmployeeView;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeController ec=new EmployeeController();
		EmployeeView view=new EmployeeView(ec);
		view.showOptions();

	}

}
