package com.java.app.hogar;

public class Persona {
    private String nombre;
    public static String GENERO = "Masculino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String lanzarPelota(){
        return "Lanza la pelota";
    }

    public static String saludar(){
        return "Hola!";
    }
}
