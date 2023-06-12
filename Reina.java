package deber;

class Reina {
    private String nombre;
    private int inteligencia;
    private int belleza;

    public Reina(String nombre) {
        this.nombre = nombre;
        this.inteligencia = 0;
        this.belleza = 0;
    }

    public void calificar(int inteligencia, int belleza) {
        this.inteligencia = inteligencia;
        this.belleza = belleza;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Inteligencia: " + inteligencia + ", Belleza: " + belleza;
    }
}

