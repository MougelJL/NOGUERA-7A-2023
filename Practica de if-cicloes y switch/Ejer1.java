import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera evaluacion:");
        int evaluacion1 = scanner.nextInt();

        System.out.println("Ingrese la segunda evaluacion:");
        int evaluacion2 = scanner.nextInt();

        System.out.println("Ingrese la tercera evaluacion:");
        int evaluacion3 = scanner.nextInt();

        int promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            System.out.println("El alumno ha aprobado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno ha reprobado con un promedio de " + promedio);
        }
    }
}
