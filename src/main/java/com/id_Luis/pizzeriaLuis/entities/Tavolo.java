package com.id_Luis.pizzeriaLuis.entities;

import com.id_Luis.pizzeriaLuis.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int numero;
    private int numMaxCoperti;
    private StatoTavolo statoTavolo;



}
