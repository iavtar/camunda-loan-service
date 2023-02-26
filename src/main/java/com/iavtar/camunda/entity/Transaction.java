package com.iavtar.camunda.entity;

import com.iavtar.camunda.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private State state;

}
