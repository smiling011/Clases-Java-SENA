/*
author: Ximena Giraldo
fecha: 31/03/25
descripcion : crea un programa que dada una edad identifique 
la etapa de la vida correspondiente.
*/

import java.util.Scanner;
public class Estructuras {
    public static void main(String []args) {
        Scanner sc;
        int edad;


        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }

        //programa que lea una edad y mostrar un mensaje" ya eres mayor de edad"  

        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        //segunda forma
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("Menor de edad");
        }

        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        //tercera forma

        if (edad >= 0 && edad <=5) {
            System.out.println(" Primera infancia");
        }
        else if (edad <=11) {
            System.out.println(" Infancia");
        }
        else if (edad <=19) {
            System.out.println(" Adolescencia");
        }
        else if (edad <=20) {
            System.out.println(" Juventud");
        }
        else if (edad <=27) {
            System.out.println(" Adultez");
        }
        else if (edad <= 59) {
            System.out.println("Vejez");
        }
        else{
            System.out.println("Muerto");
        }

    sc. close();
    }
}//fin de la clase