//17. Con relación al punto 1 mostrar la suma de los valores pares.
//a. Con if
//b. Sin if, a través de un algoritmo

import java.util.Scanner;

public class Ejer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingresa la 1º nota");
        int evaluacion1 = scanner.nextInt();

        System.out.println("Ingresa la 2º nota");
        int evaluacion2 = scanner.nextInt();

        System.out.println("Ingresa la 2º nota");
        int evaluacion3 = scanner.nextInt();

        int sumaPares = 0;

        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }

        System.out.println("Suma de los valores pares (con if): " + sumaPares);

        sumaPares = (evaluacion1 % 2 == 0 ? evaluacion1 : 0) +
                        (evaluacion2 % 2 == 0 ? evaluacion2 : 0) +
                        (evaluacion3 % 2 == 0 ? evaluacion3 : 0);

        System.out.println("Suma de los valores pares (algortimica): " + sumaPares);
    }
}
