public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Penjumlahan penjumlahan = new Penjumlahan(3,4);
        Pengurangan pengurangan = new Pengurangan(15,4);
        Perkalian perkalian = new Perkalian(10,10);
        Pembagian pembagian = new Pembagian(12,3);

        System.out.println(" Hasil Penjumlahan : " + penjumlahan.penjumlahan());
        System.out.println(" Hasil Pengurangan : " + pengurangan.pengurangan());
        System.out.println(" Hasil Perkalian : " + perkalian.perkalian());
        System.out.println(" Hasil Pembagian : " + pembagian.pembagian());
    }

}