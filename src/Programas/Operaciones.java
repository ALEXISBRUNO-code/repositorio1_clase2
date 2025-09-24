
package Programas;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        int n1, n2, suma, resta;

        Scanner lectura = new Scanner(System.in);

        System.out.print("INGRESA EL PRIMER NUMERO 1: ");
        n1 = lectura.nextInt();

        System.out.print("INGRESA EL SEGUNDO NUMERO 2: ");
        n2 = lectura.nextInt();

        suma = n1 + n2;
        resta = n1 - n2;

        System.out.println("LA SUMA ES: " + suma);
        System.out.println("LA RESTA ES: " + resta);
    }
}
