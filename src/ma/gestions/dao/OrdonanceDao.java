package ma.gestions.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ma.gestion.beans.Ordonance;

public class OrdonanceDao {
	public void getOrdonance(int id) {
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

    public void loadOrdonance(int id) {
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

    public void getOrdonanceById(int id) {
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

    public void saveOrdonance(Ordonance ordonance) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the ordonance object
            session.save(ordonance);
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
