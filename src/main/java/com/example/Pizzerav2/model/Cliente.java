package com.example.Pizzerav2.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Builder
@Entity
@Table(name = "clients")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(nullable = false)
    private String telefono;

    public Cliente(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;

    }
    @Override
    public String toString() {
        return String.format(
                "Client ID: %d | Nome: %s | Cognome: %s | TEL.: %s",
                id,
                nome,
                cognome,
                telefono
        );
    }
}
