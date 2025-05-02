/*
author: Ximena Giraldo
fecha: 17/03/25
descripcion : Programa que muestra por consola el mensaje "hola mundo..."
*/


public class Hola {
    public static void main (String[] args){
        String miNombre;
        String miCorreo;
        String miTelefono;
        String miInstitucion;

        /*Tipos de datos
        dos tipos: primitivos y de referencia
        Primitivos
        1.byte : 8 bits -128 : 127
        2.char: "a", "z",  "A", "Z"
        3.short: entero corto 2 bytes -2^16 - 2^16 - 1
        4.int:4 bytes
        5.long: 8 bytes
        6.float:4 bytes
        7.double: 8  bytes
        8.boolean: true, false - 0:1
         */
        System.out.println("Hola mundo de java");
        
        //tipos de datos
        // System.out.println("Valor minimo de un byte:  "+ Byte.MIN_VALUE);
        // System.out.println("Valor maximo de un byte:  "+ Byte.MAX_VALUE);
        // System.out.println("Valor minimo de un short:  "+ Short.MIN_VALUE);
        // System.out.println("Valor minimo de un short:  "+ Short.MAX_VALUE);
        // System.out.println("Valor minimo de un int:  "+ Integer.MIN_VALUE);
        // System.out.println("Valor minimo de un int:  "+ Integer.MAX_VALUE);
        // System.out.println("Valor minimo de un long:  "+ Long.MIN_VALUE);
        // System.out.println("Valor minimo de un long:  "+ Long.MAX_VALUE);
        // System.out.println("Valor minimo de un Float:  "+ Float.MIN_VALUE);
        // System.out.println("Valor minimo de un Float:  "+ Float.MAX_VALUE);
        // System.out.println("Valor minimo de un double:  "+ Double.MIN_VALUE);
        // System.out.println("Valor minimo de un double:  "+ Double.MAX_VALUE);


        miNombre = " Ximena";
        // primera forma de impresion:
        System.out.println("Mi nombre es: " + miNombre);
        // segunda forma de impresion:
        
        System.out.printf("Mi nombre es: %s\n", miNombre);
        System.out.printf("Mi nombre es %15s\n", miNombre);

        miNombre = " Xime Giraldo";
        System.out.println("Mi nombre es: " + miNombre);
        miCorreo = " ximena@gmail.com";
        System.out.println("Mi correo es: " + miCorreo);
        miTelefono = "123123123";
        System.out.println("Mi telefono es: " + miTelefono);
        miInstitucion = "Sena";
        System.out.println("Mi institucion es: " + miInstitucion);

        
    }// fin del metodo main
}// fin de la clase