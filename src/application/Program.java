package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("----- Test 1: Find by Id -----");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);
		
		System.out.println("\n\n----- Test 2: Find by Department -----");
		Department dep = new Department(null, 2);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller p : list) {
			System.out.println(p);
		}
		
		System.out.println("\n\n----- Test 3: Find All -----");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller p : list2) {
			System.out.println(p);
		}
		
		System.out.println("\n\n----- Test 4: Insert -----");
		Seller newSeller = new Seller(null, "Greg Pulanov", "gregpul@gmail.com", new Date(), 4500.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New seller id = " + newSeller.getId());
		
		System.out.println("\n\n----- Test 5: Update -----");
		sel = sellerDao.findById(8);
		sel.setName("Hassan Kuntze");
		sellerDao.update(sel);
		System.out.println("Updated!");
		
		System.out.println("\n\n----- Test 6: Delete -----");
		sellerDao.deleteById(18);
		System.out.println("Deleted!");
		
		System.out.println("\n\n\n--------------------------------------------------------------------------------------------------");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n----- Teste 1: Find By Id -----");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);
		
		System.out.println("\n----- Teste 2: Update -----");
		dep2 = departmentDao.findById(1);
		dep2.setName("COMPIUTER DO Filhão");
		departmentDao.update(dep2);
		System.out.println("Done");
		
		System.out.println("\n----- Teste 3: Delete -----"); 
		departmentDao.deleteById(6);
		System.out.println("Done");
		
		System.out.println("\n----- Teste 4: Find All -----");
		List<Department> listDep = departmentDao.findAll();
		for(Department d : listDep) {
			System.out.println(d);
		}
	} 
}
