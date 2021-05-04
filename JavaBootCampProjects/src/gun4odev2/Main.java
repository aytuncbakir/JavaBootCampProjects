package gun4odev2;

import java.util.Date;

import abstracts.BaseCustomerManager;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Engin","Demiroğ",new Date(1985,1,6),"28861499108"));
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager1.save(new Customer(1,"Engin","Demiroğ",new Date(1985,1,6),"28861499108"));

	}

}
