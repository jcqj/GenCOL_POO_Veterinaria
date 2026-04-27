public class Perros extends Animal implements Vacunable , Asegurable{
    private String raza;

    public Perros() {}

    public Perros(String nombre, String nombrePropietario, int edad, String raza) {
        super(nombre, nombrePropietario, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        double costo = 45_000 + (3_000 * getEdad());
        return costo;
    }

//! Metodos de Interfaz VACUNABLE
    @Override
    public void registrarVacuna(String nombre) {
        System.out.printf("Se ha registrado %s \n" , nombre );
    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

//! Metodos de interfaz ASEGURABLE
    @Override
    public double calculaPrimaSeguro() {
        double costoPrima = 80_000 * getEdad();
        return costoPrima;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
