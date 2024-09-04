package com.id_Luis.pizzeriaLuis.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Topping extends prodotto{

    private String name;

    public Topping(int cal, double prezzo, String name) {
        super(cal, prezzo);
        this.name = name;
    }
}
