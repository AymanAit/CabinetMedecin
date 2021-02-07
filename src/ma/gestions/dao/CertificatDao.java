package ma.gestions.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ma.gestion.beans.Certificat;

public class CertificatDao {
	public void getCertificat(int id) {
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

    public void loadCertificat(int id) {
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

    public void getCertificatById(int id) {
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

    public void saveCertificat(Certificat certificat) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the certificat object
            session.save(certificat);
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
