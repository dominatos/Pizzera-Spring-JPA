package com.example.Pizzerav2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Ordine {

    //private Integer numeroOrdine;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "products_orders",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Prodotto> listaProdotti;
    private LocalDate dataOrdine;
    private Double totale;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdine;

    @Override
    public String toString() {
        return String.format(
                "OrdineID: %d | Cliente: %s | Prodotti: %s | Totale: %.2f€",
                idOrdine,
                cliente.getNome()+" "+ cliente.getCognome(),
                listaProdotti.stream()
                        .map(p -> String.format("%s (%.2f€)", p.getNome(), p.getPrezzo()))
                        .collect(Collectors.joining(", ")),
                totale
        );
    }




}
