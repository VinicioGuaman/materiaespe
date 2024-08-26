/*********BY VINICIO GUAMÁN PUNTONET.EC USER DEV005 V06********/

package com.mycompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer estudianteId;
    private Integer usuarioId;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Integer carreraId;

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public Integer getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Integer carreraId) {
        this.carreraId = carreraId;
    }
}
