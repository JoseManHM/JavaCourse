package com.example.herencia.poo;

public class Alumno extends Persona {
    private String escuela;
    private double calificacionMatematicas;
    private double calificacionEspaniol;

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getCalificacionMatematicas() {
        return calificacionMatematicas;
    }

    public void setCalificacionMatematicas(double calificacionMatematicas) {
        this.calificacionMatematicas = calificacionMatematicas;
    }

    public double getCalificacionEspaniol() {
        return calificacionEspaniol;
    }

    public void setCalificacionEspaniol(double calificacionEspaniol) {
        this.calificacionEspaniol = calificacionEspaniol;
    }
}
