package com.bank.cardservice;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record Card(
        Long id,
        Long customerId,
        ZonedDateTime issuedDate,
        BigDecimal totalAmount
) {
}
