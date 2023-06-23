public class Penjumlahan  extends Kalkulator{
    double a;
    double b;

    public Penjumlahan(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double penjumlahan() {
        return a + b;
    }
}

