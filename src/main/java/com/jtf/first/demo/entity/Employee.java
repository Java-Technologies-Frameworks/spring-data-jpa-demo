package com.jtf.first.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qualigytech_employees")
public class Employee {

	@Id
	@Column (name = "Employee_ID")
	private int id;

	@Column (name = "Employee_Name")
	private String name;

	@Column (name = "Employee_Age")
	private int age;

	@Column (name = "Employee_Email")
	private String email;
	
	@Column (name = "Employee_Salary")
	private int salary;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", salary=" + salary
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getEmail()="
				+ getEmail() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
