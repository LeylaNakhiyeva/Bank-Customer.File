package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.CurrencyEnum;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Card {
    private Integer customerNo;
    private Long cardNumber;
    private CurrencyEnum currency;


    public Integer getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Card{" +
                "customerNo=" + customerNo +
                ", cardNumber=" + cardNumber +
                ", currency=" + currency +
                '}' +"\n";
    }
}
