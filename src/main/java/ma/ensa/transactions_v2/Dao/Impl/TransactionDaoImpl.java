package ma.ensa.transactions_v2.Dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ma.ensa.transactions_v2.Dao.TransactionDao;
import ma.ensa.transactions_v2.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {
    public int save(Transaction trans) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            em.persist(trans);
            em.getTransaction().commit();
        }finally {
            emf.close();
            em.close();
        }

        return 0;
    }

    public List<Transaction> selectAll() {
        List<Transaction> transas= new ArrayList();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        try {
            // Create and execute a query to retrieve all users from the database
            Query query = em.createQuery("SELECT tr FROM Transaction tr");
            transas = query.getResultList();
            System.out.println(transas);
            return transas;
        } finally {
            em.close();
            emf.close();
        }
    }
}

