package Evaluacion1;

import java.util.ArrayList;
import java.util.List;

public class GestorViviendas {

    private List<Vivienda> viviendas = new ArrayList<>();

    public void registrarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
        System.out.println("Vivienda registrada correctamente");
    }

    public List<Vivienda> buscarPorCodigo(String criterio) {

        List<Vivienda> resultado = new ArrayList<>();

        for (Vivienda vivienda : viviendas) {

            if (vivienda.getCodigoPropiedad().equals(criterio)) {
                resultado.add(vivienda);
            }
        }

        return resultado;
    }

    public List<Vivienda> getViviendas() {
        return viviendas;
    }
}