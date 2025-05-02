import java.util.Scanner;

public class OperacionesTipo1 {
    public static void main(String[] args) {
        // Llamadas a los métodos tipo I
        sumaTipoI();
        restaTipoI();
        multiplicacionTipoI();
        divisionTipoI();
    }

    // Método tipo I: sin parámetros de entrada ni salida
    public static void sumaTipoI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[Suma - Tipo I]");
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void restaTipoI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[Resta - Tipo I]");
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void multiplicacionTipoI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[Multiplicación - Tipo I]");
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void divisionTipoI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[División - Tipo I]");
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            double resultado = (double) num1 / num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
