package deber;
import java.util.Scanner;
class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("=== Menú ===");
        System.out.println("1. Calificar");
        System.out.println("2. Ver información");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public int obtenerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Opción inválida. Debe ingresar un número.");
            return -1;
        }
    }

    public int obtenerOpcionReina() {
        try {
            System.out.println("Seleccione una reina para calificar (1, 2, 3): ");
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Selección inválida. Debe ingresar un número.");
            return -1;
        }
    }

    public int obtenerCalificacion() {
        try {
            int calificacion = scanner.nextInt();
            if (calificacion >= 1 && calificacion <= 10) {
                return calificacion;
            } else {
                System.out.println("Error: Calificación inválida. Debe ser un número del 1 al 10.");
                return -1;
            }
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Calificación inválida. Debe ingresar un número.");
            return -1;
        }
    }

    public void mostrarInformacionReinas(Reina[] reinas) {
        for (Reina reina : reinas) {
            System.out.println(reina.getInfo());
        }
    }

    public void calificarReina(Reina reina, int calificacionInteligencia, int calificacionBelleza) {
        reina.calificar(calificacionInteligencia, calificacionBelleza);
    }
}