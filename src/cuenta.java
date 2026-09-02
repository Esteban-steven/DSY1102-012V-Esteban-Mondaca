public class cuenta {
    int saldo = 10000;
    public void depositarCuenta(int Monto){
        saldo=saldo+Monto;

    }
        public int getsaldo(){
            return saldo;
    }
    public static void main(String[]args) {
        cuenta cta1 = new cuenta();

        cta1.depositarCuenta(1000);
        cta1.depositarCuenta(3000);
        System.out.println("saldo:" + cta1.getsaldo());
    }
        }


