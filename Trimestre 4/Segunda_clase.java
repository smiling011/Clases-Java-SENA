import java.util.Scanner;
public class Segunda_clase {
    public static void main(String []args) {
        Scanner sc;
        int edad;

        // crear un programa que emuestre el mensaje
        // "Mayor edad " si la edad ingresada en mayor o igual a 18 años

        // comoparadores: mayor(>), mayor o igual(>=)
                        // menor(<), menor o igual(<=)

        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }

        //programa que lea una edad y mostrar un mensaje" ya eres mayor de edad" 
        // si la edad es mayor o igual a 18, de lo contrario mostrar el mensaje "No es mayor de edad"
        // sc. close();

        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        //segunda forma: if () {} else {}
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("Menor de edad");
        }

       

        sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        //tercera forma: if () {} else {} else {}

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
        
      

        // Crear un programa q lea el nivel de juego
        // y muestre un mensaje alusivo a este:
        // 1. Nivel de juego Facil
        // 2. Nivel de juego  Moderado
        // 3. Nivel de juego Dificil
        // 4. Nivel de juego Experto
        // 5. Nivel de juego Maestro

        sc = new Scanner(System.in);
        System.out.print("Ingrese el nivel de juego: ");
        Nivel = sc.nextInt();
        
        switch(Nivel) {
            case 1: System.out.println("Nivel de juego facil");
            break;
            case 2: System.out.println("Nivel de juego moderado");  
            break;
            case 3: System.out.println("Nivel de juego Dificil");
            break;
            case 4: System.out.println("Nivel de juego Experto");
            break;
            case 5: System.out.println("Nivel de juego Maestro");
            break;
            default: System.out.println("Nivel de juego no existe");
        }

        // Crea un menu con las opciones de: suma, resta, multiplicacion, division, modulo, relija su opcion
        // El programa debe solicitar los numeros y realizar la operacion elejida


    sc. close();
    }// fin del metodo main 
}//fin d ela clase
