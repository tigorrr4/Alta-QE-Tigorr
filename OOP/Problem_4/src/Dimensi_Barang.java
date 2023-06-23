public class Dimensi_Barang  extends OngkosKirim{
    int panjang;
    int lebar;
    int tinggi;
    int berat;

    public Dimensi_Barang() {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    double totalKapasitas() {
        return panjang * lebar * tinggi;
    }

    @Override
    double hitungBerat() {
        return (double) Math.ceil(berat);
    }
}
