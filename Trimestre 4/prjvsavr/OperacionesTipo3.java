import java.util.Scanner;

public class OperacionesTipo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        // Tipo III: con parámetros de entrada y con valor de retorno
        System.out.println("\n[SUMA - Tipo III] Resultado: " + sumaTipoIII(a, b));
        System.out.println("[RESTA - Tipo III] Resultado: " + restaTipoIII(a, b));
        System.out.println("[MULTIPLICACIÓN - Tipo III] Resultado: " + multiplicacionTipoIII(a, b));
        System.out.println("[DIVISIÓN - Tipo III] Resultado: " + divisionTipoIII(a, b));
    }

    // Tipo III: con parametros de entrada y con valor de retorno
    public static int sumaTipoIII(int num1, int num2) {
        return num1 + num2;
    }

    public static int restaTipoIII(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacionTipoIII(int num1, int num2) {
        return num1 * num2;
    }

    public static double divisionTipoIII(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}
