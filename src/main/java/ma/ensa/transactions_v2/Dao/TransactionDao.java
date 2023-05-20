package ma.ensa.transactions_v2.Dao;

import ma.ensa.transactions_v2.Transaction;

import java.util.List;

public interface TransactionDao {
    int save(Transaction transaction) ;
    List<Transaction> selectAll();
}
