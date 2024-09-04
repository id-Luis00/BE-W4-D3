package com.id_Luis.pizzeriaLuis.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter

public class Pizza extends prodotto{

    private String nome;
    private List<Topping> toppings;
    private boolean isXL;


    public Pizza(int cal, double prezzo, String nome, List<Topping> toppings, boolean isXL) {
        super(cal, prezzo);
        this.nome = nome;
        this.toppings = toppings;
        this.isXL = isXL;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppings +
                ", isXL=" + isXL +
                ", cal=" + cal +
                ", prezzo=" + prezzo +
                '}';
    }
}
