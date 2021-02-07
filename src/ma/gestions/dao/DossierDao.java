package ma.gestions.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ma.gestion.beans.Dossier;

public class DossierDao {
	public void getDossier(int id) {
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

    public void loadDossier(int id) {
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

    public void getDossierById(int id) {
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

    public void saveDossier(Dossier dossier) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the dossier object
            session.save(dossier);
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
