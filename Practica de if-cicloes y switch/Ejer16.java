//16. Realizar un programa que permita mostrar en pantalla la tabla de multiplicar de un valor
//ingresado a través de una variable.

import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de la tabla de multiplicar");

        int numero = scanner.nextInt();
        int c = 1;

        System.out.println("La tabla de multiplicar es:");
        while(c<11){
            System.out.print(numero * c + " ");
            c++;
        }
    }
}
