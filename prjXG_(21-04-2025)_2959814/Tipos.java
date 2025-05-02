// @autor: Ximera Giraldo
// fecha: 
// descripcion: taller metodos


import java.util.Scanner;

public class Tipos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma (Tipo I)");
        System.out.println("2. Resta (Tipo II)");
        System.out.println("3. Multiplicacion (Tipo III)");
        System.out.println("4. Division (Tipo IV)");
        System.out.print("Ingrese su opción: ");
        int seleccion = entrada.nextInt();

        int primerNumero, segundoNumero;

        switch (seleccion) {
            case 1:
                // Tipo I
                sumaTipoI();
                break;

            case 2:
                // Tipo II
                System.out.print("Ingrese el primer número: ");
                primerNumero = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                segundoNumero = entrada.nextInt();
                restaTipoII(primerNumero, segundoNumero);
                break;

            case 3:
                // Tipo III
                int resultadoMultiplicacion = multiplicacionTipoIII();
                System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
                break;

            case 4:
                // Tipo IV
                System.out.print("Ingrese el primer número: ");
                primerNumero = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                segundoNumero = entrada.nextInt();
                double resultadoDivision = divisionTipoIV(primerNumero, segundoNumero);
                System.out.println("Resultado de la división: " + resultadoDivision);
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    // Tipo I
    public static void sumaTipoI() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int valorUno = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int valorDos = lector.nextInt();
        int resultado = valorUno + valorDos;
        System.out.println("Resultado de la suma: " + resultado);
    }

    // Tipo II
    public static void restaTipoII(int valorUno, int valorDos) {
        int resultado = valorUno - valorDos;
        System.out.println("Resultado de la resta: " + resultado);
    }

    // Tipo III
    public static int multiplicacionTipoIII() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int valorUno = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int valorDos = lector.nextInt();
        return valorUno * valorDos;
    }

    // Tipo IV
    public static double divisionTipoIV(int valorUno, int valorDos) {
        if (valorDos == 0) {
            System.out.println("Error: división por cero.");
            return 0;
        }
        return (double) valorUno / valorDos;
    }
}
