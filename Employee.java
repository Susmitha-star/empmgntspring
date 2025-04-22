package com.aits.Employeedemo;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



@Entity

public class Employee {

	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;

	

	private String name;

    private String dept;

    private Long salary;

    

    

    public Employee() {

    	

    }

    

    public Employee(Long id, String name, String dept, Long salary) {

		super();

		this.id = id;

		this.name = name;

		this.dept = dept;

		this.salary = salary;

	}



	public Long getId() {

		return id;

	}



	public void setId(Long id) {

		this.id = id;

	}



	public String getName() {

		return name;

	}



	public void setName(String name) {

		this.name = name;

	}



	public String getDept() {

		return dept;

	}



	public void setDept(String dept) {

		this.dept = dept;

	}



	public Long getSalary() {

		return salary;

	}



	public void setSalary(Long salary) {

		this.salary = salary;

	}

    



}

