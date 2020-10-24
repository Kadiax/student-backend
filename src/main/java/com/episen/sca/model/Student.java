package com.episen.sca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private String age;

	@Column(name = "sex")
	private String sex;

	@Column(name = "redoublant")
	private boolean redoublant;

	@Column(name = "groupstudent")
	private String groupstudent;

	public Student() {
		
	}

	public Student( String firstname, String lastname, String email, String age, String sex, boolean redoublant, String groupstudent) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.sex = sex;
		this.redoublant = redoublant;
		this.groupstudent = groupstudent;
	}

	public Student(long id, String firstname, String lastname, String email, String age, String sex, boolean redoublant, String groupstudent) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.sex = sex;
		this.redoublant = redoublant;
		this.groupstudent = groupstudent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lasttname) {
		this.lastname = lasttname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean getRedoublant() {
		return redoublant;
	}

	public void setRedoublant(boolean redoublant) {
		this.redoublant = redoublant;
	}

	public String getGroupstudent() {
		return groupstudent;
	}

	public void setGroupstudent(String groupstudent) {
		this.groupstudent = groupstudent;
	}
}
