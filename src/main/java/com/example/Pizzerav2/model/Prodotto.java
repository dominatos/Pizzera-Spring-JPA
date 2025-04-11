package com.example.Pizzerav2.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Prodotto  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, columnDefinition="Decimal(4,2) default '6.00'")
    private Double prezzo;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public Prodotto(String nome, Double prezzo, Menu menu) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.menu = menu;
    }

//    public Prodotto(String nome, double prezzo) {
//    }

}
