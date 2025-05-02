// @autor: Ximera Giraldo
// fecha: 
// descripcion: taller metodos

import java.util.Scanner;

public class Tipo4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = lector.nextInt();

        // Tipo IV: con parámetros de entrada y con valor de retorno
        System.out.println("\n[Suma - Tipo IV] Resultado: " + calcularSuma(numeroUno, numeroDos));
        System.out.println("[Resta - Tipo IV] Resultado: " + calcularResta(numeroUno, numeroDos));
        System.out.println("[Multiplicación - Tipo IV] Resultado: " + calcularMultiplicacion(numeroUno, numeroDos));
        System.out.println("[División - Tipo IV] Resultado: " + calcularDivision(numeroUno, numeroDos));
    }

    public static int calcularSuma(int valorA, int valorB) {
        return valorA + valorB;
    }

    public static int calcularResta(int valorA, int valorB) {
        return valorA - valorB;
    }

    public static int calcularMultiplicacion(int valorA, int valorB) {
        return valorA * valorB;
    }

    public static double calcularDivision(int valorA, int valorB) {
        if (valorB != 0) {
            return (double) valorA / valorB;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}
