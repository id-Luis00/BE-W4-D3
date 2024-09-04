package com.id_Luis.pizzeriaLuis.entities;

import com.id_Luis.pizzeriaLuis.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Calendar;
import java.util.List;


@Getter
@Setter
@ToString
public class Ordine {
    private Tavolo tavolo;
    private int numOrdine;
    private List<prodotto> prodottiAcq;
    private StatoOrdine statoOrdine;
    private int numCoperti;
    private int oraAcquisizione;

    public Ordine(Tavolo tavolo, int numOrdine, List<prodotto> prodottiAcq, int numCoperti) {
        this.tavolo = tavolo;
        this.numOrdine = numOrdine;
        this.prodottiAcq = prodottiAcq;
        this.statoOrdine = StatoOrdine.in_corso;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

    }

    public double importoTotale(double coperto){
        return this.prodottiAcq.stream().mapToDouble(prodotto -> prodotto.getPrezzo()).sum() + this.numCoperti * coperto;
    }
}
