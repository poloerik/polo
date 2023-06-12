package deber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean acceso = false;
        String usuario;
        String contraseña;

        do {
            System.out.print("Ingrese el usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Ingrese la contraseña: ");
            contraseña = scanner.nextLine();

            if ((usuario.equals("admin") && contraseña.equals("1234")) || (usuario.equals("usuario1") && contraseña.equals("12345"))) {
                acceso = true;
                System.out.println("Ingreso de contraseña correcta.");
                System.out.println("¡Bienvenido!");

                int opcion;
                boolean salir = false;
                while (!salir) {
                    opcion = mostrarMenu(scanner);

                    switch (opcion) {
                        case 1:
                            if (usuario.equals("admin")) {
                                System.out.println("Seleccione una reina para calificar (1, 2, 3): ");
                                int seleccion = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer de entrada

                                if (seleccion >= 1 && seleccion <= 3) {
                                    System.out.print("Ingrese la calificación de inteligencia (1-10): ");
                                    int calificacionInteligencia = scanner.nextInt();
                                    scanner.nextLine(); // Limpiar el buffer de entrada

                                    System.out.print("Ingrese la calificación de belleza (1-10): ");
                                    int calificacionBelleza = scanner.nextInt();
                                    scanner.nextLine(); // Limpiar el buffer de entrada

                                    reinas[seleccion - 1].calificar(calificacionInteligencia, calificacionBelleza);
                                    System.out.println("Calificación exitosa.");
                                } else {
                                    System.out.println("Selección inválida.");
                                }
                            } else {
                                System.out.println("Acceso denegado.");
                            }
                            break;
                        case 2:
                            System.out.println("Información de las reinas:");
                            for (Reina reina : reinas) {
                                System.out.println(reina.getInfo());
                            }
                            break;
                        case 3:
                            System.out.println("Cerrando sesión...");
                            System.out.println();
                            salir = true;
                            break;
                        default:
                            System.out.println("Opción inválida. Vuelva a intentarlo.");
                            break;
                    }

                    System.out.println();
                }

                break; // Salir del bucle principal cuando se cierra la sesión
            } else {
                System.out.println("Usuario o contraseña incorrectos. Vuelva a intentarlo.");
                System.out.println();
            }
        } while (!acceso);

        // Volver al menú de usuario y contraseña
        main(null);
    }

    static Reina[] reinas = {
            new Reina("Reina 1"),
            new Reina("Reina 2"),
            new Reina("Reina 3")
    };
        public static int mostrarMenu(Scanner scanner) {
        System.out.println("=== Menú ===");
        System.out.println("1. Calificar");
        System.out.println("2. Ver información");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }
}

