import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            OngkosKirim ongkosKirim = new OngkosKirim();
            Scanner input = new Scanner(System.in);

            // Input dimensi dan berat barang
            System.out.print("Masukkan panjang barang (cm): ");
            double panjang = input.nextInt();

            System.out.print("Masukkan lebar barang (cm): ");
            double lebar = input.nextInt();

            System.out.print("Masukkan tinggi barang (cm): ");
            double tinggi = input.nextInt();

            System.out.print("Masukkan berat barang (kg): ");
            double berat = input.nextInt();

            Harga_Ongkos_kirim  hargaOngkosKirim= new Harga_Ongkos_kirim();
            double harga = hargaOngkosKirim.hitungHargaOngkir();
            System.out.println("Harga pengiriman: Rp " + harga);
        }
    }

