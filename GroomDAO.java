package com.matrimonimanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class GroomDAO {
	
	
	public void addGroom(Groom groom) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.save(groom);
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public  Groom getGroom(int id) {
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            return session.get(Groom.class, id);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public void updateGroom(Groom groom) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.update(groom);
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteGroom(int id) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            Groom groom = session.get(Groom.class, id);
	            if (groom != null) {
	                session.delete(groom);
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

