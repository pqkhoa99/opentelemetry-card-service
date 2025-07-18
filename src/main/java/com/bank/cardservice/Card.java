package com.bank.cardservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "card")
@Getter
@NoArgsConstructor
public class Card {
    @Id
    Long id;

    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "order_date")
    ZonedDateTime orderDate;

    @Column(name = "total_amount")
    BigDecimal totalAmount;
}
