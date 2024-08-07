package com.example.herencia;

import com.example.herencia.poo.Alumno;
import com.example.herencia.poo.AlumnoInternacional;
import com.example.herencia.poo.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lopez");
        alumno.setEscuela("Instituto Tecnologico de P");
        alumno.setCalificacionEspaniol(8.5);
        alumno.setCalificacionMatematicas(8.3);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("John");
        alumnoInternacional.setApellido("Doe");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(24);
        alumnoInternacional.setEscuela("Melbourne Institute Technology");
        alumnoInternacional.setCalificacionIdiomas(9.0);
        alumnoInternacional.setCalificacionEspaniol(8.5);
        alumnoInternacional.setCalificacionMatematicas(9.2);

        Profesor profesor = new Profesor();
        profesor.setNombre("Oscar");
        profesor.setApellido("Ibarra");
        profesor.setAsignatura("Espaniol");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " - " + alumno.getEscuela());
        System.out.println("Profesor: " + profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(alumnoInternacional.getNombre() + " " + alumnoInternacional.getApellido());
        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println("Hija: " + hija);
            System.out.println("Padre: " + padre);
            clase = clase.getSuperclass();
        }
    }
}
