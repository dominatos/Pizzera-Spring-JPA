package com.example.Pizzerav2.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Builder
@Entity

public class Drink extends Prodotto {

    private double gradazione;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Drink(String nome,Double gradazione, double prezzo, Menu menu) {
        super(nome, prezzo, menu);


//ss
    }

    @Override
    public String toString() {
        return ""
                + super.getNome()  +
                " Gradazione: " + gradazione +
                "° prezzo: " + super.getPrezzo()+"€";
    }


}
