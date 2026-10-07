package Evaluacion1;

public class Main {

    public static void main(String[] args) {

        GestorViviendas gestor = new GestorViviendas();

        Casa casa = new Casa("C001", 100, 3, true);

        Departamento departamento = new Departamento(
                "D001", 60, 2, 5, true
        );

        gestor.registrarVivienda(casa);
        gestor.registrarVivienda(departamento);

        for (Vivienda vivienda : gestor.getViviendas()) {

            System.out.println(vivienda);
            System.out.println("Costo arriendo: " + vivienda.calcularCostoArriendo());
        }

        System.out.println("Busqueda:");

        for (Vivienda vivienda : gestor.buscarPorCodigo("D001")) {
            System.out.println(vivienda);
        }
    }
}