package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department("Nas", 2);
		Seller sl = new Seller(21, "bob", "bob@gmail.com", new Date(), 2300.00, dp);
		
		System.out.println(sl);
	}
}
