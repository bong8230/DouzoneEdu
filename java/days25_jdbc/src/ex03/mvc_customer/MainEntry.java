package ex03.mvc_customer;

import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		CustomerController.connect();
		CustomerController.menu();
	}
}
