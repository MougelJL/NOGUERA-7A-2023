import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mes (en minúsculas):");
        String nombreMes = scanner.nextLine();

        int cantidadDias;

        if (nombreMes.equals("enero") || nombreMes.equals("marzo") || nombreMes.equals("mayo") ||
                nombreMes.equals("julio") || nombreMes.equals("agosto") || nombreMes.equals("octubre") ||
                nombreMes.equals("diciembre")) {
            cantidadDias = 31;
        } else if (nombreMes.equals("abril") || nombreMes.equals("junio") || nombreMes.equals("septiembre") ||
                nombreMes.equals("noviembre")) {
            cantidadDias = 30;
        } else if (nombreMes.equals("febrero")) {
            cantidadDias = 28;
        } else {
            System.out.println("Nombre de mes inválido");
            return;
        }

        System.out.println("El mes de " + nombreMes + " tiene " + cantidadDias + " días.");
    }
}
