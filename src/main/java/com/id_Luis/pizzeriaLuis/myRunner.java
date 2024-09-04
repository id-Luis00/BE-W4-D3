package com.id_Luis.pizzeriaLuis;

import com.id_Luis.pizzeriaLuis.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class myRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    private Pizza pizzaMargherita;
    @Autowired
    private Drink cocaCola;
    @Autowired
    private Tavolo tavolo1;
    @Autowired
    private double coperto;




    @Override
    public void run(String... args) throws Exception {

            menu.printMenu();

           // Ordine ordine = new Ordine((Tavolo) ctx.getBean("tavolo1"), 10, Arrays.asList(ctx.getBean("pizzaMargherita"), ctx.getBean("cocaCola")), 4, ctx.getBean("coperto"));
            Ordine ordine = new Ordine(tavolo1, 10, Arrays.asList(pizzaMargherita, cocaCola), 4);
        ordine.getProdottiAcq().forEach(prod -> System.out.println(prod.getPrezzo()));
        System.out.println(coperto);
        System.out.println("\nimporto totale dell'ordine: " + ordine.importoTotale(coperto));


    }
}
