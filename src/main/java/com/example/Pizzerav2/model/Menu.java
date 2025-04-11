package com.example.Pizzerav2.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;



@AllArgsConstructor
@Getter
@Setter

@Builder
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
    List<Prodotto> listaProdotti = new ArrayList<>();
        private String nome;



    public Menu() {
        this.listaProdotti = new ArrayList<Prodotto>();

    }











}
