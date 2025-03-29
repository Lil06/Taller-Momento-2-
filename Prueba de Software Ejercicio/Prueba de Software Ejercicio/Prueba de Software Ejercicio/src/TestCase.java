public class TestCase {
    private int id;
    private String nombre;
    private String estado;

    // Constructor
    public TestCase(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    // Métodos Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido.");
        }
    }

    // Método para mostrar los detalles del TestCase
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Estado: " + estado);
    }


}

