//Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
//Es decir, A es antisimétrica si A = -AT.
//La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package act5;

import java.util.Scanner;

public class Act5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int f, c;
        int[][] matriz = new int[4][4];
        int[][] trasp = new int[4][4];
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                matriz[f][c] = (int) (Math.random()*9);
            }
        }
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                trasp[c][f] = matriz[f][c];
            }
        }
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                System.out.print("["+matriz[f][c]+"]");
            }
            System.out.println("   ");
        }
        System.out.println("--------------");
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 4; c++) {
                System.out.print("["+trasp[f][c]+"]");
            }
            System.out.println("   ");
        }
    }
}
