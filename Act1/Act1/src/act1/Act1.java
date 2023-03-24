//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
package act1;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] numeros=new int[101];
        for (int i=100;i > 0;i--){
            numeros[i]= i-1;
            System.out.println(i);
        }
    }
}
