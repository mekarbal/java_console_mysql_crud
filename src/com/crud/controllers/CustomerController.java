package com.crud.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.crud.configs.DbConfig;
import com.crud.models.Customer;

public class CustomerController {

	DbConfig config;

	public CustomerController() {
		config = new DbConfig("jdbc:mysql://localhost/db_two", "root", "");
	}

	public void getAll() throws SQLException {

		String query = "Select * from client";
		Statement statement = config.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next()) {

			System.out.println(resultSet.getString("name"));

		}

	}

	public void getOne(int id) throws SQLException {
		String query = "SELECT * FROM client WHERE id=" + id;
		
		Statement statement = config.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next()) {

			System.out.println(resultSet.getString("name"));

		}
	}
	
	public void updateCustomer(int id,Customer customer) throws SQLException {
		String query = "UPDATE client SET name=?,description=?,CIN=? WHERE id=" + id;
		
					PreparedStatement stmt = config.connect().prepareStatement(query);
					// stmt.setInt(1, id);
					stmt.setString(1, customer.getName());
					stmt.setString(2, customer.getDescription());
					stmt.setString(3, customer.getCIN());
					stmt.executeUpdate();
	}
	
	
	public void insertCustomer(Customer customer) throws SQLException {
		String query = "INSERT INTO client(name,description,CIN) VALUES (?,?,?)";
		
					PreparedStatement stmt = config.connect().prepareStatement(query);
//					stmt.setInt(1, 1);
					stmt.setString(1, customer.getName());
					stmt.setString(2, customer.getDescription());
					stmt.setString(3, customer.getCIN());
					stmt.executeUpdate();
					System.out.println("inserted");
	}
	
	public void deleteCustomer(int id) throws SQLException {
		String query = "DELETE FROM client WHERE id=" + id + "";
		
					PreparedStatement stmt = config.connect().prepareStatement(query);
		
					stmt.executeUpdate();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
