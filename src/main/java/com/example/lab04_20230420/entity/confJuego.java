package com.example.lab04_20230420.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "configuracion_juego")
public class confJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "filas")
    private int filas;
    public int getFilas() {
        return filas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }

    @Column(name = "columnas")
    private int columnas;
    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Column(name = "picotazos_maximos")
    private int picotazosMaximos;
    public int getPicotazosMaximos() {
        return picotazosMaximos;
    }
    public void setPicotazosMaximos(int picotazosMaximos) {
        this.picotazosMaximos = picotazosMaximos;
    }

    @Column(name = "picotazos_restantes")
    private int picotazosRestantes;
    public int getPicotazosRestantes() {
        return picotazosRestantes;
    }
    public void setPicotazosRestantes(int picotazosRestantes) {
        this.picotazosRestantes = picotazosRestantes;
    }

    @Column(name = "cacatua_pos_x")
    private int cacatuPosX;
    public int getCacatuPosX() {
        return cacatuPosX;
    }
    public void setCacatuPosX(int cacatuPosX) {
        this.cacatuPosX = cacatuPosX;
    }

    @Column(name = "cacatua_pos_y")
    private int cacatuPosY;
    public int getCacatuPosY() {
        return cacatuPosY;
    }
    public void setCacatuPosY(int cacatuPosY) {
        this.cacatuPosY = cacatuPosY;
    }

    @Column(name = "pienso_pos_x")
    private int piensoPosX;
    public int getPiensoPosX() {
        return piensoPosX;
    }
    public void setPiensoPosX(int piensoPosX) {
        this.piensoPosX = piensoPosX;
    }

    @Column(name = "pienso_pos_y")
    private int piensoPosY;
    public int getPiensoPosY() {
        return piensoPosY;
    }
    public void setPiensoPosY(int piensoPosY) {
        this.piensoPosY = piensoPosY;
    }

    @Column(name = "estado_juego")
    private String estadoJuego;
    public String getEstadoJuego() {
        return estadoJuego;
    }
    public void setEstadoJuego(String estadoJuego) {
        this.estadoJuego = estadoJuego;
    }

}
