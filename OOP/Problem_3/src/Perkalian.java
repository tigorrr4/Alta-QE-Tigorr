public class Perkalian extends Kalkulator{
    double a;
    double b;

    public Perkalian(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double perkalian() {
        return a*b;
    }
}

