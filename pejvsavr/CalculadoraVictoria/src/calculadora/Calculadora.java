// @autor: Victoria Vielma
// fecha: 07-04-2025
// descripcion: Calculadora 


import java.util.Scanner;


// como las clases q vimos con lilliana 

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

       
        System.out.println("|----------------------------------------|");
        System.out.println("|         CALCULADORA INTERACTIVA        |");
        System.out.println("|----------------------------------------|");
        System.out.println();
        System.out.println("  Calculadora  ");
        System.out.println(" Selecciona una operacion: ");
        System.out.println("|----------------------------------------|");
        System.out.println("| 1. Suma                                |");
        System.out.println("| 2. Resta                               |");
        System.out.println("| 3. Multiplicacion                      |");
        System.out.println("| 4. Division                            |");
        System.out.println("| 5. Modulo                              |");
        System.out.println("|----------------------------------------|");

        System.out.print("elegiste la opcion: ");
        int operacion = sc.nextInt();

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int resultado = 0;

        System.out.println("|----------------------------------------|");
        switch(operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("|  la suma es: "+resultado+"        |");
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("|  la resta es: "+resultado+"       |");
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("|  la multiplicacion es: "+resultado+" |");
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("|  la division es: "+resultado+"     |");
                } else {
                    System.out.println("| No se puede dividir por cero            |");
                }
                break;
            case 5:
                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.println("| El resultado del modulo es: "+resultado+"        |");
                } else {
                    System.out.println("| No se puede dividir por cero            |");
                }
                break;
        }
        System.out.println("|----------------------------------------|");

        

        sc.close();
    }  
} 