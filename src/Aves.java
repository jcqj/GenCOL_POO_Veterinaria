public class Aves extends Animal{
    private double pesoGramos;

    public Aves() {}

    public Aves(String nombre, String nombrePropietario, int edad, double pesoGramos) {
        super(nombre, nombrePropietario, edad);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta(){
        double costo = 28_000 + (500 * getPesoGramos());
        return costo;
    }
}
