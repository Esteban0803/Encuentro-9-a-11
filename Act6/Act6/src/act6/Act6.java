//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
//Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
//El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
package act6;

import java.util.Scanner;

public class Act6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int f = 0;
        int c = 0;
        int count = 0;
        int x, y, d;
        int[][] matriz = new int[3][3];
           for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.println("Ingrese la fila " + x);
                d = leer.nextInt();
                matriz[x][y] = d;
            }
            }
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                f += matriz[x][y];
                c += matriz[y][x];
            }
            if (isIqual(f, c)) {
                count++;
                if (count == 3) {
                    System.out.println("Felicidades, es magico");
                    mostrar(matriz);
                } else {
                    f = 0;
                    c = 0;
                }
            } else {
                System.out.println("Esto no es magico");
                mostrar(matriz);
                return;
            }
        }
    }
//[4][5][6]   
//[5][4][6]   
//[5][6][7] 
    public static boolean isIqual(int f, int c) {
        return f == c;
    }

    public static void mostrar(int[][] matriz) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("[" + matriz[x][y] + "]");
            }
            System.out.println("   ");
        }
    }
}
