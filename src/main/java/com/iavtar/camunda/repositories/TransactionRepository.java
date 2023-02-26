package com.iavtar.camunda.repositories;

import com.iavtar.camunda.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    Transaction findByTransactionId(String transactionId);

}
