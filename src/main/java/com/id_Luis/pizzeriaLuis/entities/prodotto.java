package com.id_Luis.pizzeriaLuis.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class prodotto {

    protected int cal;
    protected double prezzo;

    public prodotto(int cal, double prezzo) {
        this.cal = cal;
        this.prezzo = prezzo;
    }
}
