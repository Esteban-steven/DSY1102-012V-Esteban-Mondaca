public class Ejercicio1 {
    public static void main(String[] args) {
        double celcius = 30;
        double fa = celciusTofa(celcius);
        showMessage(celcius, fa);

        celcius = 55.0;
        fa = celciusTofa(celcius);
        showMessage(celcius, fa);

        celcius = 5.1;
        fa = celciusTofa(celcius);
        showMessage(celcius, fa);



    }
public static double celciusTofa(double celcius){
        return celcius * 9 / 5 +36;

    }
    public static void showMessage(double celcius, double fa){
        System.out.println(celcius + "c° son " + fa + " F°");

    }
}