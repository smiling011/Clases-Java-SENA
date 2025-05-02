import java.util.Scanner;

public class OperacionesTipo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        // Tipo IV: con parámetros de entrada y con valor de retorno
        System.out.println("\n[SUMA - Tipo IV] Resultado: " + sumaTipoIV(a, b));
        System.out.println("[RESTA - Tipo IV] Resultado: " + restaTipoIV(a, b));
        System.out.println("[MULTIPLICACIÓN - Tipo IV] Resultado: " + multiplicacionTipoIV(a, b));
        System.out.println("[DIVISIÓN - Tipo IV] Resultado: " + divisionTipoIV(a, b));
    }

    // Tipo IV: con parámetros de entrada y con valor de retorno
    public static int sumaTipoIV(int num1, int num2) {
        return num1 + num2;
    }

    public static int restaTipoIV(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacionTipoIV(int num1, int num2) {
        return num1 * num2;
    }

    public static double divisionTipoIV(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // Valor NaN en caso de división por cero
        }
    }
}
