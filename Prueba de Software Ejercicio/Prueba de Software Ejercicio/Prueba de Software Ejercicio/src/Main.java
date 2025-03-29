import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1: Creación de Clases y Métodos en POO

        // Crear instancias de TestCase
        TestCase caso1 = new TestCase(1, "TestLogin", "PASSED");
        TestCase caso2 = new TestCase(2, "TestSignup", "FAILED");

        // Modificar valores
        caso1.setEstado("FAILED");
        caso2.setEstado("PASSED");

        // Imprimir detalles
        System.out.println("Ejercicio 1: Detalles de los TestCase");
        caso1.mostrarInformacion();
        caso2.mostrarInformacion();
        System.out.println(); // Salto de línea


        // Ejercicio 2: Uso de Listas para Almacenar Casos de Prueba

        // Crear instancia de TestSuite
        TestSuite suite = new TestSuite();

        // Crear instancias de TestCase
        TestCase caso3 = new TestCase(3, "TestPayment", "BLOCKED");
        TestCase caso4 = new TestCase(4, "TestLogout", "PASSED");
        TestCase caso5 = new TestCase(5, "TestSearch", "FAILED");

        // Agregar casos a la suite
        suite.agregarCaso(caso3);
        suite.agregarCaso(caso4);
        suite.agregarCaso(caso5);

        // Mostrar todos los casos
        System.out.println("Ejercicio 2: Casos de prueba en la TestSuite");
        suite.mostrarCasos();

        // Eliminar un caso y mostrar nuevamente
        suite.eliminarCaso(4);
        System.out.println("\nCasos de prueba después de eliminar el caso con ID 4:");
        suite.mostrarCasos();
        System.out.println(); // Salto de línea


        // Ejercicio 3: Uso de Diccionarios (Map) para Gestionar Resultados

        // Crear instancia de ResultadosTest
        ResultadosTest resultadosTest = new ResultadosTest();

        // Simular la ejecución de cinco casos de prueba
        resultadosTest.agregarOActualizarResultado(1, "PASSED");
        resultadosTest.agregarOActualizarResultado(2, "FAILED");
        resultadosTest.agregarOActualizarResultado(3, "BLOCKED");
        resultadosTest.agregarOActualizarResultado(4, "PASSED");
        resultadosTest.agregarOActualizarResultado(5, "FAILED");

        // Mostrar resultados
        System.out.println("Ejercicio 3: Resultados de las pruebas:");
        resultadosTest.mostrarResultados();

        // Actualizar estado de algunos casos
        resultadosTest.agregarOActualizarResultado(3, "PASSED");
        resultadosTest.agregarOActualizarResultado(5, "BLOCKED");

        // Mostrar resultados actualizados
        System.out.println("\nResultados de las pruebas después de actualizaciones:");
        resultadosTest.mostrarResultados();


        //ejercicio 4 ejecucion.
        System.out.println("Ejercicio 4: Validación de Estado");
        String estado = validarEstado();
        System.out.println("Estado ingresado: " + estado);
        System.out.println(); // Salto de línea


        //ejercicio 5 ejecucion.

        System.out.println("Ejercicio 5");

        System.out.println(); // Salto de línea

        //ejercicio 6 ejecucion
        System.out.println("Ejercicio 6: Divisiones");
        dividir(10, 2);  // División válida
        dividir(10, 0);  // División por cero
        dividir(5, 5);   // División válida


        // Ejercicio 7: Implementación de Herencia en POO
        System.out.println("Ejercicio 7: Herencia en POO");
        TestCase prueba1 = new TestCase(1, "Prueba Manual 1", "PASSED");
        PruebaAutomatizada prueba2 = new PruebaAutomatizada(2, "Prueba Automatizada 1", "FAILED", "Selenium");

        prueba1.mostrarInformacion();
        prueba2.mostrarInformacion();
        prueba2.mostrarFramework();
        System.out.println(); // Salto de línea


        // -------------------- EJERCICIO 8 --------------------
        // Ejercicio 8: Implementación de Polimorfismo con Métodos Sobrescritos
        System.out.println("Ejercicio 8: Polimorfismo con Métodos Sobrescritos");
        ReporteTest reporteHTML = new ReporteHTML();
        ReporteTest reportePDF = new ReportePDF();

        reporteHTML.generarReporte();
        reportePDF.generarReporte();
        System.out.println(); // Salto de línea


        // -------------------- EJERCICIO 9 --------------------
        // Ejercicio 9: Abstracción en Casos de Prueba
        System.out.println("Ejercicio 9: Abstracción en Casos de Prueba");
        CasoDePrueba pruebaManual = new PruebaManual();
        CasoDePrueba pruebaAutomatizada = new PruebaAutomatizada9();

        pruebaManual.ejecutarPrueba();
        pruebaAutomatizada.ejecutarPrueba();



    }

    //Metodo del ejercicio 4
    public static String validarEstado() {
        Scanner scanner = new Scanner(System.in);
        String estado;

        while (true) {
            System.out.print("Ingresa el estado de la prueba (PASSED, FAILED, BLOCKED): ");
            estado = scanner.nextLine().toUpperCase();

            if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) {
                return estado;
            } else {
                System.out.println("Error: Estado inválido. Por favor, ingresa un estado válido.");
            }
        }
    }


    //Metodo del ejercicio 5
    public static void contarResultados() {
        // Crear una lista de resultados de pruebas
        ArrayList<String> resultados = new ArrayList<>();
        resultados.add("PASSED");
        resultados.add("FAILED");
        resultados.add("PASSED");
        resultados.add("BLOCKED");
        resultados.add("FAILED");
        // Variables para contar los diferentes estados
        int passed = 0, failed = 0, blocked = 0, total = 0;

        // Recorrer la lista de resultados y contar las ocurrencias
        for (String resultado : resultados) {
            if (resultado.equals("PASSED")) {
                passed++;
                total++;
            } else if (resultado.equals("FAILED")) {
                failed++;
                total++;
            } else if (resultado.equals("BLOCKED")) {
                blocked++;
                total++;
            }
        }
        System.out.println("El total de pruebas en estado FAILED es: "+ failed);
        System.out.println("El total de pruebas en estado BLOCKED es: "+ blocked);
        System.out.println("El total de pruebas en estado PASSED es: "+passed);
        System.out.println("El total de pruebas es: "+ total);
    }

    // Metodo del ejercicio 6
    public static void dividir(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}

