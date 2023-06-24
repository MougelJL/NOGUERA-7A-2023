import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la clase del auto (a, b o c):");
        char clase = scanner.next().charAt(0);

        switch (clase) {
            case 'a':
                System.out.println("El auto de clase 'a' tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("El auto de clase 'b' tiene 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println("El auto de clase 'c' tiene 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println("Clase de auto inválida.");
                break;
        }
    }
}
