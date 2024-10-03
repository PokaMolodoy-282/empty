package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

//public class UserDaoHibernateImpl implements UserDao {
//    private EntityManagerFactory entityManagerFactory;
//
//    public UserDaoHibernateImpl() {
//        this.entityManagerFactory = Util.getEntityManagerFactory();
//    }
//
//
//    @Override
//    public void createUsersTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS users (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), lastName VARCHAR(255), age TINYINT)";
//        executeUpdate(sql);
//    }
//
//    @Override
//    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users";
//        executeUpdate(sql);
//    }
//
//    @Override
//    public void saveUser(User user) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        Transaction transaction = (Transaction) em.getTransaction();
//        try {
//            transaction.begin();
//            em.persist(user);
//            transaction.commit();
//            System.out.println("User с именем " + user.getName() + " добавлен в базу данных");
//        } catch (Exception e) {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            em.close();
//        }
//    }
//
//    @Override
//    public void removeUserById(long id) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        Transaction transaction = (Transaction) em.getTransaction();
//        try {
//            transaction.begin();
//            User user = em.find(User.class, id);
//            if (user != null) {
//                em.remove(user);
//            }
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            em.close();
//        }
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        List<User> users = null;
//        try {
//            users = em.createQuery("FROM User", User.class).getResultList();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            em.close();
//        }
//        return users;
//    }
//
//    @Override
//    public void cleanUsersTable() {
//        String sql = "DELETE FROM users";
//        executeUpdate(sql);
//    }
//
//    private void executeUpdate(String sql) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        Transaction transaction = (Transaction) em.getTransaction();
//        try {
//            transaction.begin();
//            em.createNativeQuery(sql).executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            em.close();
//        }
//    }
//}
