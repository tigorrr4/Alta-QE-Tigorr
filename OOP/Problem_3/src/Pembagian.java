public class Pembagian extends Kalkulator{
    double a;
    double b;

    public Pembagian(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double pembagian() {
        return (a / b);
    }
}

