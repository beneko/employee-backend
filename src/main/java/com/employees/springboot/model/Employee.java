package com.employees.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name= "score")
	private int score;
	
	@Column(name= "arret_maladie")
	private boolean malade;
	
	@Column(name= "date_embauche")
	@Temporal(TemporalType.DATE)
	private Date embaucheDate;
	
	public Employee() {

	}
	
	public Employee(Long id, String firstName, String lastName, String emailId, int score, boolean malade,
			Date embaucheDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.score = score;
		this.malade = malade;
		this.embaucheDate = embaucheDate;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isMalade() {
		return malade;
	}

	public void setMalade(boolean malade) {
		this.malade = malade;
	}

	public Date getEmbaucheDate() {
		return embaucheDate;
	}

	public void setEmbaucheDate(Date embaucheDate) {
		this.embaucheDate = embaucheDate;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", score=" + score + ", malade=" + malade + ", embaucheDate=" + embaucheDate + "]";
	}
}
