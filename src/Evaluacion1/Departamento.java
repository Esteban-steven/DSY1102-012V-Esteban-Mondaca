package Evaluacion1;

public class Departamento extends Vivienda {

    private int numeroPiso;
    private boolean gastoComunAlDia;

    public Departamento(String codigoPropiedad, double superficieM2,
                        int numeroHabitaciones, int numeroPiso,
                        boolean gastoComunAlDia) {

        super(codigoPropiedad, superficieM2, numeroHabitaciones);
        this.numeroPiso = numeroPiso;
        this.gastoComunAlDia = gastoComunAlDia;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean isGastoComunAlDia() {
        return gastoComunAlDia;
    }

    public void setGastoComunAlDia(boolean gastoComunAlDia) {
        this.gastoComunAlDia = gastoComunAlDia;
    }

    @Override
    public double calcularCostoArriendo() {
        double costo = 180000;

        if (gastoComunAlDia == false) {
            costo = costo + (costo * 0.15);
        }

        return costo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}