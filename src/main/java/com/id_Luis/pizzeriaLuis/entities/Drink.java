package com.id_Luis.pizzeriaLuis.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink extends prodotto{

    private String nome;
    private double quantita;

    public Drink(int cal, double prezzo, String nome, double quantita) {
        super(cal, prezzo);
        this.nome = nome;
        this.quantita = quantita;
    }
}
