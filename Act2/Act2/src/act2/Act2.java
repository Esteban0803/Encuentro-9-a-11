//Realizar un algoritmo que llene un vector de tamaño N con 
//valores aleatorios y le pida al usuario un número a buscar en el vector. 
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido
package act2;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n,i;
        int rep = 0;
        System.out.println("Ingresa un numero que sera tamaño del vector");
        n = sc.nextInt();
        int[] vector = new int[n];
        for (i = 0; i < n; i++) {
            int x = (int) (Math.random()*10);
            vector[i] = x;
        }
        System.out.println("ingrese un numero a buscar");
        n1 = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (n1 == vector[i]) {
                System.out.println("El numero ha sido encontrado en la posicion " + i + " del vector.");
                rep++;
                if (rep > 1) {
                    System.out.println("El numero se encuentra repetido");
                }
            }
        }
    }
}
