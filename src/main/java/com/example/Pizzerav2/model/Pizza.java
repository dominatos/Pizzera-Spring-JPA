package com.example.Pizzerav2.model;

import com.example.Pizzerav2.utility.StringListConverter;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Builder
@Entity

public class Pizza extends Prodotto {

    @Convert(converter = StringListConverter.class)
    private List<String>  ingredienti=new ArrayList<String>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Pizza(String nome, double prezzo, Menu menu) {
        super(nome, prezzo, menu);
        ingredienti.add("base");


    }
    public void addIngred(String ingred){

        this.ingredienti.add(ingred);
    }
    public String listaIngredienti() {
        return String.join(", ", ingredienti);
    }

    @Override
    public String toString() {
        return "Pizza "
                + super.getNome()  +
                " ingredient: " + listaIngredienti() +
                " prezzo: " + super.getPrezzo()+"€";
    }

    public void setListaIngredienti(List<String> ingredientiPizza) {
        this.ingredienti = ingredientiPizza;

    }




}
