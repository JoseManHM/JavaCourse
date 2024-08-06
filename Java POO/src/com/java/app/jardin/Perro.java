package com.java.app.jardin;

import com.java.app.hogar.Persona;

public class Perro {
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
