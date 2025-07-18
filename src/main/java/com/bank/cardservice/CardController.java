package com.bank.cardservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/cards")
public class CardController {

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable("id") Long id) {
        return new Card(id, 1L, ZonedDateTime.now(), BigDecimal.TEN);
    }

}
