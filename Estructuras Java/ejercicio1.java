// Ejercicio q determina si un num es pa o impar 

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // en el archivo de clases de algoritmos hay una estructura con python
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un numero " + i + ": ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }

        scanner.close();

    } 
} 
