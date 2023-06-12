package prueba;

class Mesero extends Humano {
    private String usuario;

    public Mesero (String nombre, String rol) {
        super(nombre, rol);
    }


    public void llevarOrden(String nombreCliente) {
        System.out.println("El mesero Alex está llevando su orden, " + nombreCliente + "!");
    }

    public void entregarOrden(String nombreCliente, String orden) {
        System.out.println("Aquí está su orden, " + nombreCliente + ": " + orden);
    }
}
