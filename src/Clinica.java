public class Clinica implements Asegurable{
    private String nombre;
    private String direccion;
    private boolean puedeAsegurarse;

    public Clinica() {};

    public Clinica(String nombre, String direccion, boolean puedeAsegurarse) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puedeAsegurarse = puedeAsegurarse;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPuedeAsegurarse() {
        return puedeAsegurarse;
    }

    public void setPuedeAsegurarse(boolean puedeAsegurarse) {
        this.puedeAsegurarse = puedeAsegurarse;
    }

    @Override
    public double calculaPrimaSeguro() {
        if(isPuedeAsegurarse()==true){
            return 5_000_000;
        }
        return 0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + getNombre();
    }
}
