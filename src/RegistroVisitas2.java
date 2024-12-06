import java.util.Scanner;

public class RegistroVisitas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Es propietario? (true/false): ");
        boolean esPropietario = scanner.nextBoolean();

        System.out.print("Ingrese su género (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Ingrese su numero de teléfono: ");
        long telefono = scanner.nextLong();

        System.out.print("Ingrese su altura en centimetros: ");
        float altura = scanner.nextFloat();

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        scanner.nextLine();


        int totalVisitas = 0;
        int totalTiempoEstadia = 0;


        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Día " + dia + ":");
            System.out.print("Número de visitas: ");
            int visitasHoy = scanner.nextInt();
            totalVisitas += visitasHoy;

            for (int visita = 1; visita <= visitasHoy; visita++) {
                System.out.print("Tiempo de estadía de la visita " + visita + " en minutos: ");
                int tiempoEstadia = scanner.nextInt();
                totalTiempoEstadia += tiempoEstadia;
            }
        }


        double tiempoPromedioEstadia = (double) totalTiempoEstadia / totalVisitas;


        String edadCategoria = (edad >= 18) ? "Mayor de edad" : "Menor de edad";


        System.out.println("\nInformación del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Es propietario: " + esPropietario);
        System.out.println("Género: " + genero);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");

        System.out.println("\nResumen de visitas:");
        System.out.println("Cantidad total de visitas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedioEstadia + " minutos");
        System.out.println("Categoría de edad: " + edadCategoria);
    }
}