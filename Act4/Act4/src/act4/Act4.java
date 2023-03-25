//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
//La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
package act4;

import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {
//        Scanner leer = new Scanner (System.in);
        int f,c;
        int[][] matriz = new int[4][4];
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                matriz[f][c] = (int) (Math.random()*10);
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------");
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                matriz[f][c] = (int) (Math.random() * (10));
                System.out.print(matriz[c][f] + " ");
            }
            System.out.println(" ");
        }
    }
}
