import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        /*int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ultimo = numeros[9];


        for(int i = numeros.length-1; i >= 1; i--){
            numeros[i] = numeros[i-1];
        }
        numeros[0] = ultimo;
        System.out.println(Arrays.toString(numeros));
//---------------------------------------------------------------------------------------------------------

        int[] ramdon = new int[20];
        for (int i = 0; i < ramdon.length; i++) {
            ramdon[i] = rand.nextInt(100);
        }

        int pares = 0;
        int impares = 0;
        for (int i = 0; i < ramdon.length; i++) {
            if (ramdon[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int[] pares1 = new int[pares];
        int[] impares1 = new int[impares];

        int indexpares = 0;
        int indeximpares = 0;


        for(int i = 0; i < ramdon.length;i++){
            if(ramdon[i] % 2 == 0){
                pares1[indexpares] = ramdon[i];
                indexpares ++;
            }else {
                impares1[indeximpares] = ramdon[i];
                indeximpares++;
            }
        }

        System.out.println(Arrays.toString(pares1));
        System.out.println(Arrays.toString(impares1));
//-------------------------------------------------------------------------------------------------
        Scanner orden = new Scanner(System.in);
        int numero;
        int[] arrayOrden = new int[5];
        int temp;
        for (int i = 0; i < 5; i++) {
            System.out.println("pon numero ");
            arrayOrden[i] = orden.nextInt();
        }//Diagrama de BUrbuja
            for (int i = 0; i < arrayOrden.length - 1; i++) {
                for (int j = 0; j < arrayOrden.length - i - 1; j++) {
                    if (arrayOrden[j] > arrayOrden[j + 1]) {
                        temp = arrayOrden[j];
                        arrayOrden[j] = arrayOrden[j + 1];
                        arrayOrden[j + 1] = temp;
                    }

                }

            }
        System.out.println(Arrays.toString(arrayOrden));*/

        //-----------------------------------------------------------------------------------------------

        int[][] tabla = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = i + j;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
