package com.crud.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.crud.controllers.CustomerController;
import com.crud.models.Customer;

public class Test {

	public static void main(String[] args) {

	
		
		Scanner sc = new Scanner(System.in);
		CustomerController customer = new CustomerController();

		switch (menu()) {
		case 1:
			System.out.println("Nom");
			String name = sc.next();
			System.out.println("Description");
			String description = sc.next();
			System.out.println("CIN");
			String cin = sc.next();
			try {
				customer.insertCustomer(new Customer(name,description,cin));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case 2:
			System.out.println("id");
			int idup = sc.nextInt();
			System.out.println("Nom");
			String upname = sc.next();
			System.out.println("Description");
			String updescription = sc.next();
			System.out.println("CIN");
			String upcin = sc.next();
			try {
				customer.updateCustomer(idup, new Customer(upname,updescription,upcin));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case 3:
			System.out.println("id");
			int idS = sc.nextInt();
			try {
				customer.deleteCustomer(idS);
			} catch (SQLException e) {
				e.printStackTrace();
			}

			break;
		case 4:
			try {
				customer.getAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5:
			System.out.println("id");
			int idOne = sc.nextInt();
			try {
				customer.getOne(idOne);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 6:
			System.exit(0);
			break;
		default:
			break;
		}

	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1 -Ajouter");
		System.out.println("2 -Mise à jour");
		System.out.println("3 -Supprimer");
		System.out.println("4 -Afficher");
		System.out.println("5 -Afficher un Client");
		System.out.println("6 -Quitter");

		return input.nextInt();
	}
	
}
