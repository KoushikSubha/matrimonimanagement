package com.matrimonimanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BrideDAO {

	

	public void addBride(Bride bride) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(bride);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Bride getBride(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Bride.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void updateBride(Bride bride) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.update(bride);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteBride(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			Bride bride = session.get(Bride.class, id);
			if (bride != null) {
				session.delete(bride);
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
