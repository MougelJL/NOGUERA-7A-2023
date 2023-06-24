//18. Realizar dos ciclos for anidados de manera de mostrar todas las tablas 

public class Ejer18 {
    public static void main(String[] args) {
        System.out.println("Las tablas de multiplicar son:");

        for(int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++){
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
