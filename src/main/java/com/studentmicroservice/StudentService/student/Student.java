package com.studentmicroservice.StudentService.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Student {

	@TableGenerator(name = "Address_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", 
			valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 10002, allocationSize = 100)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen")
	private Long id;
	private String firstName;
	private String lastName;
	private String DOB;
	private String major;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String DOB, String major) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.DOB = DOB;
		this.major = major;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", major="
				+ major + "]";
	}
}
