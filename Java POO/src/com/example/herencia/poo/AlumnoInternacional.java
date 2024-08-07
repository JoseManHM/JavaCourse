package com.example.herencia.poo;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double calificacionIdiomas;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getCalificacionIdiomas() {
        return calificacionIdiomas;
    }

    public void setCalificacionIdiomas(double calificacionIdiomas) {
        this.calificacionIdiomas = calificacionIdiomas;
    }
}
