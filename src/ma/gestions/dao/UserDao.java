package ma.gestions.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import ma.gestion.beans.User;

public class UserDao {
	public void getUser(int id) {
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

    public void loadUser(int id) {
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

    public void getUserById(int id) {
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

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the user object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
public User connexion(String username,String pswd) {
	Session session = new Configuration().configure().buildSessionFactory().openSession();
	Query q=session.createQuery("Select User From User Where login=:n and password=:i ");  
	q.setParameter("n",username);  
	q.setParameter("i",pswd);  
	User user =(User) q.uniqueResult();
	return user;
}
}
