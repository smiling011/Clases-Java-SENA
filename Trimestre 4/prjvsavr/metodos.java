// descripcion y utilizacion de metodos en una clase
import java.util.Scanner;

public class metodos {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); // Scanner definido correctamente

        sumarI(); // método tipo I
        sumarII(); // método tipo II sin parámetros (lee desde teclado)

        int vlr1 = 100;
        int vlr2 = 55;
        sumarII(vlr1, vlr2); // método tipo II con parámetros

        // redefinimos vlr1 y vlr2 con valores desde teclado
        System.out.print("Ingrese un valor: ");
        vlr1 = valor.nextInt();
        System.out.print("Ingrese un valor: ");
        vlr2 = valor.nextInt();

        sumarII(vlr1, vlr2); // llamada con valores ingresados

        valor.close(); // cerramos el Scanner

        //fin del metodo
    }

    //tipos de metodos
    //de acuerdo a los parametros: entrada o de salida
    //metodo tio I : sin parametros de entrada y de salida
    //metodo tipo II: con parametros de entrada y sin parametro de salida

    private static void sumarI() {
        Scanner valor = new Scanner(System.in);
        int numero1;
        int numero2;
        int total;

        System.out.print("Ingrese un numero: ");
        numero1 = valor.nextInt();
        System.out.print("Ingrese otro numero: ");
        numero2 = valor.nextInt();
        total = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " + " + numero2 + " es igual a " + total);
        valor.close();
    }

    // metodo tipo II: con parametros de entrada y sin parametros de salida
    private static void sumarII(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + total);
    }

    // sobrecarga del método tipo II: sin parámetros, pero lee desde teclado
    private static void sumarII() {
        Scanner valor = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese un número: ");
        num1 = valor.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = valor.nextInt();

        sumarII(num1, num2); // llama al método con parámetros
        valor.close();
    }
}


// actividad: implimientar las operaciones matematicas de actividad 
// anterior con los 4 tippos de metodos , de acierdo a los parametros de entrada y el parametro de salida
// im plementar los 4  metodos para cada uno de las operaciones.
// e implementar los switch de acuerdo a cada uno de los metodos(+-*/).
// realizar otro switch adicional eligiendo un metodo diferente para cada operacion.