import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int Num1;
        int Num2;
        int Seleccion;
        do {

            System.out.println("1. Sumar Numeros");
            System.out.println("2. Dividir Numeros");
            System.out.println("3. Salir");
            Seleccion = n.nextInt();

            switch (Seleccion) {
                case 1:
                    int Suma;
                    System.out.println("Ingrese el primer numero");
                    Num1 = n.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    Num2 = n.nextInt();
                    Suma = Num1 + Num2;
                    System.out.println("La suma de los numeros es de: " + Suma);
                    break;
                case 2:
                    float Division;
                    System.out.println("Ingrese el primer numero");
                    Num1 = n.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    Num2 = n.nextInt();
                    if (Num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        Division = (float) Num1 / (float) Num2;
                        System.out.println("La division de los numeros es " + Division);
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ingrese una opcion Correcta");
                    break;
            }

        }

        while (Seleccion != 3);
    }

}
