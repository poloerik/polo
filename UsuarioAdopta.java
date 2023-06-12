package leccion;

import java.util.Scanner;

public class UsuarioAdopta extends Funcionario {
    String direccion;

    public UsuarioAdopta(String nombre, int edad, String direccion, String especie) {
        super(nombre, edad, especie);
        this.direccion = direccion;
    }

    public static UsuarioAdopta crearUsuarioAdopta() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del UsuarioAdopta: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad del UsuarioAdopta: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            System.out.println("Ingrese la dirección del UsuarioAdopta: ");
            String direccion = scanner.nextLine();

            System.out.println("Ingrese la especie del Animal: ");
            String especie = scanner.nextLine();

            return new UsuarioAdopta(nombre, edad, direccion, especie);
        }
    }
}
