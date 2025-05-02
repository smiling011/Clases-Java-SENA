// @autor: Ximera Giraldo
// fecha: 
// descripcion: taller metodos


import java.util.Scanner;

public class Tipo1 {
    public static void main(String[] args) {
        // Llamadas a los métodos tipo I
        realizarSuma();
        realizarResta();
        realizarMultiplicacion();
        realizarDivision();
    }

    // Método tipo I: sin parámetros de entrada ni salida
    public static void realizarSuma() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n[Operación: Suma]");
        System.out.print("Digite el primer valor: ");
        int valorA = entrada.nextInt();
        System.out.print("Digite el segundo valor: ");
        int valorB = entrada.nextInt();
        int total = valorA + valorB;
        System.out.println("Resultado: " + total);
    }

    public static void realizarResta() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n[Operación: Resta]");
        System.out.print("Digite el primer valor: ");
        int valorA = entrada.nextInt();
        System.out.print("Digite el segundo valor: ");
        int valorB = entrada.nextInt();
        int total = valorA - valorB;
        System.out.println("Resultado: " + total);
    }

    public static void realizarMultiplicacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n[Operación: Multiplicación]");
        System.out.print("Digite el primer valor: ");
        int valorA = entrada.nextInt();
        System.out.print("Digite el segundo valor: ");
        int valorB = entrada.nextInt();
        int total = valorA * valorB;
        System.out.println("Resultado: " + total);
    }

    public static void realizarDivision() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n[Operación: División]");
        System.out.print("Digite el primer valor: ");
        int dividendo = entrada.nextInt();
        System.out.print("Digite el segundo valor: ");
        int divisor = entrada.nextInt();

        if (divisor != 0) {
            double total = (double) dividendo / divisor;
            System.out.println("Resultado: " + total);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
