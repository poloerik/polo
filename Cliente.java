package prueba;
class Cliente {
    public String nombre;
    public int mesa;
    public String orden;
    
    public Cliente(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }
    
    public void realizarOrden(Menu menu, int opcion) {
        this.orden = menu.obtenerPlatillo(opcion);
        System.out.println("Orden realizada por el cliente " + nombre + " en la mesa " + mesa + ": " + orden);
        
        Mesero mesero1 = new Mesero("kevin","mesero");
        mesero1.llevarOrden(nombre);
        
        // ... (Código para la preparación de la orden por parte del cocinero)
        
        mesero1.entregarOrden(nombre, orden);
    }
}

