package com.example.lab04_20230420.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab04_20230420.entity.confJuego;
public interface EstadoJuegoRepository extends JpaRepository<confJuego,Integer> {
}
