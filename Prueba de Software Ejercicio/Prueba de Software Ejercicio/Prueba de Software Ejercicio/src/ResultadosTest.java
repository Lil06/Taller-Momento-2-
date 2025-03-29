import java.util.HashMap;
import java.util.Map;

public class ResultadosTest {
    private Map<Integer, String> resultados;

    // Constructor
    public ResultadosTest() {
        resultados = new HashMap<>();
    }

    // Método para agregar o actualizar el estado de un caso de prueba
    public void agregarOActualizarResultado(int id, String estado) {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) {
            resultados.put(id, estado);
        } else {
            System.out.println("Estado inválido.");
        }
    }

    // Método para mostrar los resultados
    public void mostrarResultados() {
        for (Map.Entry<Integer, String> entry : resultados.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Estado: " + entry.getValue());
        }
    }
}
