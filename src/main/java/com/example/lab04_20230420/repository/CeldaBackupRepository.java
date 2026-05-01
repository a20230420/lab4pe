package com.example.lab04_20230420.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab04_20230420.entity.tableroInicialBackup;


public interface CeldaBackupRepository extends JpaRepository<tableroInicialBackup,Integer> {
}
