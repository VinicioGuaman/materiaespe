/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carreraId;
    private Integer departamentoId;
    private String nombreCarrera;
    private Integer numNivel;

    // Getters y Setters
    public Integer getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Integer carreraId) {
        this.carreraId = carreraId;
    }

    public Integer getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Integer departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Integer getNumNivel() {
        return numNivel;
    }

    public void setNumNivel(Integer numNivel) {
        this.numNivel = numNivel;
    }
}
