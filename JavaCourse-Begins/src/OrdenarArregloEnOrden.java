import java.util.Scanner;

public class OrdenarArregloEnOrden {
    public static void main(String[] args) {
        //Dado un arreglo ordenado donde se tengan que insertar los 6 elementos dejando un hueco al final, pedir un numero y ponerlo en la posicion
        //del arreglo segun le corresponda, pidiendo solo el valor del nuevo elemento
        int[] a = new int[7];
        int numero, posicion;
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length - 1; i++){
            System.out.println("Ingresa un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingresa el nuevo valor: ");
        numero = s.nextInt();
        posicion = 0;

        while(posicion < a.length - 1 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }
        a[posicion] = numero;

        for(int i = 0; i < a.length; i++){
            System.out.println("Indice: " + i + ", Valor: " + a[i]);
        }

        //Crear una copia de un arreglo menos el ultimo elemento
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);

        System.out.println("Copia de arreglo");
        for(int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }
    }
}
