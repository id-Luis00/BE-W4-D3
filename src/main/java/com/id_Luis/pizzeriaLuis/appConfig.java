package com.id_Luis.pizzeriaLuis;

import com.id_Luis.pizzeriaLuis.entities.*;
import com.id_Luis.pizzeriaLuis.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@Configuration
@PropertySource("application.properties")
public class appConfig {

    @Bean
    public Pizza pizzaMargherita(){
        return new Pizza(100, 10.0, "Margherita", Arrays.asList(pomodoro(), mozzarella()), false);
    }
    @Bean
    public Pizza pizzaMargheritaXL(){
        return new Pizza(100, 10.0, "Margherita", Arrays.asList(pomodoro(), mozzarella()), true);
    }

    @Bean
    public Topping pomodoro(){
        return new Topping(10, 3.0, "pomodoro");
    }
    @Bean
    public Topping mozzarella(){
        return new Topping(4, 3.0, "mozzarella");
    }

    @Bean
    public Drink cocaCola(){
        return new Drink(200, 3.50, "coca-cola", 66.0);
    }


    @Bean
    public Menu menu(){
    return new Menu(
        Arrays.asList(pizzaMargherita(), pizzaMargheritaXL()),
        Arrays.asList(cocaCola()),
        Arrays.asList(pomodoro(), mozzarella()));
    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, 5, StatoTavolo.libero);
    }

    @Bean
    public double coperto(@Value("${prezzo.coperto}") String coperto) {
        return Double.parseDouble(coperto);
    }


}
