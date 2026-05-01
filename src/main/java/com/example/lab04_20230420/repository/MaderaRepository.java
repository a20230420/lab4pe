package com.example.lab04_20230420.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab04_20230420.entity.tipoMadera;


public interface MaderaRepository extends JpaRepository<tipoMadera,Integer> {
}
