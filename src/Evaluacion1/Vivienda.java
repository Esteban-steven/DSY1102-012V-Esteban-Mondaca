package Evaluacion1;

public class Vivienda {

    private String codigoPropiedad;
    private double superficieM2;
    private int numeroHabitaciones;

    public Vivienda(String codigoPropiedad, double superficieM2, int numeroHabitaciones) {
        setCodigoPropiedad(codigoPropiedad);
        setSuperficieM2(superficieM2);
        setNumeroHabitaciones(numeroHabitaciones);
    }

    public String getCodigoPropiedad() {
        return codigoPropiedad;
    }

    public void setCodigoPropiedad(String codigoPropiedad) {
        if (codigoPropiedad == null || codigoPropiedad.isEmpty()) {
            throw new IllegalArgumentException("Codigo incorrecto");
        }
        this.codigoPropiedad = codigoPropiedad;
    }

    public double getSuperficieM2() {
        return superficieM2;
    }

    public void setSuperficieM2(double superficieM2) {
        if (superficieM2 < 20 || superficieM2 > 500) {
            throw new IllegalArgumentException("Superficie incorrecta");
        }
        this.superficieM2 = superficieM2;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        if (numeroHabitaciones <= 0) {
            throw new IllegalArgumentException("Numero de habitaciones incorrecto");
        }
        this.numeroHabitaciones = numeroHabitaciones;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigoPropiedad + " Superficie: " + superficieM2;
    }

    // En Java los datos tienen tipos como String, double o int.
    // Una clase permite juntar los datos y sus comportamientos.
}