// @autor: Ximera Giraldo
// fecha: 
// descripcion: taller metodos

import java.util.Scanner;

public class Tipo2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = lector.nextInt();

        // Tipo II: con parámetros de entrada y sin valor de retorno
        calcularSuma(numeroUno, numeroDos);
        calcularResta(numeroUno, numeroDos);
        calcularMultiplicacion(numeroUno, numeroDos);
        calcularDivision(numeroUno, numeroDos);
    }

    // Tipo II: con parámetros de entrada y sin valor de retorno
    public static void calcularSuma(int valorA, int valorB) {
        int resultado = valorA + valorB;
        System.out.println("\n[Suma - Tipo II] Resultado: " + resultado);
    }

    public static void calcularResta(int valorA, int valorB) {
        int resultado = valorA - valorB;
        System.out.println("\n[Resta - Tipo II] Resultado: " + resultado);
    }

    public static void calcularMultiplicacion(int valorA, int valorB) {
        int resultado = valorA * valorB;
        System.out.println("\n[Multiplicación - Tipo II] Resultado: " + resultado);
    }

    public static void calcularDivision(int valorA, int valorB) {
        System.out.println("\n[División - Tipo II]");
        if (valorB != 0) {
            double resultado = (double) valorA / valorB;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
