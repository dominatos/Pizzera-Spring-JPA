package com.example.Pizzerav2.repository;

import com.example.Pizzerav2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAORepository extends JpaRepository<Cliente, Integer> {
}
