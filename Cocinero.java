package prueba;

class Cocinero extends Humano {
    private String usuario;

    public Cocinero(String nombre, String rol) {
        super(nombre, rol);
    }
    
    public void hacerOrden(String nombreCliente) {
        System.out.println( "Alex se encuentra preparando la orden para " + nombreCliente + "!");
    }
}
