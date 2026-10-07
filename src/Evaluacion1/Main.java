package Evaluacion1;

public class Main {

    public static void main(String[] args) {

        GestorViviendas gestor = new GestorViviendas();

        Departamento departamento1 = new Departamento(
                "PROP-D01", 65, 3, 8, false
        );

        Departamento departamento2 = new Departamento(
                "PROP-D02", 48, 2, 3, true
        );

        Casa casa1 = new Casa(
                "PROP-C01", 120, 4, true
        );

        Casa casa2 = new Casa(
                "PROP-C02", 90, 3, false
        );

        departamento1.asignarEstacionamiento();

        gestor.registrarVivienda(departamento1);
        gestor.registrarVivienda(departamento2);
        gestor.registrarVivienda(casa1);
        gestor.registrarVivienda(casa2);

        System.out.println("Busqueda:");

        for (Vivienda vivienda : gestor.buscarPorCodigo("PROP-D01")) {

            System.out.println(vivienda);

            if (vivienda instanceof Departamento) {
                Departamento departamento = (Departamento) vivienda;

                System.out.println("Tipo: Departamento");
                System.out.println("Piso: " + departamento.getNumeroPiso());
                System.out.println("Gasto comun al dia: " + departamento.isGastoComunAlDia());
                System.out.println("Estacionamiento: " + departamento.tieneEstacionamientoAsignado());
            }

            System.out.println("Costo arriendo: " + vivienda.calcularCostoArriendo());
        }

        System.out.println("Listado:");

        for (Vivienda vivienda : gestor.getViviendas()) {
            System.out.println(vivienda);
        }
    }
}