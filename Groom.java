package com.matrimonimanagement;

import javax.persistence.*;

@Entity
@Table(name = "grooms")

public class Groom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "qualification")
	private String qualification;

	@Column(name = "profession")
	private String profession;

	@Column(name = "marital_status")
	private String maritalStatus;

	@Column(name = "preferences")
	private String preferences;

	@Column(name = "income")
	private long income;

	@OneToOne
	@JoinColumn(name = "bride_id")
	private Bride bride;

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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public Bride getBride() {
		return bride;
	}

	public void setBride(Bride bride) {
		this.bride = bride;
	}

	@Override
	public String toString() {
		return "Groom [id=" + id + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", profession=" + profession + ", maritalStatus=" + maritalStatus + ", preferences=" + preferences
				+ ", income=" + income + ", bride=" + bride + "]";
	}

	public Groom(int id, String name, int age, String qualification, String profession, String maritalStatus,
			String preferences, long income, Bride bride) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.profession = profession;
		this.maritalStatus = maritalStatus;
		this.preferences = preferences;
		this.income = income;
		this.bride = bride;
	}
	

	public Groom() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	// Constructors, getters, and setters
	
	
}
