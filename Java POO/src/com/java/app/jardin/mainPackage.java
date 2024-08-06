package com.java.app.jardin;

import com.java.app.hogar.*;
import static com.java.app.hogar.Persona.saludar;
import static com.java.app.hogar.Persona.GENERO;

public class mainPackage {
    public static void main(String[] args) {
        //Importar un paquete
        Persona p = new Persona();
        p.setNombre("Manuel");
        System.out.println("p = " + p.getNombre());

        //Gato gato = new Gato();

        Perro perro = new Perro();
        perro.raza = "Bulldog";

        String jugar = perro.jugar(p);
        System.out.println(jugar);

        //Importando metodo estatico
        String saludo = saludar();
        System.out.println(saludo);

        String genero = GENERO;
        System.out.println(genero);
    }
}
