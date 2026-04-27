public class Conejo extends Animal{
    public Conejo() {}

    public Conejo(String nombre, String nombrePropietario, int edad) {
        super(nombre, nombrePropietario, edad);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35_000;
    }
}
