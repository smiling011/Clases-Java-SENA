public class Tarea {

    public static void main(String[] args) {
        String miNombre = "Victoria Vielma Romero";
        String miCorreo = "zorrarosa@gmail.com";
        String miTelefono = "123456789";
        String insti = "SENA";

        System.out.println("|--------------------------------|");
        System.out.println("|         Datos Personales       |");
        System.out.println("|--------------------------------|");
        System.out.println("| Nombre: " + String.format("%-23s", miNombre) + " |");
        System.out.println("| Correo: " + String.format("%-23s", miCorreo) + " |");
        System.out.println("| Telefono: " + String.format("%-21s", miTelefono) + " |");
        System.out.println("| Institución: " + String.format("%-18s", insti) + " |");
        System.out.println("|--------------------------------|");
    }
}