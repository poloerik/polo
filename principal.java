package prueba;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            
            System.out.println("Ingrese el número de mesa: ");
            int numeroMesa = scanner.nextInt();
            
            Mesero mesero1 = new Mesero("kevin","mesero");
            
            System.out.println("Hola, soy" + mesero1.nombre + " soy su mesero!");
            System.out.println("¿Puedo tomar su orden?");
            
            System.out.println("(y/n)");
            String respuesta = scanner.next();
            
            if (respuesta.equals("y")) {
                Menu menu = new Menu();
                menu.mostrarMenu();
                
                System.out.println("Seleccione una opción del menú: ");
                int opcion = scanner.nextInt();
                
                Cliente cliente = new Cliente(nombreCliente, numeroMesa);
                cliente.realizarOrden(menu, opcion);
            } else {
                System.out.println("¡Gracias por visitarnos, " + nombreCliente + "! Vuelva pronto.");
            }
        }
    }
}