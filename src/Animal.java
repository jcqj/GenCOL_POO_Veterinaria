public abstract class Animal {
    private String nombre;
    private String nombrePropietario;
    private int edad;

    public Animal() {}

    public Animal(String nombre, String nombrePropietario, int edad) {
        this.nombre = nombre;
        this.nombrePropietario = nombrePropietario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombrePropietario() {
        return nombrePropietario;
    }

    public void setnombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void fichaPresentacion(){
        System.out.println("\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nNombre Dueño: " + this.nombrePropietario + "\nEl costo de consulta es: " + calcularCostoConsulta());
    }

    //! Definimos firma de metodo abstracto.
    public abstract double calcularCostoConsulta();
}
