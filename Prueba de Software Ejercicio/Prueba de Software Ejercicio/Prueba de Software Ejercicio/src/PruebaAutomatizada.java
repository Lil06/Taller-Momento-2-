class PruebaAutomatizada extends TestCase {
    String framework;

    public PruebaAutomatizada(int id, String nombre, String estado, String framework) {
        super(id, nombre, estado);
        this.framework = framework;
    }

    public void mostrarFramework() {
        System.out.println("Framework utilizado: " + framework);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Framework: " + framework);
    }
}
