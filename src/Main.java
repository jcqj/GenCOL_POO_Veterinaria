public class Main {

    static void main(String[] args) {
        Animal perro1 = new Perros("Bob" , "Maira", 3 ,"Pastor");

        Animal gato1 = new Gatos("Chispas" , "David" , 2 , true);

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
    }
}
