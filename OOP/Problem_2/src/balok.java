public class balok extends menghitungvolume{
    double panjang;
    double lebar;
    double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }


    @Override
    double volume() {
        return (panjang*lebar*tinggi);
    }
}

