package com.matrimonimanagement;

import javax.persistence.*;

@Entity
@Table(name = "brides")
public class Bride {

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

	@OneToOne(mappedBy = "bride", cascade = CascadeType.ALL)
	private Groom groom;

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

	public Groom getGroom() {
		return groom;
	}

	public void setGroom(Groom groom) {
		this.groom = groom;
	}

	public Bride() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bride [id=" + id + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", profession=" + profession + ", maritalStatus=" + maritalStatus + ", preferences=" + preferences
				+ ", income=" + income + ", groom=" + groom + "]";
	}

	public Bride(int id, String name, int age, String qualification, String profession, String maritalStatus,
			String preferences, long income, Groom groom) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.profession = profession;
		this.maritalStatus = maritalStatus;
		this.preferences = preferences;
		this.income = income;
		this.groom = groom;
	}

	// Constructors, getters, and setters
	

}
