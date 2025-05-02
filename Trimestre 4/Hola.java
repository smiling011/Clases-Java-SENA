// holisss gente de yt
/*hola gente de yt
como les va

*/
/**hola chamaquitas y chamaquitoss documentacion*/

/*
author: Vicky Vielma
fecha: 17/03/25
descripcion : Programa que muestra por consola el mensaje 
"hola mundo..."
*/

// plantilla basica de java
public class Hola {
    public static void main (String[] args){
        String miNombre;
        int miDocumento;
        String miCorreo;
        String miTelefono;
        String insti;

        System.out.println("hola mundo de java...");
        /*Tipos de datos
        dos tipos: primitivos y de referencia
        Primitivos
        byte : 8 bits -128 : 127
        char: "a", "z",  "A", "Z"
        short: entero corto 2 bytes -2^16 - 2^16 - 1
        int:4 bytes
        long: 8 bytes
        float:4 bytes
        double: 8  bytes
        boolean: true, false - 0:1
         */
        // imprimir el vslor minimo y maximo de un
        
        //tipo de dato
        System.out.println("Valor minimo de un byte:  "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo de un byte:  "+ Byte.MAX_VALUE);
        System.out.println("Valor minimo de un short:  "+ Short.MIN_VALUE);
        System.out.println("Valor minimo de un short:  "+ Short.MAX_VALUE);
        System.out.println("Valor minimo de un int:  "+ Integer.MIN_VALUE);
        System.out.println("Valor minimo de un int:  "+ Integer.MAX_VALUE);
        System.out.println("Valor minimo de un long:  "+ Long.MIN_VALUE);
        System.out.println("Valor minimo de un long:  "+ Long.MAX_VALUE);
        System.out.println("Valor minimo de un Float:  "+ Float.MIN_VALUE);
        System.out.println("Valor minimo de un Float:  "+ Float.MAX_VALUE);
        System.out.println("Valor minimo de un double:  "+ Double.MIN_VALUE);
        System.out.println("Valor minimo de un double:  "+ Double.MAX_VALUE);


        // Notacion
        //snake_case: si el nombre de la variable tiene varias palabras 
        //todas las palabras se escriben con minusculas y se separan con un guion bajo(_) ej: mi_nombre3
        //mi_Nombre x, Mi_nombre x, MI_NOMBRE
        // camelCase: si el nombre de la variable tiene varias palabras, 
        //la primera palabra es en minusculas y las demas con mayus inicial
        //ej: miNombre, MiNombre x, Minombre x
        //  PascalCase: si el nombre de la variable tiene varias 
        //palabras todas la palabras se escriben con mayus inicial.
        // Notacion Hungara: es transversal a las demas.
        //                  str_mi_nombre, mi_nombre_str, strMiNombre, miNombreStr

        miNombre = "Vicky Vielma Romero";
        // primera forma de impresion:
        System.out.println("Mi nombre es: " + miNombre);
        // segunda forma de impresion:
        
        System.out.printf("Mi nombre es: %s\n", miNombre);
        System.out.printf("Mi nombre es %15s\n", miNombre);

        miNombre = "Vicky Vielma Romero";
        System.out.println("Mi nombre es: " + miNombre);
        miCorreo = "zorrarosa@gmail.com";
        System.out.println("Mi correo es: " + miCorreo);
        miTelefono = "1234556789";
        System.out.println("Mi telefono es: " + miTelefono);
        insti = "SENA";
        System.out.println("Mi institucion es: " + insti);

        
    }// fin del metodo main
}// fin de la clase