import java.util.Scanner; 

public class Taller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nivel de estudio: ");
        String nivelEstudio = scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su numero de celular: ");
        String celular = scanner.nextLine();

        System.out.print("Ingrese la institucion en que se graduo: ");
        String institucion = scanner.nextLine();

        System.out.println();

        
        System.out.println("+------------------------------------------------------+");
        System.out.printf("| %-52s |\n", nivelEstudio);
        System.out.println("+------------------------------------------------------+");
        System.out.printf("| %-17s %34s |\n", "Mi Nombre es:", nombre);
        System.out.printf("| %-17s %34s |\n", "Mi Celular es:", celular);
        System.out.printf("| %-17s %33s |\n", "Mi Institucion es:", institucion);
        System.out.println("+------------------------------------------------------+");

        scanner.close(); 
    }
}
