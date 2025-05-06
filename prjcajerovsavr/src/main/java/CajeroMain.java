/*
* @autor: Victoria Vielma
* @fecha: 05/05/25
* @descripcion: Programa principl para un cajero electronico
* */

import java.util.Scanner;

public class CajeroMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            menuPrincipal();
            opcion = sc.nextInt();

            switch(opcion) {
                case 1: retiro();
                break;
                case 2: consignacion();
                break;
                case 3: transferencia();
                break;
                case 4: cambioClave();
                break;
                case 5: System.out.println("Retire su tarjeta. Hasta Pronto...");
                default: System.out.println("Opcion no valida... ");
            } //fin de switch
        } while (opcion != 5); //((opcion > 1 ) && (opcion < 5));

    }//fin del metodo

    // menu principal
    public static void menuPrincipal () {
        System.out.println("┌───────────────────────────┐");
        System.out.println("│     Cajero automatico     │");
        System.out.println("├───────────────────────────┤");
        System.out.println("│  1.Retiro                 │");
        System.out.println("│  2.Consignacion           │");
        System.out.println("│  3.Transferencia          │");
        System.out.println("│  4.Cambio de clave        │");
        System.out.println("│  5.Salir                  │");
        System.out.println("└───────────────────────────┘");
        System.out.print("  Digite una opcion  [1 - 5]: ");
    }// fin de menu princiapl

    public static void retiros () {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│                 RETIROS                 │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. COP$ 10,000    2. COP$ 50,000       │");
        System.out.println("│  3. COP$ 100,000    4. COP$ 200,000     │");
        System.out.println("│  5. COP$ 500,000    6. OTRO VALOR       │");
        System.out.println("│  7. SALIR                               │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("  Digite una opcion  [1 - 7]: ");
    }// fin de retiro

    public static void menuConsignaciones () {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│             Consignaciones              │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. COP$ 10,000    2. COP$ 50,000       │");
        System.out.println("│  3. COP$ 100,000   4. COP$ 200,000      │");
        System.out.println("│  5. COP$ 500,000   6. OTRO VALOR        │");
        System.out.println("│  7. SALIR                               │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("  Digite una opcion  [1 - 7]: ");
    }// fin de menu Consignaciones

    public static void tranferencias () {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│             TRANSFERENCIAS              │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. COP$ 10,000    2. COP$ 50,000       │");
        System.out.println("│  3. COP$ 100,000   4. COP$ 200,000      │");
        System.out.println("│  5. COP$ 500,000   6. OTRO VALOR        │");
        System.out.println("│  7. SALIR                               │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("  Digite una opcion  [1 - 7]: ");
    }// fin de menu transferencias

    public static void cambioClave () {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│             CAMBIO DE CLAVE             │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.println("│  1. SALIR                               │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.print("  Digite [1] para salir: ");
    }// fin de menu CAMBIO DE CLAVE

    public static void retiro() {
        Scanner sc = new Scanner(System.in);
        int monto;
        int opcion;


        retiros();
        opcion = sc.nextInt();
        switch(opcion) {
            case 1: monto = 10000;
            System.out.println("Retiro de COP$" + monto);
            break;
            case 2: monto = 50000;
                System.out.println("Retiro de COP$" + monto);
                break;
            case 3: monto = 100000;
                System.out.println("Retiro de COP$" + monto);
                break;
            case 4: monto = 200000;
                System.out.println("Retiro de COP$" + monto);
                break;
            case 5: monto = 500000;
                System.out.println("Retiro de COP$" + monto);
                break;
            case 6: System.out.println("Ingrese el Valor a retirar COP$: ");
                monto = sc.nextInt();
                System.out.println("Retiro de COP$" + monto);
                break;
            default: System.out.println("Opcion no valida... ");
        }// fin del switch
    }// Fin para los retiros

    public static void consignacion() {
        Scanner sc = new Scanner(System.in);
        int monto;
        int opcion;


        menuConsignaciones();
        opcion = sc.nextInt();
        switch(opcion) {
            case 1: monto = 10000;
                System.out.println("Consignacion de COP$" + monto);
                break;
            case 2: monto = 50000;
                System.out.println("Consignacion de COP$" + monto);
                break;
            case 3: monto = 100000;
                System.out.println("Consignacion de COP$" + monto);
                break;
            case 4: monto = 200000;
                System.out.println("Consignacion de COP$" + monto);
                break;
            case 5: monto = 500000;
                System.out.println("Consignacion de COP$" + monto);
                break;
            case 6: System.out.println("Ingrese el Valor a consignar COP$: ");
                monto = sc.nextInt();
                System.out.println("Consignacion de COP$" + monto);
                break;
            default: System.out.println("Opcion no valida... ");
        }// fin del switch
    }// Fin para los consignaciones

    public static void transferencia() {
        Scanner sc = new Scanner(System.in);
        int monto;
        int opcion;


        tranferencias();
        opcion = sc.nextInt();
        switch(opcion) {
            case 1: monto = 10000;
                System.out.println("Tranferencia de COP$" + monto);
                break;
            case 2: monto = 50000;
                System.out.println("Tranferencia de COP$" + monto);
                break;
            case 3: monto = 100000;
                System.out.println("Tranferencia de COP$" + monto);
                break;
            case 4: monto = 200000;
                System.out.println("Tranferencia de COP$" + monto);
                break;
            case 5: monto = 500000;
                System.out.println("Tranferencia de COP$" + monto);
                break;
            case 6: System.out.println("Ingrese el Valor a tranferir COP$: ");
                monto = sc.nextInt();
                System.out.println("Tranferencia de COP$" + monto);
                break;
            default: System.out.println("Opcion no valida... ");
        }// fin del switch
    }// Fin para los tranferencias
// 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 coso de git



}// fin d la clase c
