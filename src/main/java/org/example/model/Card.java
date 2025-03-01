package org.example.model;

import lombok.*;
import org.example.enums.CurrencyEnum;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Card {
    private Integer customerNo;
    private Long cardNumber;
    private CurrencyEnum currency;
    private Double balance;
}
