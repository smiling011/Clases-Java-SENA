import java.util.Scanner;

public class Operaciones1234 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma (Tipo I)");
        System.out.println("2. Resta (Tipo II)");
        System.out.println("3. Multiplicacion (Tipo III)");
        System.out.println("4. Division (Tipo IV)");
        System.out.print("Ingrese su opciun: ");
        int opcion = sc.nextInt();

        int a, b;

        switch (opcion) {
            case 1:
                // Tipo I
                sumaTipoI();
                break;

            case 2:
                // Tipo II
                System.out.print("Ingrese el primer numero: ");
                a = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                b = sc.nextInt();
                restaTipoII(a, b);
                break;

            case 3:
                // Tipo III
                int resultadoMultiplicacion = multiplicacionTipoIII();
                System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
                break;

            case 4:
                // Tipo IV
                System.out.print("Ingrese el primer numero: ");
                a = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                b = sc.nextInt();
                double resultadoDivision = divisionTipoIV(a, b);
                System.out.println("Resultado de la divisiun: " + resultadoDivision);
                break;

            default:
                System.out.println("Opcion no valida.");
        }
    }

// me lo explico la ia


    // Tipo I
    public static void sumaTipoI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    // Tipo II
    public static void restaTipoII(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    // Tipo III
    public static int multiplicacionTipoIII() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        return num1 * num2;
    }

    // Tipo IV
    public static double divisionTipoIV(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: división por cero.");
            return 0;
        }
        return (double) num1 / num2;
    }
}
