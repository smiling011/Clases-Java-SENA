// @autor: Ximera Giraldo
// fecha: 
// descripcion: taller metodos


import java.util.Scanner;

public class Tipo3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = lector.nextInt();

        // Tipo III: con parámetros de entrada y con valor de retorno
        System.out.println("\n[Suma - Tipo III] Resultado: " + obtenerSuma(numeroUno, numeroDos));
        System.out.println("[Resta - Tipo III] Resultado: " + obtenerResta(numeroUno, numeroDos));
        System.out.println("[Multiplicación - Tipo III] Resultado: " + obtenerMultiplicacion(numeroUno, numeroDos));
        System.out.println("[División - Tipo III] Resultado: " + obtenerDivision(numeroUno, numeroDos));
    }

    // Tipo III: con parámetros de entrada y con valor de retorno
    public static int obtenerSuma(int valorA, int valorB) {
        return valorA + valorB;
    }

    public static int obtenerResta(int valorA, int valorB) {
        return valorA - valorB;
    }

    public static int obtenerMultiplicacion(int valorA, int valorB) {
        return valorA * valorB;
    }

    public static double obtenerDivision(int valorA, int valorB) {
        if (valorB != 0) {
            return (double) valorA / valorB;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}
