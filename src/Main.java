public class Main {

    static void main(String[] args) {
        Animal perro1 = new Perros("Bob" , "Maira", 2 ,"Pastor");

        Animal gato1 = new Gatos("Chispas" , "David" , 2 , false);

        Animal ave1 = new Aves("Piolin" , "Juan", 1 , 2.5);

//        System.out.println(perro1.calcularCostoConsulta());
//        System.out.println(gato1.calcularCostoConsulta());
//        System.out.println(ave1.calcularCostoConsulta());
//
//        perro1.fichaPresentacion();
//        gato1.fichaPresentacion();
//        ave1.fichaPresentacion();

        ((Perros)perro1).registrarVacuna("Vacuna 1");
        ((Gatos)gato1).registrarVacuna("Vacuna 2");

        Clinica clinica1 = new Clinica("GenCOL" , "Avenida siempre viva", true);

        System.out.println(((Perros) perro1).obtenerNumeroPoliza());
        System.out.println(((Gatos)gato1).obtenerNumeroPoliza());
        System.out.println(clinica1.obtenerNumeroPoliza());

        System.out.println("El costo de prima anual para: " + perro1.getNombre() + ", es: " + ((Perros) perro1).calculaPrimaSeguro());

        System.out.println("El costo de prima anual para: " + gato1.getNombre() + ", es: " + ((Gatos) gato1).calculaPrimaSeguro());

        System.out.println("El costo de prima anual para clinica: " + clinica1.getNombre() + ", es: " + clinica1.calculaPrimaSeguro());


        //! Verificación final.
        Animal conejo1 = new Conejo("Pancho" , "Pepito" , 3);
        System.out.println("El costo de consulta para el conejo " + conejo1.getNombre() + " es: " + conejo1.calcularCostoConsulta());

    }
}
