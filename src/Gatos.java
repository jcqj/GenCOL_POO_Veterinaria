public class Gatos extends Animal implements Vacunable, Asegurable{
    private boolean esEstirilizado;

    public Gatos() {}

    public Gatos(String nombre, String nombrePropietario, int edad, boolean esEstirilizado) {
        super(nombre, nombrePropietario, edad);
        this.esEstirilizado = esEstirilizado;
    }

    public boolean isEsEstirilizado() {
        return esEstirilizado;
    }

    public void setEsEstirilizado(boolean esEstirilizado) {
        this.esEstirilizado = esEstirilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38_000;
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
        if ( isEsEstirilizado() == true){
            return 120_000;
        }
        return 200_000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + getNombre();
    }
}
