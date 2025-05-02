// @autor: Jose Manuel Echeverry
// fecha: 07-04-2025
// descripción: Mini Calculadora con estilo personalizado

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("         MINI CALCULADORA JAVA       ");
        System.out.println("========================================");
        System.out.println(" Operaciones disponibles:");
        System.out.println(" 1 -  Sumar");
        System.out.println(" 2 -  Restar");
        System.out.println(" 3 -  Multiplicar");
        System.out.println(" 4 -  Dividir");
        System.out.println(" 5 -  Módulo (residuo)");
        System.out.println("========================================");

        System.out.print(" Elige una opción (1-5): ");
        int opcionElegida = entrada.nextInt();

        System.out.print("Ingresa el primer número: ");
        int valor1 = entrada.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int valor2 = entrada.nextInt();

        int resultado = 0;

        System.out.println("\n----------------------------------------");

        if (opcionElegida == 1) {
            resultado = valor1 + valor2;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (opcionElegida == 2) {
            resultado = valor1 - valor2;
            System.out.println("Resultado de la resta: " + resultado);
        } else if (opcionElegida == 3) {
            resultado = valor1 * valor2;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else if (opcionElegida == 4) {
            if (valor2 != 0) {
                resultado = valor1 / valor2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        } else if (opcionElegida == 5) {
            if (valor2 != 0) {
                resultado = valor1 % valor2;
                System.out.println(" Resultado del módulo: " + resultado);
            } else {
                System.out.println(" No se puede calcular módulo con cero.");
            }
        } else {
            System.out.println(" Opción no válida.");
        }

        System.out.println("----------------------------------------");

        entrada.close();
    }
}
