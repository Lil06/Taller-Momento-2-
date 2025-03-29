import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestCase> casos;

    // Constructor
    public TestSuite() {
        this.casos = new ArrayList<>();
    }

    // Método para agregar un caso de prueba
    public void agregarCaso(TestCase caso) {
        casos.add(caso);
    }

    // Método para eliminar un caso por su ID
    public void eliminarCaso(int id) {
        casos.removeIf(caso -> caso.getId() == id);
    }

    // Método para mostrar todos los casos de prueba
    public void mostrarCasos() {
        for (TestCase caso : casos) {
            caso.mostrarInformacion();
        }
    }
}
