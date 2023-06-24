import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrse el numero");

        int numero = scanner.nextInt();
        if (numero >= 1 && numero<=12 || numero >=13 && numero<=24 || numero >=25 && numero <=36){
            if(numero >= 1 && numero<=12)
                System.out.println("El numero pertenece a la primera docena");
            else if (numero >=13 && numero<=24)
                System.out.println("El numero pertenece a la segunda docena");
            else if (numero >=25 && numero <=36)
                System.out.println("El numero pertenece a la tercera docena");
        }
        else
            System.out.println("El numero " + numero + " esta fuera de rango");
    }
}
