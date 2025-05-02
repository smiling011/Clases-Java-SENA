//ejercicio para determinar si un numero es + 

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("El numero es positivo");
            }
        }

        scanner.close();

    } 
} 
