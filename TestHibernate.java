package com.matrimonimanagement;

public class TestHibernate {

	 public static void main(String[] args) {
	        // Test Bride CRUD Operations
	        BrideDAO brideDAO = new BrideDAO();

	        Bride bride = new Bride();
	        bride.setName("Subha_Paramanik");
	        bride.setAge(25);
	        bride.setQualification("B.TECH");
	        bride.setMaritalStatus("Single");
	        bride.setProfession("Engineer");
	        bride.setPreferences("Good Income");
	        bride.setIncome(100);
	        
	        // Set other bride properties
	        brideDAO.addBride(bride);

	        Bride retrievedBride = brideDAO.getBride(1);
	        System.out.println("Retrieved Bride: " + retrievedBride.getName());

	        retrievedBride.setAge(26);
	        brideDAO.updateBride(retrievedBride);

	        //2brideDAO.deleteBride(1);

	        // Test Groom CRUD Operations
	        GroomDAO groomDAO = new GroomDAO();

	        Groom groom = new Groom();
	        groom.setName("Riya_Benerjee");
	        groom.setAge(28);
	        groom.setMaritalStatus("Single");
	        groom.setProfession("Nurse");
	        groom.setQualification("Nurse ");
	        groom.setPreferences("Good Income");
	        groom.setIncome(30000);
	        // Set other groom properties
	        groomDAO.addGroom(groom);
	     

	        Groom retrievedGroom = groomDAO.getGroom(1);
	        System.out.println("Retrieved Groom: " + retrievedGroom.getName());

	        retrievedGroom.setAge(29);
	        groomDAO.updateGroom(retrievedGroom);

	        //1groomDAO.deleteGroom(1);
	    }
	}