package ma.gestions.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ma.gestion.beans.Visite;

public class VisiteDao {
	public void getVisite(int id) {
        Transaction transaction = null;
        try (Session session  = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();


            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void loadVisite(int id) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void getVisiteById(int id) {
        Transaction transaction = null;
        try (Session session  = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

        
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void saveVisite(Visite visite) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the visite object
            session.save(visite);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
