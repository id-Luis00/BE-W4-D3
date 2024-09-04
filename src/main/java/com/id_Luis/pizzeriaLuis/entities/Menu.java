package com.id_Luis.pizzeriaLuis.entities;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
public class Menu {

    List<Pizza> pizze;
    List<Drink> drinks;
    List<Topping> toppings;

    public Menu(List<Pizza> pizze, List<Drink> drinks, List<Topping> toppings) {
        this.pizze = pizze;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public void printMenu() {
        System.out.println("Pizze:");
        pizze.forEach(System.out::println);
        System.out.println("\nDrinks:");
        drinks.forEach(System.out::println);
        System.out.println("\nToppings:");
        toppings.forEach(System.out::println);
    }
}
