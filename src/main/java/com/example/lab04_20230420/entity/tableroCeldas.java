package com.example.lab04_20230420.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tablero_celdas")

public class tableroCeldas {
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

    @ManyToOne
    @JoinColumn(name = "nivel_resistencia")
    private tipoMadera nivelResistencia;
    public tipoMadera getNivelResistencia() {
        return nivelResistencia;
    }
    public void setNivelResistencia(tipoMadera nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public tableroCeldas() {}
}
