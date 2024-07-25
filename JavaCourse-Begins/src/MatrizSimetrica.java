public class MatrizSimetrica {
    public static void main(String[] args) {
        // VALIDAR SI LA MATRIZ ES SIMETRICA
        System.out.println(">>>>>>>>>> MATRIZ SIMETRICA <<<<<<<<<<<");
        boolean esSimetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        salir: for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                if(matriz[i][j] != matriz[j][i]){
                    esSimetrica = false;
                    break salir;
                }
            }
        }

        if(esSimetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }

        //CREAR UNA MATRIZ TRANSPUESTA
        System.out.println(">>>>>>>>>> MATRIZ TRANSPUESTA <<<<<<<<<<<");

        int[][] matriz2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        int aux;
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz2[i][j];
                matriz2[i][j] = matriz2[j][i];
                matriz2[j][i] = aux;
            }
        }
        System.out.println();
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
