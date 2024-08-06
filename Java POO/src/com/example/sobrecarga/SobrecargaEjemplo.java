package com.example.sobrecarga;

public class SobrecargaEjemplo {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + Calculadora.sumar(1, 2));
        System.out.println("Sumar int: " + Calculadora.sumar(1, 2, 3));
        System.out.println("Sumar int: " + Calculadora.sumar(1, 2, 3, 4));
        System.out.println("Sumar float: " + Calculadora.sumar(1f, 2f, 4f));
    }
}
