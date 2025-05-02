import java.util.Scanner;

public class OperacionesTipo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        // Tipo II: con parámetros de entrada y sin valor de retorno
        sumaTipoII(a, b);
        restaTipoII(a, b);
        multiplicacionTipoII(a, b);
        divisionTipoII(a, b);
    }

    // Tipo II: con parámetros de entrada y sin valor de retorno
    public static void sumaTipoII(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("\n[SUMA - Tipo II] Resultado: " + resultado);
    }

    public static void restaTipoII(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("\n[RESTA - Tipo II] Resultado: " + resultado);
    }

    public static void multiplicacionTipoII(int num1, int num2) {
        int resultado = num1 * num2;
        System.out.println("\n[MULTIPLICACIÓN - Tipo II] Resultado: " + resultado);
    }

    public static void divisionTipoII(int num1, int num2) {
        System.out.println("\n[DIVISIÓN - Tipo II]");
        if (num2 != 0) {
            double resultado = (double) num1 / num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}  
