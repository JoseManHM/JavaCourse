package com.example.sobrecarga;

public class Calculadora {
    /*public int sumar(int a, int b){
        return a + b;
    }*/

    public static int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total += i;
        }
        return total;
    }

    /*public float sumar(float a, float b){
        return a + b;
    }*/
    public static float sumar(float... argumentos){
        float total = 0f;
        for(float i : argumentos){
            total += i;
        }
        return total;
    }
}
