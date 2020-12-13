package com.crud.models;

public class Customer {
	private int id;
	private String name;
	private String description;
	private String CIN;

	public Customer( String name, String description, String CIN) {
		this.name = name;
		this.description = description;
		this.CIN = CIN;
	}

	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

}
