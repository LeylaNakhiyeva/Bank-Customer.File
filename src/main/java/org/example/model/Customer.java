package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Customer implements Serializable {
    private static long serialVersionUUID = 1L;
    private Integer customerNo;
    private String name;
    private String surname;
    private List<Card> cards = new ArrayList<>();

    public Customer(Integer customerNo, String name, String surname){
        this.customerNo = customerNo;
        this.name = name;
        this.surname = surname;
    }

@Override
    public String toString(){
    return "customerNo: "+customerNo+"     name: "+name+"      surname: "+surname;
}
}
