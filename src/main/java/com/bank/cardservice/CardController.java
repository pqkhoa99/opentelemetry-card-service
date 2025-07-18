package com.bank.cardservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardRepository cardRepository;

    @GetMapping("/{id}")
    public Card getCardById(@PathVariable("id") Long id) {
        return this.cardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id %d".formatted(id)));
    }

}
