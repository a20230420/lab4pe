package com.example.lab04_20230420.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_madera")
public class tipoMadera {
    @Id
    @Column(name = "nivel_resistencia")
    private int nivelResistencia;
    public int getNivelResistencia() {
        return nivelResistencia;
    }
    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    @Column(name = "nombre_capa")
    private String nombreCapa;
    public String getNombreCapa() {
        return nombreCapa;
    }
    public void setNombreCapa(String nombreCapa) {
        this.nombreCapa = nombreCapa;
    }

    @Column(name = "color_hex")
    private String colorHex;
    public String getColorHex() {
        return colorHex;
    }
    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    @Column(name = "descripcion")
    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
