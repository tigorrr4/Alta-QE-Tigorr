public class Pengurangan extends Kalkulator{
    double a;
    double b;

    public Pengurangan(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double pengurangan() {
        return a-b;
    }
}

