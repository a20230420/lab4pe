package com.example.lab04_20230420.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablero_inicial_backup")
public class tableroInicialBackup {
    @Column(name = "pos_x")
    private int posX;
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Column(name = "pos_y")
    private int posY;
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Column(name = "nivel_resistencia")
    private int nivelResistencia;
    public int getNivelResistencia() {
        return nivelResistencia;
    }
    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }
}
