package org.example.model;

import lombok.*;
import org.example.enums.CurrencyEnum;

@Data
@NoArgsConstructor
public class Card {
    private Integer customerNo;
    private Long cardNumber;
    private CurrencyEnum currency;
    private Double balance;
    private Long transactionNo;
    private double amount;

    public Card(Integer customerNo, Long cardNumber, CurrencyEnum currency, Double balance) {
        this.customerNo = customerNo;
        this.cardNumber = cardNumber;
        this.currency = currency;
        this.balance = balance;
    }
}
